package model.services;

import java.util.Calendar;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	OnlinePaymentSerice onlinePaymentSerice;

	public ContractService(OnlinePaymentSerice onlinePaymentSerice) {
		this.onlinePaymentSerice = onlinePaymentSerice;
	}

	public void processContract(Contract contract, int months) {
		double parcela = contract.getTotalValue() / months; // obtendo o valor da parcela

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(contract.getDate());

		for (int i = 1; i <= months; i++) {
			calendar.add(calendar.MONTH, 1);

			double interest = parcela + onlinePaymentSerice.interest(parcela, i); // calculando impostos
			double paymentFee = interest + onlinePaymentSerice.PaymentFee(interest); // calculando as taxas de pagamento

			Installment installment = new Installment(calendar.getTime(), paymentFee);
			contract.addInstall(installment);

		}
	}

}
