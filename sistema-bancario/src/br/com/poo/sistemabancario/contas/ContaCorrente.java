package br.com.poo.sistemabancario.contas;

public class ContaCorrente extends Conta implements Tributo {

	private Integer totalSaques = 0;
	private Integer totalDepositos = 0;
	private Integer totalTransferencias = 0;
	private Double totalTributado = 0.0;
	
	public ContaCorrente() {
		super();
	}
	
	public ContaCorrente(String tipoConta, Integer numeroAgencia, Integer numeroConta, Double saldo, String cpf) {
		super(tipoConta, numeroAgencia, numeroConta, saldo, cpf);
	}

	public Integer getTotalSaques() {
		return this.totalSaques;
	}

	public Integer getTotalDepositos() {
		return this.totalDepositos;
	}
	
	@Override
	public void sacar(double valor) {
		if (valor < 0) {
			System.out.println("O valor digitado para saque é inválido!");
		} else {
			double valorTributado = tributarSaque(valor);
			if (this.saldo - valorTributado >= 0) {
				this.saldo -= valorTributado;
				this.totalTributado += Tributos.SAQUE;
				//Usamos printf para limitar as casas decimais
				System.out.println("\nOperação realizada com sucesso!\n");
				System.out.printf("Valor sacado: R$%.2f", valor, "\n");
				System.out.printf("Taxa para saque: R$%.2f", Tributos.SAQUE, "\n");
				System.out.printf("Saldo atual: R$%.2f", this.saldo, "\n");
				++totalSaques;
			} else {
				System.out.println("Valor digitado excede o saldo disponível!");
			}
		}
	}
	
	@Override
	public double tributarSaque(double valor) {
		return valor + Tributos.SAQUE;
	}

	@Override
	public String toString() {
		return "ContaCorrente [totalSaques=" + totalSaques + ", totalDepositos=" + totalDepositos
				+ ", totalTransferencias=" + totalTransferencias + ", totalTributado=" + totalTributado + "]";
	}
	

	
}
