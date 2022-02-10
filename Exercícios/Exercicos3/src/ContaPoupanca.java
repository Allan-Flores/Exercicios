
public class ContaPoupanca extends ContaBancaria implements Rentavel{
	private double taxaRendimento = 0;
	
	public ContaPoupanca(String senha, double taxaRendimento) {
		super(senha);
		this.taxaRendimento = taxaRendimento;
	}
	
	@Override
	public void saca(double valor) {
		saldo = saldo - valor;
	}
	
	@Override
	public void deposita(double valor) {
		saldo = saldo + valor;
	}
	
	@Override
	public void tiraExtrato() {
		System.out.println("Conta: "+numero+"\nSaldo: "+saldo);
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public double geTaxaRendimento() {
		return taxaRendimento;
	}

	public void setTaxaRendimento(double taxaRendimento) {
		this.taxaRendimento = taxaRendimento;
	}

	@Override
	public double calculaRendimento() {
		return saldo * taxaRendimento;
	}
	
}
