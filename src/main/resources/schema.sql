CREATE TABLE IF NOT EXISTS REGION(
    ID SERIAL PRIMARY KEY,
    NAME VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS SALES(
    ID SERIAL PRIMARY KEY,
    NAME VARCHAR(255),
    REGION_ID INT,
    CONSTRAINT REGION_ID FOREIGN KEY (REGION_ID)
    REFERENCES PUBLIC.REGION (id) MATCH SIMPLE
    ON UPDATE NO ACTION
    ON DELETE NO ACTION
);