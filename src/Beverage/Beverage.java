package Beverage;

public abstract class Beverage {
    //Template method
    //Here is placed main algorithm
    final public void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();

        //using hook(перехватчик)
        if (customerWantsCondiments())
        addCondiments();
    }

    //changeable individual methods for each subclass
    abstract void brew();

    abstract void addCondiments();

    //unchangeable common methods for all class methods
    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    //hook method
    boolean customerWantsCondiments(){
        return true;
    }
}