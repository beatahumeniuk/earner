
create table earn.coordinate (
    id int8 not null,
    latitude varchar(255),
    longitude varchar(255),
    primary key (id)
);

create table earn.location (
    id int8 not null,
    city varchar(255),
    city_type varchar(255),
    voivodeship varchar(255),
    coordinate_id int8,
    primary key (id),
    foreign key (coordinate_id) references earn.coordinate
);

create table earn.education (
    id int8 not null,
    course_name varchar(255),
    education_degree varchar(255),
    end_date timestamp,
    finished boolean not null,
    start_date timestamp,
    university_name varchar(255),
    primary key (id)
);

create table earn.employee (
    id int8 not null,
    date_of_birth timestamp,
    name varchar(255),
    phone_number varchar(255),
    professional_group varchar(255),
    surname varchar(255),
    location_id int8,
    primary key (id),
    foreign key (location_id) references earn.location
 );

create table earn.employee_education_list (
    employee_id int8 not null,
    education_list_id int8 not null unique,
    foreign key (education_list_id) references earn.education,
    foreign key (employee_id) references earn.employee
 );

create table earn.employee_experiences (
    employee_id int8 not null,
    experiences_id int8 not null unique ,
    foreign key (experiences_id) references earn.experience,
    foreign key (employee_id) references earn.employee
 );

create table earn.employee_interests (
    employee_id int8 not null,
    interest_id int8 not null,
    foreign key (interest_id) references earn.interest,
    foreign key (employee_id) references earn.employee
);

create table earn.employee_language (
    employee_id int8 not null,
    language_id int8 not null,
   foreign key (language_id) references earn.language,
   foreign key (employee_id) references earn.employee
);

create table earn.employee_skills (
    employee_id int8 not null,
    skill_id int8 not null,
    foreign key (skill_id) references earn.skill,
    foreign key (employee_id) references earn.employee
);

create table earn.experience (
    id int8 not null,
    company_name varchar(255),
    end_date timestamp,
    position varchar(255),
    professional_group varchar(255),
    start_date timestamp, primary key (id)
);

create table earn.interest (
    id int8 not null,
    professional_group int4,
    primary key (id)
 );

create table earn.language (
    id int8 not null,
    level varchar(255),
    name varchar(255),
    primary key (id)
);

create table earn.skill (
    id int8 not null,
    level int4 not null,
    name varchar(255),
    primary key (id)
);

create table earn.user (
    id int8 not null,
    login varchar(255),
    password varchar(255),
    primary key (id)

);
create table earn.user_employee (
    employee_id int8,
    user_id int8 not null,
    primary key (user_id),
    foreign key (employee_id) references earn.employee,
    foreign key (user_id) references earn.user
);

