package designPatterns.creational.factory;

public class ProfessionFactory {
    public Profession getProfession(String value){

        if (value==null)
            return null;

        if(value.equalsIgnoreCase("Doctor"))
                return new Doctor();

        if(value.equalsIgnoreCase("Engineer"))
            return new Engineer();

        if(value.equalsIgnoreCase("UPSC"))
            return new UPSC();

        return null;
    }
}
