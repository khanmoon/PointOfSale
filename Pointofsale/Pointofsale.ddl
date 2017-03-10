ALTER TABLE Line DROP FOREIGN KEY FKLine635251;
ALTER TABLE Line DROP FOREIGN KEY FKLine355421;
ALTER TABLE Payment DROP FOREIGN KEY FKPayment751135;
ALTER TABLE Payment DROP FOREIGN KEY FKPayment323574;
ALTER TABLE Invoice DROP FOREIGN KEY FKInvoice191762;
ALTER TABLE Product DROP FOREIGN KEY FKProduct204805;
ALTER TABLE Staff DROP FOREIGN KEY FKStaff836767;
ALTER TABLE Invoice DROP FOREIGN KEY FKInvoice402305;
DROP TABLE IF EXISTS Staff;
DROP TABLE IF EXISTS Invoice;
DROP TABLE IF EXISTS Line;
DROP TABLE IF EXISTS Product;
DROP TABLE IF EXISTS Payment;
DROP TABLE IF EXISTS Payment_Method;
DROP TABLE IF EXISTS Catagory;
DROP TABLE IF EXISTS Staff_Type;
DROP TABLE IF EXISTS Customer;
CREATE TABLE Staff (S_Id int(10) NOT NULL AUTO_INCREMENT, S_Name varchar(45), S_Password varchar(45), S_UserName varchar(45), ST_Id int(11) NOT NULL, PRIMARY KEY (S_Id)) ENGINE=InnoDB;
CREATE TABLE Invoice (INV_Number int(50) NOT NULL AUTO_INCREMENT, CUST_Id int(11) NOT NULL, CUST_Name varchar(45), INV_Date int(11), INV_Subtotal int(50), INV_Tax int(50), INV_Total int(100), `Column` int(11), StaffS_Id int(10) NOT NULL, PRIMARY KEY (INV_Number)) ENGINE=InnoDB;
CREATE TABLE Line (Line_Number int(11) NOT NULL AUTO_INCREMENT, PROD_Code int(11) NOT NULL, INV_Number int(50) NOT NULL, PRIMARY KEY (Line_Number)) ENGINE=InnoDB;
CREATE TABLE Product (PROD_Code int(11) NOT NULL AUTO_INCREMENT, PROD_Name varchar(11), PROD_Catagory int(11), PROD_QOH int(50), PROD_MIN int(11), PROD_Price int(11), CAT_Code int(11) NOT NULL, PRIMARY KEY (PROD_Code)) ENGINE=InnoDB;
CREATE TABLE Payment (PAYMENT_Number int(11) NOT NULL AUTO_INCREMENT, INV_Number int(50) NOT NULL, PAY_Id int(11) NOT NULL, PRIMARY KEY (PAYMENT_Number)) ENGINE=InnoDB;
CREATE TABLE Payment_Method (PAY_Id int(11) NOT NULL AUTO_INCREMENT, PAY_Type varchar(20), PRIMARY KEY (PAY_Id)) ENGINE=InnoDB;
CREATE TABLE Catagory (CAT_Code int(11) NOT NULL AUTO_INCREMENT, CAT_Name varchar(50), PRIMARY KEY (CAT_Code)) ENGINE=InnoDB;
CREATE TABLE Staff_Type (ST_Id int(11) NOT NULL AUTO_INCREMENT, ST_Type varchar(45), PRIMARY KEY (ST_Id)) ENGINE=InnoDB;
CREATE TABLE Customer (CUST_Id int(11) NOT NULL AUTO_INCREMENT, CUST_Name varchar(45), PRIMARY KEY (CUST_Id)) ENGINE=InnoDB;
ALTER TABLE Line ADD INDEX FKLine635251 (PROD_Code), ADD CONSTRAINT FKLine635251 FOREIGN KEY (PROD_Code) REFERENCES Product (PROD_Code);
ALTER TABLE Line ADD INDEX FKLine355421 (INV_Number), ADD CONSTRAINT FKLine355421 FOREIGN KEY (INV_Number) REFERENCES Invoice (INV_Number);
ALTER TABLE Payment ADD INDEX FKPayment751135 (INV_Number), ADD CONSTRAINT FKPayment751135 FOREIGN KEY (INV_Number) REFERENCES Invoice (INV_Number);
ALTER TABLE Payment ADD INDEX FKPayment323574 (PAY_Id), ADD CONSTRAINT FKPayment323574 FOREIGN KEY (PAY_Id) REFERENCES Payment_Method (PAY_Id);
ALTER TABLE Invoice ADD INDEX FKInvoice191762 (StaffS_Id), ADD CONSTRAINT FKInvoice191762 FOREIGN KEY (StaffS_Id) REFERENCES Staff (S_Id);
ALTER TABLE Product ADD INDEX FKProduct204805 (CAT_Code), ADD CONSTRAINT FKProduct204805 FOREIGN KEY (CAT_Code) REFERENCES Catagory (CAT_Code);
ALTER TABLE Staff ADD INDEX FKStaff836767 (ST_Id), ADD CONSTRAINT FKStaff836767 FOREIGN KEY (ST_Id) REFERENCES Staff_Type (ST_Id);
ALTER TABLE Invoice ADD INDEX FKInvoice402305 (CUST_Id), ADD CONSTRAINT FKInvoice402305 FOREIGN KEY (CUST_Id) REFERENCES Customer (CUST_Id);
INSERT INTO Staff(S_Id, S_Name, S_Password, S_UserName, ST_Id) VALUES (1, 'Mansoor', '123456', null, null);