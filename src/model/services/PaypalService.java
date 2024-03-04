package model.services;

public class PaypalService implements OnlinePaymentSerice {

	public PaypalService() {
	}

	@Override
	public double PaymentFee(double amount) {

		return amount * 0.02;
	}

	@Override
	public double interest(double amount, int months) {

		return months * (amount * 0.01);
	}

}
