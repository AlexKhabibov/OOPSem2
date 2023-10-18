package task3;

public class Championship {
    public static void main(String[] args) {
        Runner[] runners = {
            new Cat("Барсик", 1500, 300),
            new Cat("Персик", 1400, 250),

            new Human("Петр", 3000, 180),
            new Human("Игорь", 4000, 190),

            new Robot("c3po", 15000, 3000),
            new Robot("r2d2", 17000, 4000),
        };
        Obstacle[] obstacles = {
          new Track(1500),
          new Wall(50),
          new Track(2000),
          new Wall(100),
          new Track(4000),
          new Wall(200),
        };

        for (Runner runner: runners) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Track) {
                    if (!runner.run(obstacle.getLength()))
                        break;
                } else if (obstacle instanceof Wall) {
                    if (!runner.jump(obstacle.getHeight()))
                        break;
                }
            }
        }

    }
}
