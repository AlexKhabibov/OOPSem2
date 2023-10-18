package task3;

public class Cat extends BaseCat implements Runner {
    private String name;

    private int maxRun;
    private int maxJump;

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }


    @Override
    public boolean run(int length) {
        if (length <= getMaxRun()) {
            System.out.printf("%s пробежал по беговой дорожке %d метров.\n", name, length);
            return true;
        } else {
            System.out.printf("%s НЕ СМОГ ПРОБЕЖАТЬ по беговой дорожке %d метров, остановился после %d метров\n",
                    name, length, getMaxRun());
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s перепрыгнул %d сантиметров.\n", name, height);
            return true;
        } else {
            System.out.printf("%s НЕ СМОГ ПЕРЕПРЫГНУТЬ через стену %d сантиметров, допрыгнул до %d сантиметров\n",
                    name, height, getMaxJump());
            return false;
        }
    }
}