package Task2;

public class Cat extends BaseCat implements Runnable{
    @Override
    public void run() {
        System.out.println("Собака бежит");
    }
}
