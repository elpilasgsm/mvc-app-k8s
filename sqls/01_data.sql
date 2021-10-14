CREATE SCHEMA kuber;

use kuber;

create table product
(
    ID int auto_increment,
    NAME VARCHAR(32) not null,
    constraint product_pk
        primary key (ID)
);

INSERT INTO product (ID, NAME) VALUES (1, 'Mars');
INSERT INTO product (ID, NAME) VALUES (2, 'Snikers');
INSERT INTO product (ID, NAME) VALUES (3, 'Baunty');
INSERT INTO product (ID, NAME) VALUES (4, 'Twix');