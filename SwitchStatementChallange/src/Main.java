public class Main {
    public static void main(String[] args) {
        char symbol = 'a';
        switch (symbol) {
            case 'A':
                System.out.println("A, B, C, D, or E found");
                System.out.println("Actually " + symbol + " was found");
                break;
            case 'B':
                System.out.println("A, B, C, D, or E found");
                System.out.println("Actually " + symbol + " was found");
                break;
            case 'C':
                System.out.println("A, B, C, D, or E found");
                System.out.println("Actually " + symbol + " was found");
                break;
            case 'D':
                System.out.println("A, B, C, D, or E found");
                System.out.println("Actually " + symbol + " was found");
                break;
            case 'E':
                System.out.println("A, B, C, D, or E found");
                System.out.println("Actually " + symbol + " was found");
                break;
            default:
                System.out.println("Other symbol found: " + symbol);
                break;
        }

        String month = "JANUARy";
        switch (month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
