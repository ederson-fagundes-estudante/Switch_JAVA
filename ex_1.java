import java.util.Scanner;
public class ex_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu codigo de funcionario?");
		int code = sc.nextInt();
		System.out.println("Qual o seu salario");
		float salario = sc.nextFloat();
		

		showInfo(code, salario);
	}
	public static void showInfo(int code, float salario) {
		double percentual = 1;
		switch(code) {
		case 1:
			System.out.println("Codigo 1 - Escriturário");
			percentual = 1.5;
			break;
		case 2:
			System.out.println("Codigo 2 - Secretário");
			percentual = 1.35;
			break;
		case 3:
			System.out.println("Codigo 3 - Caixa");
			percentual = 1.20;
			break;
		case 4:
			System.out.println("Codigo 4 - Gerente");
			percentual = 1.10;
			break;
		case 5:
			System.out.println("Codigo 5 - Diretor");
			break;
		default:
			System.out.println("Valor invalido!!");
			main(null);
			break;
		}
		System.out.println("Aumento do salario: "+(salario*percentual));
		
	}

}
