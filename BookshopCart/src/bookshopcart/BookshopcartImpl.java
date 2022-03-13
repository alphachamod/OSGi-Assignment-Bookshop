package bookshopcart;
import java.util.Scanner;

public class BookshopcartImpl implements BookshopcartPublisher  {

	@Override
	public String Books(int total) {
		
		System.out.println("Your total bill for the selected book" +total);
		System.out.print("Proceed with payment (Y/N): ");
		
		try (Scanner totl = new Scanner(System.in)) {
			String tlt = totl.next();
			
			return tlt;
		}
		catch (Exception error) {
			System.out.println(error);
		}
		return null;
	}
	
}
