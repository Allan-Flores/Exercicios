
public abstract class ContaBancaria {
	private String senha = "";
	protected int numero = 0;
	protected double saldo = 0.0;

	public ContaBancaria(String senha) {
		this.senha = senha;
		//this.numero = numero;
		//this.saldo = saldo;
	}
	
	public abstract void saca(double valor);
	public abstract void deposita(double valor);
	public abstract void tiraExtrato();
	
	public void setSenha(String senhaAntiga, String senhaNova) {
		if(senha.equals(senhaAntiga)) {
			senha = senhaNova;
		}else System.out.println("Senha informada incorreta.");
	}

	public String getSenha() {
		return senha;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
