/**
 * Created by Stanley on 3/28/17.
 */
public class PC {
    private Case theCase;
    private  Monitor montior;
    private  Motherboard motherboard;

    public PC(Case theCase, Monitor montior, Motherboard motherboard) {
        this.theCase = theCase;
        this.montior = montior;
        this.motherboard = motherboard;
    }

    public Case getTheCase() {
        return theCase;
    }

    public Monitor getMontior() {
        return montior;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }
}
