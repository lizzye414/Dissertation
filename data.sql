use brinsburyanimal;

insert into `accommodation` (`accomm_id`, `area`, `number`) values
(1, 'Arid', 1), (2, 'Tropical', 1), (3, 'Rabbits', 1), (4, 'Small Mammals', 1);

insert into `feeding` (`feeding_id`, `descript`, `am`, `pm`) values
(1, 'Put measured amount into the bowl with fruit and or veg', 1, 0);

insert into `cleaning` (`cleaning_id`, `descript`) values
(1, 'Partial cleanout remove wet or soiled bedding, total cleanout remove all fixtures, wash and return');

insert into `species` (`latin_name`, `common_name`, `feeding_id`, `cleaning_id`) values
('Mus mus musculus', 'Mouse', 1, 1);

insert into `animal` (`latin_name`, `animal_name`, `accomm_id`, `dob`, `sex`, `dist_features`, `inCollection`) values
('Mus mus musculus', 'Edam', 4, '2018-05-25', 'F', 'Grey and white patches', 1);

insert into `accommodation` (`accomm_id`, `area`, `number`) values
(5, 'Kennels', 1), (6, 'Kennels', 2), (7, 'Kennels', 3), (8, 'Kennels', 4);