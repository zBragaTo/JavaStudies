package interfaces.service;

import interfaces.entities.CarRental;
import interfaces.entities.Invoice;

public class RentalService {
	
	private double pricePerHour;
	private double pricePerDay;

	private BrazilTaxService taxService;

	public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		carRental.setInvoice(new Invoice(50.0, 10.0));
	}
	
}
