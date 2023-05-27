import React from "react";
import "./_header.scss";

export default function Header() {
  return (
    <div className="header">
      <h2 className="logo">Logo</h2>
      <nav className="navigation">
        <a href="#">Home</a>
        <a href="#">About</a>
        <a href="#">Services</a>
        <a href="#">Contact</a>
        <button className="btnLogin-popup">Login</button>
      </nav>
    </div>
  );
}
