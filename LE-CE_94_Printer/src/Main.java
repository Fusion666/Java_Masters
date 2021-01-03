public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50,true);


        printer.fillToner(41);
        System.out.println(printer.getTonerLevel());

        printer.printPage(4);
        System.out.println(printer.getNumberOfPagesPrinted());
    }
}
