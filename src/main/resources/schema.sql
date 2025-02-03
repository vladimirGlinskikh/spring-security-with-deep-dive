CREATE TABLE IF NOT EXISTS users
(
    id       SERIAL      NOT NULL PRIMARY KEY,
    username VARCHAR(45) NOT NULL,
    password VARCHAR(45) NOT NULL,
    enabled  INT         NOT NULL
);

CREATE TABLE IF NOT EXISTS authorities
(
    id        SERIAL      NOT NULL PRIMARY KEY,
    username  VARCHAR(45) NOT NULL,
    authority VARCHAR(45) NOT NULL
);