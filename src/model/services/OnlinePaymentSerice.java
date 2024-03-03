package model.services;

public interface OnlinePaymentSerice {

	public double Paymentfee(double amount);

	public double interest(double amount, int months);
}
