CREATE TABLE cities (
	id serial primary key,
	name varchar
);

CREATE TABLE hotel (
	id serial primary key,
	name varchar,
	phone_numb varchar,
	cities_id int references cities(id)
);

insert into cities(name) values('Москва');
insert into cities(name) values('Санкт-Петербург');
insert into cities(name) values('Новосибирск');
insert into cities(name) values('Тула');
insert into cities(name) values('Воронеж');

insert into hotel(name, phone_numb, cities_id) values('Салют', '+7(495)2349252', 1);
insert into hotel(name, phone_numb, cities_id) values('Парк Тауэр', '+7(495)7829000', 1);
insert into hotel(name, phone_numb, cities_id) values('Президент-Отель', '+7(499)325-56-82', 1);
insert into hotel(name, phone_numb, cities_id) values('Ibis', '+7(495)660-75-00', 1);

insert into hotel(name, phone_numb, cities_id) values('Domina', '+7(812)240-74-10', 2);
insert into hotel(name, phone_numb, cities_id) values('Rossi Boutique Hotel', '+7(812)240-92-47', 2);
insert into hotel(name, phone_numb, cities_id) values('Отель Station L1', '+7(812)407-38-46', 2);
insert into hotel(name, phone_numb, cities_id) values('Park Inn by Radisson', '+7(812)329-26-26', 2);

insert into hotel(name, phone_numb, cities_id) values('Миротель', '+7(383)388-61-20', 3);
insert into hotel(name, phone_numb, cities_id) values('Аврора', '+7(383)267-08-30', 3);
insert into hotel(name, phone_numb, cities_id) values('Маринс Парк Отель', '8(800)600-88-88', 3);
insert into hotel(name, phone_numb, cities_id) values('AZIMUT', '+7(383)217-69-70', 3);

insert into hotel(name, phone_numb, cities_id) values('Bon Voyage', '+7(920)777-72-77', 4);
insert into hotel(name, phone_numb, cities_id) values('Key Hotel', '+7(4872)52-25-25', 4);

insert into hotel(name, phone_numb, cities_id) values('Петровский', '+7(473)205-25-22', 5);
insert into hotel(name, phone_numb, cities_id) values('Фараон', '+7(473)227-27-47', 5);