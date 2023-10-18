package task3;

public class Track extends Obstacle{
    public Track(int length) {
        super.length = length;
        height = 0; //тут не нужно указыать ключевое слово super
    }
}
