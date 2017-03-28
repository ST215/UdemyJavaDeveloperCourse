/**
 * Created by Stanley on 3/28/17.
 */
public class PC {
    private Case theCase;
    private  Monitor montior;
    private  Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.montior = monitor;
        this.motherboard = motherboard;
    }

    public void powerUP() {
        theCase.pressPowerButtion();
        drawLogo();
    }

    private void drawLogo() {
        //Fancy Graphics
        montior.drawPixelAt(1200, 50, "yellow");
    }

}
