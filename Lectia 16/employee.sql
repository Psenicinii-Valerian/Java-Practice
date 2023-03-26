create database emp_manager;
drop database emp_manager;
truncate table employee;

create table emp_manager.employee(
	`id` int PRIMARY KEY AUTO_INCREMENT,
    `name` varchar(50) NOT NULL,
    `surname` varchar(50) NOT NULL,
    `email` varchar(100),
    `birthdate` date,
    UNIQUE (`name`, `surname`, `email`) 		
);

alter table employee add column `birthdate` varchar(10);

delete from employee;

insert into emp_manager.employee(`name`, `surname`, `email`) values('Peter', 'Parker', 'pparker@gmail.com');

select * from employee;

update employee set `name` = 'Will', `surname` = 'Johnson', `email` = 'wjohnson@gmail.com' where id = employee2;

delete from employee where id = 2;