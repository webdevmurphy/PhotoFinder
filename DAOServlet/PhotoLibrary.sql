CREATE DATABASE IF NOT EXISTS PhotoLibrary;
USE PhotoLibrary;
DROP TABLE IF EXISTS Photos;

CREATE TABLE PHOTOS (
PHOTOId INTEGER UNSIGNED NOT NULL,
PHOTOTitle VARCHAR(45) NOT NULL,
PHOTOFirstName VARCHAR(255) NOT NULL,
PHOTOWebUrl VARCHAR(255) NOT NULL,
PHOTOType VARCHAR(45) NOT NULL,
PHOTOLocation VARCHAR(250) NOT NULL,
PHOTOKeywords VARCHAR(45) NOT NULL,
PHOTOMimie VARCHAR(45) NOT NULL,

PRIMARY KEY (PHOTOId)
);

INSERT INTO PHOTOS VALUES(
 1,
"Elf",
"Rob Halford",
"http://www.harleydavidson.com",
"Fantasy",
"https://firebasestorage.googleapis.com/v0/b/nebularproj2.appspot.com/o/photos%2Farcane_mage_by_nixri_dcb95nx-fullview.png?alt=media&token=4c5ed376-5ce2-4500-998f-bcd2fdda8eba",
"elf",
"image/jpg");
INSERT INTO PHOTOS VALUES(
 2,
"Girl walking worm",
"some guy",
"http://www.ontheweb.com",
"game",
"https://firebasestorage.googleapis.com/v0/b/nebularproj2.appspot.com/o/photos%2F3cf81e20235729.562e7eef50736.jpg?alt=media&token=ecc7c112-f533-4f6e-979e-72a316215506",
"cute",
"image/jpg");
INSERT INTO PHOTOS VALUES(
 3,
"One Punch Man",
"A Human",
"http://www.netflix.com",
"Netflix Show",
"https://firebasestorage.googleapis.com/v0/b/nebularproj2.appspot.com/o/photos%2Fpunch.gif?alt=media&token=409b08ce-fa64-4bc4-912c-11c6fe877147",
"cute",
"image/jpg");
INSERT INTO PHOTOS VALUES(
 4,
"Girl walking worm on sidewalk",
"some guy",
"http://www.ontheweb.com",
"game",
"https://firebasestorage.googleapis.com/v0/b/nebularproj2.appspot.com/o/photos%2F3cf81e20235729.562e7eef50736.jpg?alt=media&token=ecc7c112-f533-4f6e-979e-72a316215506",
"ugly",
"image/jpg");









