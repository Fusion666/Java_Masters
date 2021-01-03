public class DiagonalStar {
    public static void diagonalSquare(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
        }

        for(int rows = 0; rows < number; rows++) {
            System.out.print("* ");
            for(int columns = 0; columns < rows; columns++) {
                if(columns == (rows - 1)) {
                    System.out.print("* ");
                }
                else if(rows == number - 1) {
                    for( columns = 0; columns < rows; columns++)
                    System.out.print("* ");
                }
                else System.out.print("1 ");
            }
            System.out.println();
            }
        }
    }

