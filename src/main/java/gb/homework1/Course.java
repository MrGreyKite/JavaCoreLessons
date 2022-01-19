package gb.homework1;

import java.util.Random;

public class Course {

    private int numberOfTrials;

    protected class Trial {
        private int trialPoints;

        public Trial() {
            Random random = new Random();
            this.trialPoints = random.nextInt(21);
        }

        public Trial(int trialPoints) {
            this.trialPoints = trialPoints;
        }

        public int getTrialPoints() {
            return trialPoints;
        }

        @Override
        public String toString() {
            return "Препятствие: (" + trialPoints +")";
        }
    }

    public void doIt(Team team){

    }
}
