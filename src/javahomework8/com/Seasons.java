package javahomework8.com;

public enum Seasons {
    WINTER(3),
    SPRING(3),
    SUMMER(3),
    AUTUMN(3);

    public int amountOfMonth;

    Seasons(int amountOfMonth){
        this.amountOfMonth = amountOfMonth;
    }

    public int getAmountOfMonth() {
        return amountOfMonth;
    }
}
