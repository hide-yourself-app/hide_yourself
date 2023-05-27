CREATE TABLE account (
     user_id SERIAL PRIMARY KEY,
     username VARCHAR(50) UNIQUE NOT NULL,
     password VARCHAR(255) NOT NULL,
     email VARCHAR(255) NOT NULL,
     created_on TIMESTAMP NOT NULL,
     last_login TIMESTAMP NOT NULL
);

CREATE TABLE user_website (
      user_id INT PRIMARY KEY,
      website VARCHAR(255) UNIQUE NOT NULL,
      website_login_email VARCHAR(255) UNIQUE NOT NULL,
      website_login_password VARCHAR(255) NOT NULL,
      FOREIGN KEY (user_id)
          REFERENCES account (user_id)
);