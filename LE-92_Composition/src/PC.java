public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUP(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo() {
        //some fancy graphics Logo
        monitor.drawPixelAt(1200,50,"yellow");
    }

}
