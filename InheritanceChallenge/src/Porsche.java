/**
 * Created by Stanley on 3/23/17.
 */
public class Porsche extends Car {
    private int roadServiceMonths;

    public Porsche(int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
