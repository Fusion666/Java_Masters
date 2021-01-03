public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >-1 && tonerLevel <=100) {
            this.tonerLevel = tonerLevel;
        }
        else {
            this.tonerLevel = -1;
        }
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    //this function is checking if the toner we add is between 0 and 100%. If yes - it adds, if NO - returns -1 error;
    public int addToner(int tonerAmount) {
        if(tonerLevel > 0 && tonerLevel <= 100) {
            if(tonerLevel + tonerAmount <= 100) {
                this.tonerLevel += tonerAmount;
                return tonerLevel;
            }
            else {
              return -1;
            }
        }
        else {
            return -1;
        }
    }

    //This method calculates the printed pages depending whether he printer is duplex or not and returns the printed pages value;
    public int printPages(int pages) {
        int pagesToPrint = pages;
        if(duplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            pagesPrinted += pagesToPrint;
        }
        else {
            pagesPrinted += pagesToPrint;
        }
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

}
