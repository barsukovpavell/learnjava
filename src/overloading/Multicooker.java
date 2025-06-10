package overloading;

public class Multicooker {
    public void cook(Rice rice, Water water){
        System.out.println("Готовим кашу из риса и воды.");
    }

    public void cook(Meat meat, Spices spices){
        System.out.println("Готовим рагу.");
    }

    public void cook(Dough dough, Apple apple){
        System.out.println("Готовим пирог с яблоками.");
    }

}
