package listaDeExercicios3103;

public class ContaBancaria {

	/*
	 * Elabore uma classe ContaBancaria, com os seguintes membros:
	 * atributo String cliente
	 * atributo int num_conta
	 * atributo float saldo
	 * método sacar (o saldo não pode ficar negativo)
	 * método depositar
	 */
	
	String nomeCliente;
	int numConta;
	float saldo;
	
	public void sacar(float valor) {
		if(valor > this.saldo) {
			System.out.println("Erro");
		}
		else {
			this.saldo = this.saldo - valor;
		}
	}
	
	public void depositar(float valor) {
		this.saldo = valor + this.saldo;
	}
	
	
	
}
