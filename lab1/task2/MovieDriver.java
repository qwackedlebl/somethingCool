
import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {

		var scan = new Scanner(System.in);
		var movie = new Movie();
		boolean repeat = true;
		boolean validInput = true;
		String repeater;

		do {
			
			System.out.println("Enter the name of a movie:");
			movie.setTitle(scan.nextLine());

			System.out.println("Enter the rating of the movie:");
			movie.setRating(scan.nextLine());

			System.out.println("Enter the number of tickets sold for this movie:");
			movie.setSoldTickets(scan.nextInt());
			scan.nextLine();

			System.out
					.println(movie.getTitle() + " (" + movie.getRating() + ") Tickets sold: " + movie.getSoldTickets());

			// input validation and checker loop
			do {
				System.out.println();
				System.out.println("Do you want to enter another? (y or n)");
				repeater = scan.nextLine();

				switch (repeater.charAt(0)) {
				case 'y':
					repeat = true;
					validInput = true;
					break;
				case 'n':
					repeat = false;
					validInput = true;
					break;
				default:
					System.out.println("Invald input. Please use y or n.");
					validInput = false;
				}

			} while (!validInput);
			
			System.out.println();
			
		} while (repeat);

		
		System.out.println("Goodbye!");
		
		
		scan.close();
		System.exit(0);
		
		
	}

}
