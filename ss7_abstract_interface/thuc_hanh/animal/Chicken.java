package ss7_abstract_interface.thuc_hanh.animal;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Chicken: Cuk Cuk Cut";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
