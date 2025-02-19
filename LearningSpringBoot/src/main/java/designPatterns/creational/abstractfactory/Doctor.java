package designPatterns.creational.abstractfactory;

import designPatterns.creational.factory.Profession;

public class Doctor implements Profession {
    @Override
    public void activity() {
        System.out.println("Doctor object created");
    }
}
