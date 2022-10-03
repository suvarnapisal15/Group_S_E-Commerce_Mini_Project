# Group_S_E-Commerce_Mini_Project
Database Table Creation Query

----------------------------------------------------------------
create table userRegistration (
				uId int primary key not null auto_increment,
                userName varchar(100) not null,
                password varchar(100) not null,
                firstName varchar(50) not null,
                lastName varchar(50) not null,
                phoneNo long not null,
                email varchar(100) not null,
                address  varchar(255) not null,
                city varchar(100)
                ) ;
----------------------------------------------------
create table adminregistration (
uId int primary key not null auto_increment,
userName varchar(100) not null,
password varchar(100) not null,
firstName varchar(50) not null,
lastName varchar(50) not null,
phoneNo long not null,
email varchar(100) not null,
address varchar(255) not null,
city varchar(100));
---------------------------------------------------

create table Products (
productId int primary key not null auto_increment,
productName varchar(100) not null,
description varchar(255) not null
);

----------------------------------------------------
create table ProductSubCatagory (
 productId int not null,
pSubCatagoryId int not null auto_increment primary key,
pSubCatagory varchar(255) not null,
pPrice int not null,
pQuantity int not null,
foreign key (productId) references Products(productId)
 ); 
----------------------------------------------

CREATE TABLE userProductList(
 upId int primary key not null auto_increment,
 uid  int not null,
 userName varchar (100) not null,
 passward varchar (100) not null,
 firstName varchar(50) not null,
 lastName varchar(50) not null,
 phoneNo long not null ,
 productId  int(100) not null,
 pName varchar(255) not null,
 pDescription varchar(255) not null,
 pSubCatagoryId int not null,
 pSubCatagory varchar (255) not null,
 pPrice int not null,
 pQuantity int (50) not null);
---------------------------------------------
create table userProductAmount (
uPaId int primary key not null auto_increment,
uId int not null,
productId int not null,
upId int not null,
pPrise int not null,
pQuantity int(50),
totalPrise int not null);






