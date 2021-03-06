
public class ContaCorrente extends ContaBancaria{
	private int quantidadeTransaš§esRealizadas = 0;
	
	public ContaCorrente(String senha) {
		super(senha);
		this.quantidadeTransaš§esRealizadas = 0;
	}
	
	@Override
	public void saca(double valor) {
		saldo = saldo - valor;
		quantidadeTransaš§esRealizadas++;
	}
	
	@Override
	public void deposita(double valor) {
		saldo = saldo + valor;
		quantidadeTransaš§esRealizadas++;
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

	public int getQuantidadeTransaš§esRealizadas() {
		return quantidadeTransaš§esRealizadas;
	}

	public void setQuantidadeTransaš§esRealizadas(int quantidadeTransaš§esRealizadas) {
		this.quantidadeTransaš§esRealizadas = quantidadeTransaš§esRealizadas;
	}
	
}
