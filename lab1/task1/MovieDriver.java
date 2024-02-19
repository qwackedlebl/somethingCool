
import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {

		var scan = new Scanner(System.in);
		var movie = new Movie();

		System.out.println("Enter the name of a movie:");
		movie.setTitle(scan.nextLine());

		System.out.println("Enter the rating of the movie:");
		movie.setRating(scan.nextLine());

		System.out.println("Enter the number of tickets sold for this movie:");
		movie.setSoldTickets(scan.nextInt());
		scan.nextLine();

		System.out.println(movie.getTitle() + " (" + movie.getRating() + ") Tickets sold: " + movie.getSoldTickets());

		System.out.println("Goodbye!");

		scan.close();
		System.exit(0);

	}

}
