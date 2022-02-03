package hw1;

public class Treadmill implements  Obstacle{
    private int dist;

    public Treadmill(int dist) {
        this.dist = dist;
    }

    @Override
    public boolean doIt(Competitor c) {
        return c.run(dist);
    }
}
