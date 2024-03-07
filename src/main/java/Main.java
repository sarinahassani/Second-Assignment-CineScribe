import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO --> complete main function.
        runMenu();

    }

    public static void runMenu() throws IOException {
        // TODO
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello");
        System.out.println("Which one do you want?");
        System.out.println("1-Mvie");
        System.out.println("2-Actor/Actress");
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println("Enter the name of the movie");
            String name = scanner.next();
            Movie movie = new Movie(new ArrayList<>(), "", 0, "", "", "", "");
            System.out.println(movie.getImdbVotesViaApi((movie.getMovieData(name))));
            System.out.println(movie.getRatingViaApi((movie.getMovieData(name))));
            System.out.println(movie.getDirector(movie.getMovieData(name)));
            System.out.println(movie.getWriter(movie.getMovieData(name)));
            System.out.println(movie.getActorListViaApi(movie.getMovieData(name)));
            System.out.println(movie.getGener(movie.getMovieData(name)));
            System.out.println(movie.getLanguage(movie.getMovieData(name)));
        }
        if (n == 2) {
            System.out.println("Enter the name of the actor/actress");
            String name = scanner.next();
            Actors actors = new Actors("", false, "", "", "");
            System.out.println(actors.getNetWorthViaApi(actors.getActorData(name)));
            System.out.println(actors.isAlive(actors.getActorData(name)));
            System.out.println(actors.getGender(actors.getActorData(name)));
            System.out.println(actors.getNationality(actors.getActorData(name)));
            System.out.println(actors.getDateOfDeathViaApi(actors.getActorData(name)));
        }
    }
}