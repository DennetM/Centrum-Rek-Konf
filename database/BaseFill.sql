USE [IO]
GO
INSERT INTO dbo.Equipment VALUES (30, 120, 2, 2, 1, 1, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0);
INSERT INTO dbo.Equipment VALUES (45, 90, 1, 4, 2, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0);
INSERT INTO dbo.Equipment VALUES (60, 180, 2, 4, 2, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0);
INSERT INTO dbo.Equipment VALUES (20, 80, 3, 4, 2, 1, 1, 4, 0, 0, 0, 0, 0, 0, 0, 0);

INSERT INTO dbo.Equipment VALUES (0, 0, 0, 0, 0, 0, 0, 0, 24, 20, 26, 0, 0, 0, 1, 0);
INSERT INTO dbo.Equipment VALUES (0, 0, 0, 0, 0, 0, 0, 0, 44, 20, 36, 0, 0, 0, 1, 0);
INSERT INTO dbo.Equipment VALUES (0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 6, 1, 1);
INSERT INTO dbo.Equipment VALUES (0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 4, 1, 1);

INSERT INTO dbo.Room VALUES (101, 100, 1, 120, 1, 'Sala Konferencyjna "¯ó³ta"', 800);
INSERT INTO dbo.Room VALUES (102, 80, 1, 90, 2, 'Sala Konferencyjna "Zielona"', 600);
INSERT INTO dbo.Room VALUES (103, 150, 1, 180, 3, 'Sala Konferencyjna "Niebieska"', 1000);
INSERT INTO dbo.Room VALUES (104, 70, 1, 80, 4, 'Sala Konferencyjna "Bia³a"', 550);

INSERT INTO dbo.Room VALUES (201, 100, 1, 70, 5, 'Sala Rekereacyjna - Fitness 1', 500);
INSERT INTO dbo.Room VALUES (202, 140, 1, 90, 6, 'Sala Rekereacyjna - Fitness 2', 660);
INSERT INTO dbo.Room VALUES (203, 200, 1, 80, 7, 'Sala Rekereacyjna - Salon Gier 1', 900);
INSERT INTO dbo.Room VALUES (204, 260, 1, 112, 8, 'Sala Rekereacyjna - Salon Gier 2', 1200);

INSERT INTO dbo.Personnel VALUES ('Jerzy', 'Przybyszewski', 'informatyk');
INSERT INTO dbo.Personnel VALUES ('Dawid', 'Przybys³owski', 'informatyk');
INSERT INTO dbo.Personnel VALUES ('Andrzej', 'Bunty', 'technik');
INSERT INTO dbo.Personnel VALUES ('Ma³gorzata', 'Jod³owska', 'technik');
INSERT INTO dbo.Personnel VALUES ('Janusz', 'Dobrowski', 'informatyk');
INSERT INTO dbo.Personnel VALUES ('Janina', 'Ma³opolska', 'technik');
INSERT INTO dbo.Personnel VALUES ('Pawe³', 'Satanowski', 'konferencja');
INSERT INTO dbo.Personnel VALUES ('Adam', 'Pospólski', 'rekreacja/rozrywka');
INSERT INTO dbo.Personnel VALUES ('Maria', 'Chocho³owska', 'konferencja');
INSERT INTO dbo.Personnel VALUES ('Bartosz', 'Majewski', 'konferencja');
INSERT INTO dbo.Personnel VALUES ('Pawe³', 'Chocho³owski', 'konferencja');
INSERT INTO dbo.Personnel VALUES ('Andrzej', 'Ma³ak', 'konferencja');
INSERT INTO dbo.Personnel VALUES ('Jêdrzej', 'Mors', 'konferencja');
INSERT INTO dbo.Personnel VALUES ('Oliwia', 'Czerw', 'rekreacja/rozrywka');
INSERT INTO dbo.Personnel VALUES ('Marta', 'Strykowska', 'rekreacja/rozrywka');
INSERT INTO dbo.Personnel VALUES ('Maria', 'Chocho³owska', 'rekreacja/rozrywka');
INSERT INTO dbo.Personnel VALUES ('Piotr', 'Ludilewski', 'rekreacja/rozrywka');
INSERT INTO dbo.Personnel VALUES ('Maria', 'Sta¿', 'rekreacja/rozrywka');
INSERT INTO dbo.Personnel VALUES ('Natalia', 'Bia³acka', 'rekreacja/rozrywka');
INSERT INTO dbo.Personnel VALUES ('Joanna', 'Domownik', 'rekreacja/rozrywka');

