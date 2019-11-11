package javahomework7.com;

public class Main {

    public static void main(String[] args) {


        planeMove();

    }

    public static void planeMove() {
        CyTwentySeven cyTwentySeven = new CyTwentySeven();
        cyTwentySeven.moveUP();
        cyTwentySeven.moveDown();
        cyTwentySeven.moveLeft();
        cyTwentySeven.moveRight();
    }
}