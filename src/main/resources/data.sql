INSERT INTO roles (name) VALUES ('GUEST');
INSERT INTO roles (name) VALUES ('USER');
INSERT INTO roles (name) VALUES ('CREATOR');
INSERT INTO roles (name) VALUES ('EDITOR');
INSERT INTO roles (name) VALUES ('ADMIN');
INSERT INTO users (username, password, email, first_name,last_name, enabled) VALUES ('admin', '$2a$10$w5FsyQK4i9/Wiht5116L1OLFDaDGg8uUVCHZyJqV5C.lEHyTuGIM6', 'john@gmail.com','John', 'Doe', true);
INSERT INTO users (username, password, email, first_name,last_name, enabled) VALUES ('guest', '$2a$10$ba06zfMY56N9m4xv5zDjhOOfKj5zG.JNejpG5BvFP8vcQU6pdvhlW','petrov@gmail.com', 'Петр', 'Петров', true);
INSERT INTO users_roles (user_id, role_id) VALUES (1, 5); -- user admin has role ADMIN
INSERT INTO users_roles (user_id, role_id) VALUES (2, 1); -- user guest has role GUEST