INSERT INTO dbo.Guest VALUES('Mariusz', 'Wyszowski', '123-456-90', 'mariusz.w@wp.pl');
INSERT INTO dbo.Guest VALUES('Jacek', 'Górski', '144-566-50', 'jacekgorski@gmail.com');
INSERT INTO dbo.Guest VALUES('Marek', 'Wiœnia', '556-456-45', 'marwis@wp.pl');
INSERT INTO dbo.Guest VALUES('Pawe³', '¯y³a', '667-777-77', 'p.zyla@interia.pl');
INSERT INTO dbo.Guest VALUES('Maria', 'Borówna', '554-345-76', 'mariab@wp.pl');
INSERT INTO dbo.Guest VALUES('Piotr', 'Wójt', '223-312-56', 'piotr.wojt@gmail.com');

INSERT INTO dbo.Event VALUES('Szkolenie - Ekologia', 20-01-2014, 22-01-2014, 1, 1, 1, 7);
INSERT INTO dbo.Event VALUES('Szkolenie - Ekologia', 20-01-2014, 22-01-2014, 1, 1, 1, 10);
INSERT INTO dbo.Event VALUES('Szkolenie - Ekologia', 20-01-2014, 22-01-2014, 1, 4, 1, 20);
INSERT INTO dbo.Event VALUES('Szkolenie - Ekologia', 20-01-2014, 22-01-2014, 1, 4, 1, 19);
INSERT INTO dbo.Event VALUES('Szkolenie - Ekologia', 20-01-2014, 22-01-2014, 1, 5, 1, 14);
INSERT INTO dbo.Event VALUES('Szkolenie - Ekologia', 20-01-2014, 22-01-2014, 1, 5, 1, 15);

INSERT INTO dbo.Event VALUES('Szkolenie - HACCP', 22-01-2014, 24-01-2014, 1, 4, 2, 9);
INSERT INTO dbo.Event VALUES('Szkolenie - HACCP', 22-01-2014, 24-01-2014, 1, 4, 2, 10);
INSERT INTO dbo.Event VALUES('Szkolenie - HACCP', 22-01-2014, 24-01-2014, 1, 7, 2, 8);
INSERT INTO dbo.Event VALUES('Szkolenie - HACCP', 22-01-2014, 24-01-2014, 1, 7, 2, 16);

INSERT INTO dbo.Event VALUES('Szkolenie - BHP', 25-01-2014, 26-01-2014, 1, 2, 3, 12);
INSERT INTO dbo.Event VALUES('Szkolenie - BHP', 25-01-2014, 26-01-2014, 1, 2, 3, 13);
INSERT INTO dbo.Event VALUES('Szkolenie - BHP', 25-01-2014, 26-01-2014, 1, 8, 3, 14);
INSERT INTO dbo.Event VALUES('Szkolenie - BHP', 25-01-2014, 26-01-2014, 1, 8, 3, 15);

INSERT INTO dbo.Event VALUES('Szkolenie - Informatyka', 27-01-2014, 31-01-2014, 1, 3, 4, 7);
INSERT INTO dbo.Event VALUES('Szkolenie - Informatyka', 27-01-2014, 31-01-2014, 1, 3, 4, 10);
INSERT INTO dbo.Event VALUES('Szkolenie - Informatyka', 27-01-2014, 31-01-2014, 1, 3, 4, 11);
INSERT INTO dbo.Event VALUES('Szkolenie - Informatyka', 27-01-2014, 31-01-2014, 1, 6, 4, 20);
INSERT INTO dbo.Event VALUES('Szkolenie - Informatyka', 27-01-2014, 31-01-2014, 1, 6, 4, 18);
INSERT INTO dbo.Event VALUES('Szkolenie - Informatyka', 27-01-2014, 31-01-2014, 1, 8, 4, 16);
INSERT INTO dbo.Event VALUES('Szkolenie - Informatyka', 27-01-2014, 31-01-2014, 1, 8, 4, 8);
