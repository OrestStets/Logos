package javahomework7.com;

import java.util.Random;

public abstract class Plane implements Specifics {

    Random rnd = new Random();


    int length;
    int weight;
    int width;


    public  Plane(int length, int weight, int width ){
        this.length = length;
        this.weight = weight;
        this.width = width;
    }

    public void startMotor() {

        int start = rnd.nextInt(22) + 1;
        System.out.println("Motor will be ready in " + start + " sec \n");

    }

    public void planeFlyKm() {

        double planeFly = rnd.nextDouble() + 1;
        System.out.println("Plane will fly " + planeFly + " km/h \n");

    }

    public void planeGoingToLend() {

        System.out.println("Plane is Landing !!!, Pilots prepare to LANDING \n");


    }

    @Override
    public void nuclearStrike() {

        System.out.println("Attack target! " + "Send the Rocket! \n");

    }

    @Override
    public void stealth() {

        System.out.println("Target is done, hide and return back \n");

    }

    @Override
    public void turboSpeed() {

        System.out.println("Mission status: Finished. Lets go back to home boys! Turbo on!");

    }
}
