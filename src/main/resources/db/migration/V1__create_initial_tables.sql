CREATE TABLE stadiums (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    city VARCHAR(255) NOT NULL,
    capacity INTEGER,
    url_img VARCHAR(255)
);

CREATE TABLE clubs (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    founded DATE NOT NULL,
    url_img VARCHAR(255),
    stadium_id BIGINT,
    CONSTRAINT fk_stadium_club FOREIGN KEY (stadium_id) REFERENCES stadiums(id)
);

CREATE TABLE players (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    position VARCHAR(255),
    shirt_number INTEGER,
    url_img VARCHAR(255),
    club_id BIGINT,
    CONSTRAINT fk_club_player FOREIGN KEY (club_id) REFERENCES clubs(id)
);