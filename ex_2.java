import java.util.Scanner;
public class ex_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual o seu codigo do produto?");
		int code = sc.nextInt();
		System.out.println("Qual o peso do produto");
		float peso = sc.nextFloat();
		System.out.println("Qual o codigo do pais de origem");
		int countryCode = sc.nextInt();
		
		showInfo(code, peso, countryCode);
	}
	public static void showInfo(int code, float peso, int countryCode) {
		double percentual = 1;
		switch(countryCode) {
		case 1:
			break;
		case 2:
			percentual += 0.15;
			break;
		case 3:
			percentual += 0.25;
			break;
		default:
			System.out.println("Codigo do pais invalido!!");
			main(null);
			break;
		}
		if(code<1 || code>10) {
			System.out.println("Codigo do produto invalido!!");
			main(null);
		}
		System.out.println("Peso: "+peso*1000+" gramas");
		float valor_peso;
		if(code<=4)
			valor_peso = (peso*1000)*10;
		else if(code<=7)
			valor_peso = (peso*1000)*25;
		else if(code<=10)
			valor_peso = (peso*1000)*35;
		else 
			valor_peso = 0;
		
		double valor_total = valor_peso*percentual;
		System.out.println("Preço total: "+valor_total);
		System.out.println("Imposto: "+valor_peso*(percentual-1));

	}

}
