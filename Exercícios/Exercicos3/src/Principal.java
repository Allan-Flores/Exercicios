import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantas contas deseja criar?");
		ContaBancaria[] cb = new ContaBancaria[Integer.parseInt(teclado.next())];
		
		for (int i = 0; i < cb.length; i++) {
			System.out.println("Qual tipo da conta deseja criar?\n1-Conta Corrente\n2-Conta Poupança");
			int tipoConta = Integer.parseInt(teclado.next());
			if(tipoConta == 1) cb[i] = new ContaCorrente("kddnfe");
			else cb[i] = new ContaPoupanca("kddnfe", 2.123);
		}
		
		
		

	}

}
