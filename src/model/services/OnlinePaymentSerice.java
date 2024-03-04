package model.services;

public interface OnlinePaymentSerice {

	public double PaymentFee(double amount);

	public double interest(double amount, int months);
}
