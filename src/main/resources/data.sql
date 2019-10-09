CREATE TABLE users (
  username VARCHAR(50) NOT NULL,
  password VARCHAR(100) NOT NULL,
  enabled INT NOT NULL DEFAULT 1,
  PRIMARY KEY (username)
);

CREATE TABLE authorities (
  username VARCHAR(50) NOT NULL,
  authority VARCHAR(50) NOT NULL,
  FOREIGN KEY (username) REFERENCES users(username)
);

CREATE UNIQUE INDEX ix_auth_username on authorities (username,authority);

COMMIT;

INSERT INTO users VALUES ('Nini', '$2a$10$XT.U8ifnTw5l4g1Jh2tx/.kYlmwNWfuH6LUiHmQKZeqGS/YZOAvYK', 1);
INSERT INTO authorities VALUES ('Nini', 'ROLE_admin');