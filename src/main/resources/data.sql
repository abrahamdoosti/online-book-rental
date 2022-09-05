INSERT INTO TBL_USER (first_name, last_name, email, birthdate,created_ts) VALUES
  ('Lokesh', 'Gupta', 'abc@gmail.com', parsedatetime('25-12-1980','dd-MM-yyyy'), CURRENT_TIMESTAMP),
  ('Deja', 'Vu', 'xyz@email.com', parsedatetime('25-12-1985', 'dd-MM-yyyy'), CURRENT_TIMESTAMP),
  ('Caption', 'America', 'cap@marvel.com', parsedatetime('25-12-1996', 'dd-MM-yyyy'), CURRENT_TIMESTAMP);
  
  
  INSERT INTO TBL_BOOK (book_title, book_author, isbn_number, is_available, release_date,created_ts) VALUES
  ('Lord of the Flies', ' William Golding', '0399501487', TRUE, parsedatetime('01-01-2003','dd-MM-yyyy'), CURRENT_TIMESTAMP),
  ('Harry Potter and the Deathly Hallows (Book 7)', 'Rowling, J. K.', '0545010225', TRUE, parsedatetime('01-01-2007', 'dd-MM-yyyy'), CURRENT_TIMESTAMP),
  ('Sidney Sheldon''s Mistress of the Game', ' SIDNEY SHELDON', '0007340567', TRUE, parsedatetime('01-01-2009', 'dd-MM-yyyy'), CURRENT_TIMESTAMP);
  
  
  
  
 /* INSERT INTO TBL_USER (first_name, last_name, email, birthdate,created_ts) VALUES
  if we use timezone, h2 converts it to UTC and store it.
  When we retrieve date time through h2-console h2 converts that dattime to our timezone.
  
  ('Lokesh', 'Gupta', 'abc@gmail.com', parsedatetime('25-12-1980 18:20:45.345-0600', 'dd-MM-yyyy HH:mm:ss.SSSZ'), CURRENT_TIMESTAMP),
  ('Deja', 'Vu', 'xyz@email.com', parsedatetime('25-12-1985 18:20:45.345-0500', 'dd-MM-yyyy HH:mm:ss.SSSZ'), CURRENT_TIMESTAMP),
  ('Caption', 'America', 'cap@marvel.com', parsedatetime('25-12-1996 18:20:45.345-0500', 'dd-MM-yyyy HH:mm:ss.SSSZ'), CURRENT_TIMESTAMP);*/