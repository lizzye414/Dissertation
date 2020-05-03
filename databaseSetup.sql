create database brinsburyanimal;
use brinsburyanimal;

create table feeding (
	feeding_id int primary key auto_increment,
    descript varchar(200),
    am bool,
    pm bool
);

create table cleaning (
	cleaning_id int primary key auto_increment,
    descript varchar(200)
);

create table species (
	latin_name varchar(30) primary key,
    common_name varchar(30),
    info varchar(200),
    feeding_id int,
    cleaning_id int,
    CONSTRAINT `FK_species_feeding` FOREIGN KEY (`feeding_id`)
		REFERENCES `feeding` (`feeding_id`),
	constraint `FK_species_cleaning` foreign key (`cleaning_id`)
		references `cleaning` (`cleaning_id`)
);

create table accommodation (
	accomm_id int primary key auto_increment,
    area varchar(20),
    number int
);

create table animal (
	latin_name varchar(30),
    animal_name varchar(30),
    id_no varchar(20),
    accomm_id int,
    dob date,
    sex enum("M", "F"),
    dist_features varchar(50),
    inCollection bool,
    primary key (latin_name, animal_name),
    constraint `FK_animal_species` foreign key (`latin_name`)
		references `species` (`latin_name`),
	constraint `FK_animal_accommodation` foreign key (`accomm_id`)
		references `accommodation` (`accomm_id`)
);

create table slough (
	latin_name varchar(30),
    animal_name varchar(30),
    record_date date,
    finished bool,
    primary key (latin_name, animal_name, record_date),
    constraint `FK_slough_animal` foreign key (`latin_name`, `animal_name`)
		references `animal` (`latin_name`, `animal_name`)
);

create table health_check (
	latin_name varchar(30),
    animal_name varchar(30),
    record_date date,
    weight int,
    health_issue varchar(50),
    treatment varchar(50),
    primary key (latin_name, animal_name, record_date),
    constraint `FK_health_check_animal` foreign key (`latin_name`, `animal_name`)
		references `animal` (`latin_name`, `animal_name`)
);

create table fed (
	fed_id int primary key auto_increment,
    food varchar(20),
    amount int,
    fruit_veg varchar(30),
    ate bool,
    amount_left int
);

create table herptile_record (
	accomm_id int,
    student_name varchar(30),
    record_date date,
    record_time enum ("AM", "PM"),
    full_clean bool,
    water bool,
    temp_min int,
    temp_max int,
    temp_reset bool,
    peat_moss bool,
    faeces bool,
    humidity int,
    fed_id int,
    comments varchar(30),
    primary key (`accomm_id`, `record_date`, `record_time`),
    constraint `FK_herptile_record_accommodation` foreign key (`accomm_id`)
		references `accommodation` (`accomm_id`),
	constraint `FK_herptile_record_fed` foreign key (`fed_id`)
		references `fed` (`fed_id`)
);

create table bird_mammal_record (
	accomm_id int,
    student_name varchar(30),
    record_date date,
    record_time enum ("AM", "PM"),
    full_clean bool,
    water bool,
    concrete_swept bool,
    enrichment varchar(30),
    security_check bool,
    weeding bool,
    fed_id int,
    comments varchar(30),
    primary key (`accomm_id`, `record_date`, `record_time`),
    constraint `FK_bird_mammal_record_accommodation` foreign key (`accomm_id`)
		references `accommodation` (`accomm_id`),
	constraint `FK_bird_mammal_record_fed` foreign key (`fed_id`)
		references `fed` (`fed_id`)
);

create table fish_record (
	accomm_id int,
    student_name varchar(30),
    record_date date,
    record_time enum ("AM", "PM"),
    full_clean bool,
    ammonia int,
    pH int,
    nitrate int,
    nitrite int,
    calcium int,
    carbonate int,
    phosphate int,
    salt int,
    temp int,
    no_fish int,
    heater bool,
    filter_check bool,
    lights bool,
    glass bool,
    lid bool,
    fed_id int,
    comments varchar(30),
    primary key (`accomm_id`, `record_date`, `record_time`),
    constraint `FK_fish_record_accommodation` foreign key (`accomm_id`)
		references `accommodation` (`accomm_id`),
	constraint `FK_fish_record_fed` foreign key (`fed_id`)
		references `fed` (`fed_id`)
);