package Task2;

public class Dog extends BaseDog implements Runnable{
    @Override
    public void run() {
        System.out.println("Кот бежит");
    }
}
