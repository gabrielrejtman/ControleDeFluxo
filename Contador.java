import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Informe o primeiro parâmetro:");
		int parametroUm = terminal.nextInt();
		System.out.println("Informe o segundo parâmetro:");
		int parametroDois = terminal.nextInt();

		try {
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException exception) {
			// imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
			System.out.println(exception.getMessage());
		}

	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroDois <= parametroUm) {
			throw new ParametrosInvalidosException();
		}

		int contagem = parametroDois - parametroUm;
		System.out.println("Os números entre " + parametroUm + "e " + parametroDois + "são: ");
		for (int i = parametroUm + 1; i < parametroDois; i++) {

			if (contagem == 0)
				break;

			System.out.println(i);
			contagem--;

		}
	}
}
