Below URL will open H2 console

http://localhost:8080/h2-console

We can connect and check Database values however since it is H2 which is in memory database
Data will reset after every application restart.

Below URL is to get all persons from H2 database

http://localhost:8080/persons

Below query to execute on H2 console

SELECT * FROM PERSON ;

INSERT INTO PERSON (person_ID , persON_CITY , persON_NAME ) VALUES (1, 'Mumbai', 'Abhishek');
INSERT INTO PERSON (person_ID , persON_CITY , persON_NAME ) VALUES (2, 'Delhi', 'Aryan');

