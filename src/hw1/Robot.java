package hw1;

public class Robot implements Competitor{
    private int maxRun;
    private int maxJump;

    public Robot(int maxRun, int maxJump) {
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    public Robot() {
        this(22000, 3);
    }

    @Override
    public boolean run(int dist) {
        if (dist <= maxRun) {
            System.out.println("Робот пробежал " + dist + "метров");
            return true;
        } else {
            System.out.println("Робот не смог пробежать " + dist + "метров");
            return false;
        }
    }


    @Override
    public boolean jump(int dist) {
        if (dist <= maxJump) {
            System.out.println("Робот перепрыгнул " + dist + "метров");
            return true;
        } else {
            System.out.println("Робот не смог перепрыгнуть " + dist + "метров");
            return false;
        }
    }

    @Override
    public boolean doIt(Competitor c) {
        return false;
    }

}
