DROP TABLE IF EXISTS weather_img;

CREATE TABLE weather_img (
        forecast varchar(20) primary key,
        imgpath varchar(20)
);

INSERT INTO weather_img (forecast, imgpath) VALUES('snow', 'snow.png');

INSERT INTO weather_img (forecast, imgpath) VALUES('partly cloudy', 'partlyCloudy.png');

INSERT INTO weather_img (forecast, imgpath) VALUES('rain', 'rain.png');

INSERT INTO weather_img (forecast, imgpath) VALUES('sunny', 'sunny.png');

INSERT INTO weather_img (forecast, imgpath) VALUES('cloudy', 'cloudy.png');

INSERT INTO weather_img (forecast, imgpath) VALUES('thunderstorms', 'thunderstorms.png');

SELECT parkcode, parkname, state, acreage, elevationinfeet, milesoftrail, 
numberofcampsites, climate, yearfounded, annualvisitorcount, inspirationalquote,
inspirationalquotesource, parkdescription, entryfee, numberofanimalspecies
FROM park 
ORDER BY parkname;

