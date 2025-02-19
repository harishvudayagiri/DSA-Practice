package designPatterns.creational.abstractfactory;

import designPatterns.creational.factory.Profession;

public class EngineerTrainee implements Profession {
    @Override
    public void activity() {
        System.out.println("Engineer Trainee object created");
    }
}
