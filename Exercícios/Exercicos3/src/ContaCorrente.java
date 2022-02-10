
public class ContaCorrente extends ContaBancaria{
	private int quantidadeTransa��esRealizadas = 0;
	
	public ContaCorrente(String senha) {
		super(senha);
		this.quantidadeTransa��esRealizadas = 0;
	}
	
	@Override
	public void saca(double valor) {
		saldo = saldo - valor;
		quantidadeTransa��esRealizadas++;
	}
	
	@Override
	public void deposita(double valor) {
		saldo = saldo + valor;
		quantidadeTransa��esRealizadas++;
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

	public int getQuantidadeTransa��esRealizadas() {
		return quantidadeTransa��esRealizadas;
	}

	public void setQuantidadeTransa��esRealizadas(int quantidadeTransa��esRealizadas) {
		this.quantidadeTransa��esRealizadas = quantidadeTransa��esRealizadas;
	}
	
}
