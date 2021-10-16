import java.util.Scanner;

//While
//	Calcular média de X alunos.
//	Notas válidas: entre 0 e 10
//	Contar quantas notas válidas foram digitadas
//	Usuário deve digitar -1 para sair do programa e ser informado da sua média e quantidade de notas

public class WhileExemplo {

	
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int quantidadeNotas = 0;
		double nota = 0.0;
		double total = 0.0;
		
		//while(true)
		while(nota != -1) {
			System.out.println("Digite a próxima nota: (ou digitar -1 para finalizar)");
			nota = entrada.nextDouble();
			
				if(nota >= 0 && nota <=10) {
					// quantidadeNotas = quantidadeNotas + 1; outra forma de adição
					quantidadeNotas += 1;
					total += nota;
				} else if (nota == -1) {
					double media = (total / quantidadeNotas);
					
					System.out.println("Quantidade de notas digitadas: "+ quantidadeNotas );
					System.out.printf("Média = %.2f", media);
					// break;
					
				} else {
					System.out.println("Nota inválida");
				}		
		}
		entrada.close();
	}
	
	//if (nota >= 0 && nota <= 10) {
    //    quantidadeNotas += 1;
    //    total += nota;
    //} else if (nota != -1) {
    //    System.out.println("Nota invalida");
    //}


}
