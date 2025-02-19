package designPatterns.creational.factory;

public class Engineer implements Profession{
    @Override
    public void activity() {
        System.out.println("Engineer object created");
    }
}
