package javahomework7.com;

public class Main {

    public static void main(String[] args) {

        planeStatus();
        planeMove();
        planeSkills();

    }

    public static void planeMove() {

        CyTwentySeven cyTwentySeven = new CyTwentySeven(150,200,100);
        cyTwentySeven.moveUP();
        cyTwentySeven.moveDown();
        cyTwentySeven.moveRight();
        cyTwentySeven.moveLeft();
    }

    public static void planeStatus() {

        CyTwentySeven cyTwentySeven = new CyTwentySeven(150, 200, 100);
        cyTwentySeven.startMotor();
        cyTwentySeven.planeFlyKm();
        cyTwentySeven.planeGoingToLend();
    }

    public static void planeSkills() {
        CyTwentySeven cyTwentySeven = new CyTwentySeven(150,200,100);

        cyTwentySeven.nuclearStrike();
        cyTwentySeven.stealth();
        cyTwentySeven.turboSpeed();

    }

}