public class Main {
    public static void main(String[] args) {
        BasicBurger basicBurger = new BasicBurger("standard", "white bread roll", "beef",
                new Additions(true,true,true,true,
                        true,true,true));
        System.out.println(basicBurger.getPrice());
    }
}
