package designPatterns.creational.abstractfactory;

import designPatterns.creational.factory.Profession;

public class Engineer implements Profession {
    @Override
    public void activity() {
        System.out.println("Engineer object created");
    }
}
