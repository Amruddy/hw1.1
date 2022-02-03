package hw1;

public class Wall implements Obstacle{
    private int heigth;

    public Wall(int heigth) {
        this.heigth = heigth;
    }

    @Override
    public boolean doIt(Competitor c) {
        return c.jump(heigth);
    }
}
