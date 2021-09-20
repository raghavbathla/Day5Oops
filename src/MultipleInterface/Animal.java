package MultipleInterface;

public class Animal implements AnimalHunt,AnimalEat{
    @Override
    public void eat() {
        System.out.println("Animal is Eating");
    }

    @Override
    public void hunt() {
System.out.println("Animal is Hunting");
    }
}
