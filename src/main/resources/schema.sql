drop table if exists users_roles;
drop table if exists users;
drop table if exists roles;

CREATE TABLE users (
                         id int NOT NULL AUTO_INCREMENT,
                         username varchar(45) NOT NULL,
                         password varchar(64) NOT NULL,
                         email varchar(45) NOT NULL,
                         first_name varchar(45) NOT NULL,
                         last_name varchar(45),
                         enabled boolean DEFAULT false,
                         PRIMARY KEY (id)
);

CREATE TABLE roles (
                         id int NOT NULL AUTO_INCREMENT,
                         name varchar(45) NOT NULL,
                         PRIMARY KEY (id)
);

CREATE TABLE users_roles (
                               user_id int NOT NULL,
                               role_id int NOT NULL,
                               PRIMARY KEY (user_id,role_id),
  CONSTRAINT role_fk FOREIGN KEY (role_id) REFERENCES roles (id),
  CONSTRAINT user_fk FOREIGN KEY (user_id) REFERENCES users (id)
);


