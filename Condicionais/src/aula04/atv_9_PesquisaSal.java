package aula04;
import java.util.Scanner;

/*
1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o sal�rio e n�mero de filhos. A prefeitura deseja saber:  
a) m�dia do sal�rio da popula��o;
b) m�dia do n�mero de filhos;
c) maior sal�rio;
d) percentual de pessoas com sal�rio at� R$100,00.

*/
public class atv_9_PesquisaSal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		double salario;
		double totalsalario= 0.0;
		
		int nfilhos; 
		int totalfilhos = 0;
		int nPessoas100 = 0;
		
		double maiorsalario = 0;
		
		 
		for (int i = 1; i <= 20; i++) {
			System.out.printf("Digite o seu Salario da pessoa %d: \n", i);
			
			salario = entrada.nextDouble();
			totalsalario = totalsalario + salario;
			
			if(salario>maiorsalario) {
				maiorsalario = salario;
			}
			
			if (salario <=100.0) {
				nPessoas100 = nPessoas100 + 1;
			}
			
			System.out.printf("Digite o numero de filhos da pessoa %d: \n", i);
			nfilhos = entrada.nextInt();
			totalfilhos = totalfilhos + nfilhos;	
		}
		
		System.out.printf("A m�dia do salario da popula��o � R$ %.2f: \n", totalsalario/20);
		System.out.printf("A m�dia do n�mero de filhos � %.2f: \n", (double)totalfilhos/20);
		System.out.printf("O maior salario � R$ %.2f: \n", (double)maiorsalario );
		System.out.printf("O percentual de pessoal que ganham at� R$ 100,00 � %.0f por cento. \n", (double)nPessoas100/20*100);
		
		entrada.close();
	}

}