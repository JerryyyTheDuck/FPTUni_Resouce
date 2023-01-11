use master
go
drop database CompanyDB
go
-- Tạo mới 1 CSDL đặt tên 'CompanyDB' -> Lưu mặc định tại thư mục cài đặt
create database CompanyDB
go
use CompanyDB
go

-- Tạo bảng Department
create table Department
(
	DeptNumber char(20) not null,
	DeptName nvarchar(50) not null,
	[Location] nvarchar(100),
	NumberOfEmployees int,
	primary key(DeptNumber,DeptName)
)

go
-- Tạo bảng Project
create table Project
(
	ProNumber char(20) not null,
	ProName nvarchar(100) not null,
	[Location] nvarchar(100),
	DeptNumber char(20) not null,
	DeptName nvarchar(50) not null,
	primary key(ProNumber, ProName),
	constraint FK_Project_Department foreign key(DeptNumber,DeptName) 
	references Department(DeptNumber,DeptName)
)
go
-- Tạo bảng Employee
create table Employee
(
	Ssn int not null primary key identity(1,1),
	FName nvarchar(20),
	MName nvarchar(20),
	LName nvarchar(20),
	Bdate date,			-- 'MM/dd/yyyy'
	Sex bit,			-- true | false; 1 | 0
	[Address] nvarchar(100),
	Salary decimal(10,1),
	StartDate datetime,	-- 'MM/dd/yyyy hh:mm:ss'
	Supervisor int foreign key references Employee(Ssn),
	DeptNumber char(20) not null,
	DeptName nvarchar(50) not null,
	constraint FK_Employee_Department foreign key(DeptNumber,DeptName) 
	references Department(DeptNumber,DeptName)
)
go
-- Tạo bảng ProjectDetails
create table ProjectDetails
(
	ProNumber char(20) not null,
	ProName nvarchar(100) not null,
	Ssn int not null,
	[Hours] float,
	primary key(ProNumber, ProName, Ssn),
	constraint FK_Details_Employee foreign key(Ssn) references Employee(Ssn),
	constraint FK_Details_Project foreign key(ProNumber,ProName) references Project(ProNumber,ProName)
)
go
-- Tạo bản Dependent
create table [Dependent] 
(
	[Name] nvarchar(50) not null,
	Birthdate date,
	Sex bit,
	Relationship nvarchar(30),
	Ssn int foreign key references Employee(Ssn),
	primary key([Name], SSn)
)