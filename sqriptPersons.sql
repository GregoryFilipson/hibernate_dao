create schema home_work;

create table home_work.PERSONS
(
    name           varchar(255) primary key,
    surname        varchar(255) primary key,
    age            int check ( age > 0 ) primary key,
    phone_number   varchar(255),
    city_of_living varchar(255) not null default 'неизвестный город'
);

INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Роман', 'Ромашкин', 22, 89191340000, 'Moskow');
INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Иван', 'Калабин', 55, 89111345600, 'Voronezh');
INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Ира', 'Савушкина', 13, 89003006799, 'Khabarovsk');
INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Семен', 'Михеев', 62, 89211098721, 'Moskow');
INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Оля', 'Приспешкина', 37, 89081437755, 'Moskow');
INSERT INTO persons (name, surname, age, phone_number, city_of_living)
VALUES ('Анатоий', 'Нубарев', 19, 89515223409, 'Orel');

ALTER TABLE persons ADD `id` INT NOT NULL AUTO_INCREMENT PRIMARY KEY
