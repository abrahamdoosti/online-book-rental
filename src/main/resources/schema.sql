
DROP TABLE IF EXISTS TBL_USER;

CREATE TABLE TBL_USER (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL,
  birthdate DATE DEFAULT NULL,
  created_ts TIMESTAMP DEFAULT NULL
);

DROP TABLE IF EXISTS TBL_BOOK;

CREATE TABLE TBL_BOOK (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  book_title VARCHAR(250) NOT NULL,
  book_author VARCHAR(250) NOT NULL,
  isbn_number VARCHAR(250),
  is_available BOOLEAN, 
  release_date DATE,
  created_ts TIMESTAMP
);