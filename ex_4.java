import java.util.Scanner;
public class ex_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Valor total da compra?");
		float v_total = sc.nextInt();

		System.out.println("Qual a forma de pagamento?");
		System.out.println("1 - Á vista");
		System.out.println("2 - Cheque pré-datado");
		System.out.println("3 - Pagamento parcelado 6x");
		System.out.println("4 - Pagamento parcelado 12x");
		int formaPagamento = sc.nextInt();
		
		showInfo(v_total, formaPagamento);
	}
	public static void showInfo(float v_total, int formaPagamento) {

		double percentual = 1;
		switch(formaPagamento) {
		case 1:
			percentual = 0.85;
			break;
		case 2:
			percentual = 0.9;
			break;
		case 3:
			break;
		case 4:
			percentual = 1.08;
			break;
		default:
			System.out.println("Codigo invalido!!");
			main(null);
			break;
		}
		System.out.println("Valor total: "+(v_total));
		
		System.out.println("Valor final da compra: "+(v_total*percentual));
		
		double diferença = (1-percentual)*v_total;
		
		if(diferença<0)
			System.out.println("Diferença: "+(-diferença)+" juros");
		else
			System.out.println("Diferença: "+diferença+" desconto");
		

	}

}
