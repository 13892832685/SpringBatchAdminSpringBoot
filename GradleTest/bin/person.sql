use grp;
DROP TABLE IF EXISTS person;

CREATE TABLE person  (
    person_id BIGINT auto_increment PRIMARY KEY,
    first_name VARCHAR(20),
    last_name VARCHAR(20)
);