import java.util.Scanner;

public class TesteScanner{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o seu nome:");
		String name = sc.next();
		//int num = sc.nextInt();
		System.out.println("Ola " + name +"!");
	}
	
}