import React from "react";
import "./_login.scss";
import { IonIcon } from "@ionic/react";
import { Link } from 'react-router-dom';
import {
  lockClosedOutline,
  mailOutline,
  closeOutline,
  personOutline,
} from "ionicons/icons";

export default function Login() {
  return (
    <div className="wrapper">
      <div className="form-box login">
        <h2>Login</h2>
        <form action="#">
          <div className="input-box">
            <span className="icon">
              <IonIcon icon={mailOutline} />
            </span>
            <input type="email" required />
            <label>Email</label>
          </div>
          <div className="input-box">
            <span className="icon">
              <IonIcon icon={lockClosedOutline} />
            </span>
            <input type="password" required />
            <label>Password</label>
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
