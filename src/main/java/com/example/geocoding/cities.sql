CREATE TABLE cities (
	id serial primary key,
	name varchar
);

CREATE TABLE hotel (
	id serial primary key,
	name varchar,
	phone_numb varchar,
	cities_id int references cities(id),
	stars int
);

insert into cities(name) values('Москва');
insert into cities(name) values('Санкт-Петербург');
insert into cities(name) values('Новосибирск');
insert into cities(name) values('Тула');
insert into cities(name) values('Воронеж');

insert into hotel(name, phone_numb, cities_id, stars) values('Салют', '+7(495)2349252', 1, 2);
insert into hotel(name, phone_numb, cities_id, stars) values('Парк Тауэр', '+7(495)7829000', 1, 3);
insert into hotel(name, phone_numb, cities_id, stars) values('Президент-Отель', '+7(499)325-56-82', 1, 5);
insert into hotel(name, phone_numb, cities_id, stars) values('Ibis', '+7(495)660-75-00', 1, 2);

insert into hotel(name, phone_numb, cities_id, stars) values('Domina', '+7(812)240-74-10', 2, 3);
insert into hotel(name, phone_numb, cities_id, stars) values('Rossi Boutique Hotel', '+7(812)240-92-47', 2, 4);
insert into hotel(name, phone_numb, cities_id, stars) values('Отель Station L1', '+7(812)407-38-46', 2, 1);
insert into hotel(name, phone_numb, cities_id, stars) values('Park Inn by Radisson', '+7(812)329-26-26', 2, 5);

insert into hotel(name, phone_numb, cities_id, stars) values('Миротель', '+7(383)388-61-20', 3, 3);
insert into hotel(name, phone_numb, cities_id, stars) values('Аврора', '+7(383)267-08-30', 3, 2);
insert into hotel(name, phone_numb, cities_id, stars) values('Маринс Парк Отель', '8(800)600-88-88', 3, 4);
insert into hotel(name, phone_numb, cities_id, stars) values('AZIMUT', '+7(383)217-69-70', 3, 1);

insert into hotel(name, phone_numb, cities_id, stars) values('Bon Voyage', '+7(920)777-72-77', 4, 3);
insert into hotel(name, phone_numb, cities_id, stars) values('Key Hotel', '+7(4872)52-25-25', 4, 2);

insert into hotel(name, phone_numb, cities_id, stars) values('Петровский', '+7(473)205-25-22', 5, 1);
insert into hotel(name, phone_numb, cities_id, stars) values('Фараон', '+7(473)227-27-47', 5, 2);