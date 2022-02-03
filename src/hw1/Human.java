package hw1;

    public class Human implements Competitor {

        private int maxRun;
        private int maxJump;

        public Human(int maxRun, int maxJump) {
            this.maxRun = maxRun;
            this.maxJump = maxJump;
        }

        public Human() {
            this(3250, 1);
        }

        @Override
        public boolean run(int dist) {
            if (dist <= maxRun) {
                System.out.println("Человек успешно пробежал " + dist + "м");
                return true;
            } else {
                System.out.println("Человек Не смог пробежать " + dist + "м");
                return false;
            }
        }

        @Override
        public boolean jump(int dist) {
            if (dist <= maxJump) {
                System.out.println("Человек перепрыгнул " + dist + "м");
                return true;
            } else {
                System.out.println("Человек не смог перепрыгнуть " + dist + "м");
                return false;
            }
        }

        @Override
        public boolean doIt(Competitor c) {
            return false;
        }
    }

