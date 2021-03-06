CREATE TABLE user (
	ID			INT NOT NULL AUTO_INCREMENT,
	UserName 		NVARCHAR(300) NOT NULL,
	UserPassword		NVARCHAR(300) NOT NULL,
	PRIMARY KEY(ID)
);

CREATE TABLE package (
	ID 			INT NOT NULL AUTO_INCREMENT,
	PackageName		NVARCHAR(300) NOT NULL,
	Description     	NVARCHAR(300),
	PackageAmount		INT NOT NULL,
	PRIMARY KEY(ID)
);

CREATE TABLE payment (
	ID			INT NOT NULL AUTO_INCREMENT,
	UserID			INT NOT NULL,
    	PackageID		INT NOT NULL,
    	PaymentAmount		INT NOT NULL,
    	PRIMARY KEY(ID)
);

