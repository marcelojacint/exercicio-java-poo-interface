package aplicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

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
			System.out.print("data (dd/MM/yyyy): ");
			Date date = sd.parse(sc.next());
			System.out.print("contract: ");
			double totalValue = sc.nextDouble();

			Contract contract = new Contract(number, date, totalValue);

			System.out.print("entre com o número de parcelas: ");
			int mounths = sc.nextInt();
			System.out.println();
			System.out.println("PARCELAS:");
			ContractService contractService = new ContractService(new PaypalService());
			contractService.processContract(contract, mounths);

			for (Installment install : contract.getInstallments()) {
				System.out.println(sd.format(install.getDueDate()) + " - " + install.getAmount());
			}

		} catch (ParseException e) {

			System.out.println("error " + e.getMessage());
		}

	}

}
