import React from "react";
import "./_login.scss";
import { IonIcon } from "@ionic/react";
import { Link, useNavigate } from "react-router-dom";
import { useFormik } from "formik";
import * as Yup from "yup";
import { lockClosedOutline, mailOutline } from "ionicons/icons";

export default function Login() {
  const navigate = useNavigate();

  let validationSchema = Yup.object().shape({
    email: Yup.string()
      .email("Invalid email format")
      .required("Email is required"),
    password: Yup.string()
      .min(6, "Password must be at least 6 characters")
      .required("Password is required"),
  });

  const formik = useFormik({
    initialValues: {
      email: "",
      password: "",
    },
    validationSchema: validationSchema,
    onSubmit: async (values) => {
      const { password2, ...formData } = values;
      console.log(formData);
      formik.resetForm();
      navigate("/");
    },
  });

  return (
    <div className="wrapper">
      <div className="form-box login">
        <h2>Login</h2>
        <form onSubmit={formik.handleSubmit}>
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
          <div className="remember-forgot">
            <label>
              <input type="checkbox" />
              Remember me
            </label>
            <a href="#">Forgot Password?</a>
          </div>
          <button type="submit" className="btn">
            Login
          </button>
          <div className="login-register">
            <p>
              Don't have an account?
              <Link to="register" className="register-link">
                Register
              </Link>
            </p>
          </div>
        </form>
      </div>
    </div>
  );
}
