package aula1;

public class Condicional{
	public static void main(String[] args){
		String status = "";
		int grade = 80;
		//status do aluno
		status = (grade >= 60)?"Passou":"Reprovou";
		//print status
		System.out.println( status );
	}
}