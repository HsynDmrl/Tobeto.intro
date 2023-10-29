package org.example;

import org.example.business.CarManager;
import org.example.core.logging.DatabaseLogger;
import org.example.core.logging.FileLogger;
import org.example.core.logging.Logger;
import org.example.core.logging.MailLogger;
import org.example.dataAccess.HibernateCarDao;
import org.example.dataAccess.JdbcCarDao;
import org.example.entities.Car;

public class Main {
    public static void main(String[] args) throws Exception {
        Car car1=new Car(1,670000,"Mazda","Yellow",55);
        Car car2= new Car(2,566846,"Bugatti","Black",69);
        Car car3= new Car(3,6696214,"Lamborghini","Blue",100);

        Logger[] loggers={new DatabaseLogger(),new FileLogger(),new MailLogger()};
        CarManager carManager= new CarManager(new HibernateCarDao(),loggers);
        carManager.add(car1);
        System.out.println("***********************************");
        carManager.add(car2);
        System.out.println("***********************************");
        carManager.add(car3);
    }
}