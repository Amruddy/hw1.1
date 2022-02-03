package hw1;
    public class Main {
        public static void main(String[] args) {
            Competitor[] competitors = {
                    new Human(),
                    new Robot(),
                    new Cat()
            };

            Obstacle[] obstacles = {
                    new Treadmill(500),
                    new Wall(32)
            };

            for (Competitor c : competitors) {
                for (Obstacle o : obstacles) {
                    if (!o.doIt(c)) {
                        break;
                    }
                }
            }
        }
    }
