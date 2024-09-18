package Generics;

public class Main {

	public static void main(String[] args) {
		
		Par<Integer, String> par = new Par<>(1, "um");
		
		System.out.println("Primeiro: " + par.getPrimeiro());
		System.out.println("Segundo: " + par.getSegundo());
		
		Par<Double, Boolean> outroPar = new Par<>(2.5, true);
		System.out.println("Primeiro: " + outroPar.getPrimeiro());
		System.out.println("Segundo: " + outroPar.getSegundo());

	}

}
