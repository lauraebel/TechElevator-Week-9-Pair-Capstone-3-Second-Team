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

SELECT parkcode, parkname, state, acreage, elevationinfeet, milesoftrail, numberofcampsites, climate, yearfounded, annualvisitorcount, inspirationalquote, inspirationalquotesource, parkdescription, entryfee, numberofanimalspecies FROM park WHERE parkcode = 'YNP' ORDER BY parkname;

START TRANSACTION;
ROLLBACK;

INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2000, 'YNP', 'kate@kate', 'ohio', 'sedentary') RETURNING surveyid;
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2001, 'YNP2', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2002, 'YNP', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2003, 'GTNP', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2004, 'ENP', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2005, 'GCNP', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2006, 'GTNP', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2007, 'RMNP', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2008, 'MRNP', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2009, 'YNP', 'kate@kate', 'ohio', 'sedentary');


INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2000, 'GTNP', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2001, 'GTNP', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2002, 'GTNP', 'kate@kate', 'ohio', 'sedentary');

INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2003, 'YNP', 'kate@kate', 'ohio', 'sedentary');
INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2004, 'YNP', 'kate@kate', 'ohio', 'sedentary');

INSERT INTO survey_result (surveyid, parkcode, emailaddress, state, activitylevel) VALUES (2005, 'YNP2', 'kate@kate', 'ohio', 'sedentary');


SELECT * FROM survey_result;

TRUNCATE survey_result CASCADE;

SELECT COUNT(survey_result.parkcode) AS surveycount, park.* FROM park JOIN survey_result ON park.parkcode = survey_result.parkcode GROUP BY park.parkcode ORDER BY surveycount DESC, park.parkname;
