package hw1;

public interface Competitor {
    boolean run(int dist);
    boolean jump(int dist);

    boolean doIt(Competitor c);
}
