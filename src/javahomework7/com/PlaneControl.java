package javahomework7.com;

import java.util.Random;

public class PlaneControl extends Plane {

    Random rnd = new Random();

    public PlaneControl(int length, int weight, int width) {
        super(length, weight, width);
    }

    public void moveUP() {

        int i = rnd.nextInt(100);
        System.out.println("Move up " +  i + " deg");

    }

    public void moveDown() {

        int i = rnd.nextInt(100);
        System.out.println("Move down " + i + " deg");

    }

    public void moveLeft() {
        int i = rnd.nextInt(100);
        System.out.println("Move left " + i + " deg \n");

    }


    public void moveRight() {

        int i = rnd.nextInt(100);
        System.out.println("Move right " + i + " deg");

    }

}