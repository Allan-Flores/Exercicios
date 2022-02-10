
public class ContaCorrente extends ContaBancaria{
	private int quantidadeTransaçõesRealizadas = 0;
	
	public ContaCorrente(String senha) {
		super(senha);
		this.quantidadeTransaçõesRealizadas = 0;
	}
	
	@Override
	public void saca(double valor) {
		saldo = saldo - valor;
		quantidadeTransaçõesRealizadas++;
	}
	
	@Override
	public void deposita(double valor) {
		saldo = saldo + valor;
		quantidadeTransaçõesRealizadas++;
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

	public int getQuantidadeTransaçõesRealizadas() {
		return quantidadeTransaçõesRealizadas;
	}

	public void setQuantidadeTransaçõesRealizadas(int quantidadeTransaçõesRealizadas) {
		this.quantidadeTransaçõesRealizadas = quantidadeTransaçõesRealizadas;
	}
	
}
