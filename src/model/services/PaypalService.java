package model.services;

public class PaypalService implements OnlinePaymentSerice {

	@Override
	public double Paymentfee(double amount) {

		return amount * 0.01;
	}

	@Override
	public double interest(double amount, int months) {

		return (amount * 0.02) * months;
	}

}
