DROP TABLE IF EXISTS book;
DROP TABLE IF EXISTS author;
DROP TABLE IF EXISTS author_seq;
DROP TABLE IF EXISTS book_seq;

create table author (
    id bigint not null auto_increment,
    first_name varchar(255),
    last_name varchar(255),
    phone_no varchar(255),
    primary key (id)
);

create table author_seq (
    next_val bigint
);

INSERT INTO author_seq VALUES (1);

create table book (
    id bigint not null auto_increment,
    isbn varchar(255),
    publisher varchar(255),
    title varchar(255),
    primary key (id)
);

create table book_seq (
    next_val bigint
);

INSERT INTO book_seq VALUES (1);
