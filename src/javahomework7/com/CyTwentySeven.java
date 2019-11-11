package javahomework7.com;

public class CyTwentySeven extends PlaneControl {

    @Override
    public void moveUP() {
        int i = rnd.nextInt(100);
        System.out.println("Move up " +  i + " deg");
    }
    @Override
    public void moveDown(){
        int i = rnd.nextInt(100);
        System.out.println("Move down " + i + " deg");

    }
    @Override
    public void moveLeft(){
        int i = rnd.nextInt(100);
        System.out.println("Move left " + i + " deg");
    }
    @Override
    public void moveRight(){
        int i = rnd.nextInt(100);
        System.out.println("Move right " + i + " deg");
    }

}
