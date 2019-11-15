package javahomework8.com;

public enum Month {

    JANUARY(31, Seasons.WINTER),
    FEBRUARY(28, Seasons.WINTER),
    MARCH(31,Seasons.SPRING),
    APRIL(30,Seasons.SPRING),
    MAY(31,Seasons.SPRING),
    JUNE(31,Seasons.SUMMER),
    JULY(30,Seasons.SUMMER),
    AUGUST(31,Seasons.SUMMER),
    SEPTEMBER(31,Seasons.AUTUMN),
    OCTOBER(30,Seasons.AUTUMN),
    NOVEMBER(30,Seasons.AUTUMN),
    DECEMBER(31,Seasons.WINTER);

    public int daysInMonth;
    public Seasons seasons;

    Month(int daysInMonth, Seasons seasons) {
        this.daysInMonth = daysInMonth;
        this.seasons = seasons;
    }

    public int getDaysInMonth(){
        return daysInMonth;
    }

    public Seasons getSeasons(){
        return seasons;
    }
}
