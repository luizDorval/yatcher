CREATE DATABASE rental_agency;
USE rental_agency;
CREATE TABLE yacht(
				idyacht BIGINT AUTO_INCREMENT,
				imo INT(7) NOT NULL,
				model VARCHAR(30) NOT NULL, 
				color VARCHAR(30) NOT NULL, 
				type ENUM('A vela','Motorizado') NOT NULL, 
				material VARCHAR(30) NOT NULL, 
				width DOUBLE NOT NULL, 
				height DOUBLE NOT NULL, 
				weight DOUBLE NOT NULL, 
				PRIMARY KEY(idyacht));
CREATE TABLE provider(
					idprovider BIGINT AUTO_INCREMENT, 
					name VARCHAR(30) NOT NULL,
					cpf CHAR(11) UNIQUE NOT NULL,                      
					email VARCHAR(60) NOT NULL,         
					phoneNumber VARCHAR(20) NOT NULL,
					age INT NOT NULL, PRIMARY KEY(idprovider));