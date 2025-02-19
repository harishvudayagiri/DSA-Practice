package designPatterns.creational.abstractfactory;

import designPatterns.creational.factory.Profession;

public class DoctorTrainee implements Profession {
    @Override
    public void activity() {
        System.out.println("Doctor Trainee object created");
    }
}
