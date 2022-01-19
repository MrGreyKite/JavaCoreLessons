package gb.homework1;

import java.util.Random;

public class TeamMember{
    private final String memberName;
    private int points; //очки используются для прохождения препятствий

    public TeamMember(String memberName, int points) {
        this.memberName = memberName;
        this.points = points;
    }

    public TeamMember(String memberName) {
        this.memberName = memberName;

        Random random = new Random();
        this.points = random.nextInt(100);
    }

    public int getPoints(){
        return this.points;
    }

    public void decreasePoints(int points){
        this.points = this.points - points;
    }

    @Override
    public String toString() {
        return "(Имя участника: " + memberName + ", очки прохождения: " + points + ")";
    }

}