package task3;

public class Wall extends Obstacle{
    public Wall(int height) {
        super.height = height;
        length = 0; //тут не нужно указыать ключевое слово super
    }
}
