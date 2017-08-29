CREATE TABLE category (

	id INT NOT NULL AUTO_INCREMENT,
	name VARCHAR(255) NOT NULL,
	description VARCHAR(255) NOT NULL,
	imageurl VARCHAR(255) NOT NULL,
	active boolean,

	CONSTRAINT pk_cartegory PRIMARY KEY (id)
);

insert into category (name, description, imageurl, active)
values ('iphone', 'iphone', 'iphone.jpg', true);

insert into category (name, description, imageurl, active)
values ('samsung', 'samsung', 'samsung.jpg', true);

insert into category (name, description, imageurl, active)
values ('nokia', 'nokia', 'nokia.jpg', true);

insert into category (name, description, imageurl, active)
values ('xiaomi', 'xiaomi', 'xiaomi.jpg', true);

insert into category (name, description, imageurl, active)
values ('iphone', 'iphone', 'iphone.jpg', true);

insert into category (name, description, imageurl, active)
values ('xperia', 'xperia', 'xperia.jpg', true);

CREATE TABLE userdetail (

	id INT NOT NULL AUTO_INCREMENT,
	firstname VARCHAR(255) NOT NULL,
	lastname VARCHAR(255) NOT NULL,
	role VARCHAR(255) NOT NULL,
	enabled BOOLEAN,
	password VARCHAR(255) NOT NULL,
	email VARCHAR(255) NOT NULL,
	contactnumber VARCHAR(255) NOT NULL,
	
	CONSTRAINT pk_userdetail PRIMARY KEY (id)
	
);

insert into userdetail (firstname, lastname, role, enabled, password,
email, contactnumber) values ('Ahmad', 'Bayhaqi', 'SUPLIER', true, 'suplier', 
'dickanirwansyah@gmail.com', '087885616532');

insert into userdetail (firstname, lastname, role, enabled, password,
email, contactnumber) values ('Muhammad', 'dicka', 'ADMIN', true, 'admin', 
'bayhaqi@gmail.com', '087885616532');

insert into userdetail (firstname, lastname, role, enabled, password,
email, contactnumber) values ('Furqon', 'Ronald', 'SUPLIER', true, 'suplier', 
'ronald@gmail.com', '087885616532');

CREATE TABLE product (

	id INT AUTO_INCREMENT,
	code VARCHAR(255) NOT NULL,
	name VARCHAR(255) NOT NULL,
	brand VARCHAR(255) NOT NULL,
	description VARCHAR(255) NOT NULL,
	unitprice DECIMAL (10, 2),
	quantity INT NOT NULL,
	active BOOLEAN,
	category_id INT NOT NULL,
	userdetail_id INT NOT NULL,
	purchases INT DEFAULT 0,
	views INT DEFAULT 0,
	
	CONSTRAINT pk_idproduct PRIMARY KEY (id),
	CONSTRAINT fk_idcategory FOREIGN KEY (category_id) REFERENCES category(id),
	CONSTRAINT fk_iduserdetail FOREIGN KEY (userdetail_id) REFERENCES userdetail(id)

);

INSERT INTO product (code, name, brand, description, unitprice, quantity, 
active, category_id, userdetail_id) VALUES ('PRDPQR124WGTX', 'Iphone 4G', 
'iphone', 'iphone is the best', 500000, 8, true, 1, 2);

INSERT INTO product (code, name, brand, description, unitprice, quantity, 
active, category_id, userdetail_id) VALUES ('PRDPQR124WGTY', 'Iphone 5G', 
'iphone', 'iphone is the best', 600000, 4, true, 1, 2);

INSERT INTO product (code, name, brand, description, unitprice, quantity, 
active, category_id, userdetail_id) VALUES ('PRDPQR127WUTY', 'Galaxy Note 5', 
'samsung', 'samsung is the best', 80000, 6, true, 2, 2);



