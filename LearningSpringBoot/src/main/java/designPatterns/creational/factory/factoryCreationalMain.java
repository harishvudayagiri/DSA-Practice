package designPatterns.creational.factory;

public class factoryCreationalMain {

    public static void main(String[] args) {
        ProfessionFactory professionFactory=new ProfessionFactory();
        Profession doc=professionFactory.getProfession("doctor");
        doc.activity();
    }

}
