DROP DATABASE IF EXISTS QLNhanVien;
CREATE DATABASE QLNhanVien;
USE QLNhanVien;
CREATE TABLE IF NOT EXISTS nhanvien(
	Manv varchar(20),
	Hoten varchar(50) NOT NULL,
	Gioitinh varchar(5) NOT NULL,
	Ngaysinh varchar(12) NOT NULL,
	SDT varchar(15) NOT NULL,
	Email varchar(30) NOT NULL,
	Chucvu varchar(30) NOT NULL,
	Luong int NOT NULL,
	PRIMARY KEY(Manv)
);
CREATE TABLE IF NOT EXISTS `account`(
	username varchar(20),
    `password` varchar(20)
);
Insert into `account`(username, `password`)
Value				('admin', 'admin');

SELECT * FROM nhanvien;
SELECT * FROM `account`;