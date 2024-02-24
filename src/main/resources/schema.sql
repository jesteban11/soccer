CREATE TABLE IF NOT EXISTS country (
    uuid UUID DEFAULT UUID() PRIMARY KEY,
    name varchar(255),
    alpha_code2 varchar(2),
    alpha_code3 varchar(3)
);


CREATE TABLE IF NOT EXISTS league (
    uuid UUID DEFAULT UUID() PRIMARY KEY,
    name varchar(255),
    country_uuid UUID
    REFERENCES country(uuid)
);

CREATE TABLE IF NOT EXISTS team (
    uuid UUID DEFAULT UUID() PRIMARY KEY,
    name varchar(255),
    emblem BINARY LARGE OBJECT,
    league_uuid UUID
    REFERENCES league(uuid)
);
