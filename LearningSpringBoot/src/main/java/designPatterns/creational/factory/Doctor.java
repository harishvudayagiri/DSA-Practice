package designPatterns.creational.factory;

public class Doctor implements Profession{
    @Override
    public void activity() {
        System.out.println("Doctor object created");
    }
}
