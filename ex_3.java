import java.util.Scanner;
public class ex_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a quantidade de livros?");
		int livros = sc.nextInt();
		
		showInfo(livros);
	}
	public static void showInfo(int livros) {

		double A = 0.25*livros+7.5;
		double B = 0.5*livros+2.5;

		boolean bBigger = (B>A);
		
		if(bBigger)
			System.out.println("A a melhor opção");
		else
			System.out.println("B a melhor opção");

	}

}
