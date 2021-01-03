public class Movie {
    public String name;

//    public Movie(String name) {
//        this.name = name;
//    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }

    public Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1; //the RNG returns a number between 0 and 1 we convert to int
            //after we multiply it and then we add 1 so we get a number between 0 and 5
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                System.out.println("1");
                return new Jaws();

            case 2:
                System.out.println("2");
                return new IndependenceDay();

            case 3:
                System.out.println("3");
                return new MazeRunner();

            case 4:
                System.out.println("4");
                return new StarWars();

            case 5:
                System.out.println("5");
                return new Forgettable();
        }
        return null;
    }
}
