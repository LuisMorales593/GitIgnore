package Entornos;

public class CajaFuerte {
	 private double saldo;
	 

	    public CajaFuerte(double saldoInicial) {
	        if (saldoInicial < 0) {
	            throw new IllegalArgumentException("El saldo inicial no puede ser negativo");
	        }
	        this.saldo = saldoInicial;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void depositar(double cantidad) {
	        if (cantidad <= 0) {
	            throw new IllegalArgumentException("La cantidad a depositar debe ser positiva");
	        }
	        saldo += cantidad;
	    }

	    public void retirar(double cantidad) {
	        if (cantidad <= 0) {
	            throw new IllegalArgumentException("La cantidad a retirar debe ser positiva");
	        }
	        if (cantidad > saldo) {
	            throw new IllegalStateException("Fondos insuficientes");
	        }
	        saldo -= cantidad;
	    }

	    public boolean estaVacia() {
	        return saldo == 0;
	    }

}
