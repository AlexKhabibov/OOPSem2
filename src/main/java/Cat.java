public class Cat extends Animal{

    private String color;

    public String getColor() {
        return color;
    }

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public void jump() {
        System.out.println("кошка прыгает");
    }

    @Override
    public void voice() {
        System.out.println("Мяу");
    }
}


