public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Movie jaws = new Jaws();
        Movie independenceDay = new IndependenceDay();
        Movie mazeRunner = new MazeRunner();
        Movie starWars = new StarWars();
        Movie forgettable = new Forgettable();
        //jaws.randomMovie();
//        System.out.println(independenceDay.getName());
        for(int i = 1; i < 11; i++) {
            movie.randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                            "Plot: " + movie.plot() + "\n");
        }
    }
}
