package hw1;

public class Cat implements Competitor{
    private int maxRun;
    private int maxJump;

    public Cat(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Cat() {
        this(200, 1);
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Кот успешно пробежал " + dist + "метров");
            return true;
        } else {
            System.out.println("Кот не смог пробежать " + dist + "метров");
            return false;
        }
    }

    @Override
    public boolean jump(int dist) {
        if (dist <= maxJump) {
            System.out.println("Кот успешно перепрыгнул " + dist + "м");
            return true;
        } else {
            System.out.println("Кот Не смог перепрыгнуть " + dist + "м");
            return false;
        }
    }

    @Override
    public boolean doIt(Competitor c) {
        return false;
    }
}
