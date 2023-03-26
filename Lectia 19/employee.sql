create database emp_manager;

create table emp_manager.employee(
	`id` int PRIMARY KEY AUTO_INCREMENT,
    `name` varchar(50),
    `surname` varchar(50),
    `email` varchar(100) 		
);

insert into emp_manager.employee(`name`, `surname`, `email`) values('John', 'Smith', 'jsmith@gmail.com');

select * from employee;
update employee set `name` = 'Will', `surname` = 'Johnson', `email` = 'wjohnson@gmail.com' where id = employee2;