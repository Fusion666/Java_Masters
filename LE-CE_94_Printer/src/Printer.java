public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
            if(tonerLevel > -1 && tonerLevel <= 100) {
                this.tonerLevel = tonerLevel;
            }
            else {
                this.tonerLevel = -1;
            }
        this.duplexPrinter = duplexPrinter;
        this.numberOfPagesPrinted = 0;
    }

    public int fillToner(int fillValue) {
        if(fillValue <= 100 && fillValue > -1) {
            if(this.tonerLevel + fillValue > 100) {
                return -1;
            }
            else {
                this.tonerLevel += fillValue;
                return this.tonerLevel;
            }
        }
        else {
            return -1;
        }
    }

    public int printPage(int setNumberOfPages) {
        int pagesToPrint = setNumberOfPages;
        if(duplexPrinter) {
            pagesToPrint =(setNumberOfPages / 2) + (setNumberOfPages % 2);
        }
        this.numberOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
