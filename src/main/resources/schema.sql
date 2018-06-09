DROP TABLE IF EXISTS employee;
CREATE TABLE employee (
PRIMARY KEY (id),
id BIGSERIAL,
name VARCHAR(30),
surname VARCHAR(30),
position VARCHAR(30),
salary NUMBER,
birthdate DATE,
address VARCHAR(70)
);
