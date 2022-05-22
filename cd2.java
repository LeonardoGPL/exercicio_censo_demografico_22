package Censo_demografico;

//importar a classe scanner
import java.util.Scanner;

public class cd2 {

	public static void main(String[] args) {
		// declarando scanner para entrada de dados
		Scanner batman = new Scanner(System.in);
		// criando variaveis
		int fem = 0, masc = 0, out = 0, g;
		float n, altura = 0, alturaf = 0, alturam = 0, alturao = 0, porcentagem = 0, idadef = 0, idadem = 0, idadeo = 0,
				idade = 0, idaden = 0, mig, maf, mim;
		// criando laco de repeticao
		for (n = 0; n <= 999; n++) {
			// exibir na tela
			System.out.println(
					"Responda a pesquisa de acordo com suas informações\nGenero:\n0-Feminino\n1-Masculino\n2-Outros");
			// atribuindo valor digitado pelo usuario
			g = batman.nextInt();
			// switch para armazenar os dados digitados
			switch (g) {
			case 0:
				fem++;
				System.out.println("Qual sua altura?");
				altura = batman.nextFloat();
				alturaf = alturaf + altura;
				System.out.println("Qual sua idade?");
				idade = batman.nextFloat();
				idadef = idadef + idade;
				if (idade >= 18 && idade <= 35)
					idaden++;
				break;
			case 1:
				masc++;
				System.out.println("Qual sua altura?");
				altura = batman.nextFloat();
				alturam = alturam + altura;
				System.out.println("Qual sua idade?");
				idade = batman.nextFloat();
				idadem = idadem + idade;
				if (idade >= 18 && idade <= 35)
					idaden++;

				break;
			case 2:
				out++;
				System.out.println("Qual sua altura?");
				altura = batman.nextFloat();
				alturao = alturao + altura;
				System.out.println("Qual sua idade?");
				idade = batman.nextFloat();
				idadeo = idadeo + idade;
				if (idade >= 18 && idade <= 35)
					idaden++;
				break;
			}

		}
		// inserindo variaveis com expressoes matematicas
		mig = (idadef + idadem + idadeo) / (fem + masc + out);
		maf = alturaf / fem;
		mim = idadem / masc;
		porcentagem = idaden / (fem + masc + out);
		// exibir na tela
		System.out.println("Media de Idade do grupo e de " + mig);
		System.out.println("\nMedia da altura das mulheres e " + maf);
		System.out.println("\nMedia da idade dos homens e " + mim);
		System.out.println("\nQuantidade de pessoas que identificaram como outros sao " + out);
		System.out.println("\nPercentual de pessoas com idade entre 18 e 35 anos e " + (porcentagem * 100) + "%");

	}

}
