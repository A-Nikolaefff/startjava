CREATE DATABASE Jaegers;
CREATE TABLE Jaegers (
    id SERIAL PRIMARY KEY, 
    modelName TEXT, 
    mark CHAR(6), 
    height DECIMAL(4,2), 
    weight INTEGER, 
    status CHAR(9), 
    origin TEXT, 
    launch DATE, 
    kaijuKill INTEGER
    );