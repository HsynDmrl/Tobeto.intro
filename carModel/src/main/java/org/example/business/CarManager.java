package org.example.business;

import org.example.core.logging.Logger;
import org.example.dataAccess.CarDao;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

import java.util.List;

public class CarManager {
    private CarDao carDao;
    private Logger[] loggers;

    public CarManager(CarDao carDao, Logger[] loggers) {
        this.carDao = carDao;
        this.loggers=loggers;
    }

    public void add(Car car) throws Exception {
        if(car.getPrice()<100000){
            throw new Exception("Ürün fiyatı 100000 den küçük olamaz");
        }
        if(car.getStock()<50){
            throw new Exception("Stok sayısı 50'den az olamaz");
        }
        carDao.add(car);
        for(Logger logger : loggers){
            logger.log(car.getBrand());
        }
    }
}
