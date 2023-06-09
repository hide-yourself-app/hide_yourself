import React from "react";
import "./_regiser.scss";
import { IonIcon } from "@ionic/react";
import { Link, useNavigate } from "react-router-dom";
import { useFormik } from "formik";
import * as Yup from "yup";
import { lockClosedOutline, mailOutline, personOutline } from "ionicons/icons";

export default function Register() {
  const navigate = useNavigate();

  let validationSchema = Yup.object().shape({
    username: Yup.string().required("Username is required"),
    email: Yup.string()
      .email("Invalid email format")
      .required("Email is required"),
    password: Yup.string()
      .min(6, "Password must be at least 6 characters")
      .required("Password is required"),
    confirmPassword: Yup.string()
      .oneOf([Yup.ref("password"), null], "Password must match")
      .required("Confirm password is required"),
  });

  const formik = useFormik({
    initialValues: {
      username: "",
      email: "",
      password: "",
      confirmPassword: "",
    },
    validationSchema: validationSchema,
    onSubmit: async (values) => {
      const { password2, ...formData } = values;
      console.log(password2);
      console.log(formData);
      formik.resetForm();
      navigate("/");
    },
  });

  return (
    <div className="wrapper">
      <div className="form-box login">
        <h2>Registration</h2>
        <form onSubmit={formik.handleSubmit}>
          <div className="input-box">
            <span className="icon">
              <IonIcon icon={personOutline} />
            </span>
            <input
              name="username"
              type="text"
              onChange={formik.handleChange("username")}
              required
            />
            <label>Username</label>
            <div className="error">
              {formik.touched.username && formik.errors.username ? (
                <div>{formik.errors.username}</div>
              ) : null}
            </div>
          </div>
          <div className="input-box">
            <span className="icon">
              <IonIcon icon={mailOutline} />
            </span>
            <input
              name="email"
              type="email"
              onChange={formik.handleChange("email")}
              required
            />
            <label>Email</label>
            <div className="error">
              {formik.touched.email && formik.errors.email ? (
                <div>{formik.errors.email}</div>
              ) : null}
            </div>
          </div>
          <div className="input-box">
            <span className="icon">
              <IonIcon icon={lockClosedOutline} />
            </span>
            <input
              name="password"
              type="password"
              onChange={formik.handleChange("password")}
              required
            />
            <label>Password</label>
            <div className="error">
              {formik.touched.password && formik.errors.password ? (
                <div>{formik.errors.password}</div>
              ) : null}
            </div>
          </div>
          <div className="input-box">
            <span className="icon">
              <IonIcon icon={lockClosedOutline} />
            </span>
            <input
              name="confirmPassword"
              type="password"
              onChange={formik.handleChange("confirmPassword")}
              required
            />
            <label>Confirm Password</label>
            <div className="error">
              {formik.touched.confirmPassword &&
              formik.errors.confirmPassword ? (
                <div>{formik.errors.confirmPassword}</div>
              ) : null}
            </div>
          </div>

          <div className="remember-forgot">
            <label>
              <input type="checkbox" />I agree to the terms & conditions
            </label>
          </div>
          <button type="submit" className="btn">
            Register
          </button>
          <div className="login-register">
            <p>
              Already have an account?
              <Link to="/" className="login-link">
                Login
              </Link>
            </p>
          </div>
        </form>
      </div>
    </div>
  );
}
