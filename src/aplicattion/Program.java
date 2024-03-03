package aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		try {
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

			System.out.println("entre com os dados do contrato: ");
			System.out.println();
			System.out.print("numero: ");
			int number = sc.nextInt();
			sc.nextLine();
			Date date = sd.parse(sc.next());
			System.out.print("valor do cotrato: ");
			double totalValue = sc.nextDouble();

		} catch (ParseException e) {

			System.out.println("error " + e.getMessage());
		}

	}

}
