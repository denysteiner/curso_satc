public class IncrementoDecremento{
	public static void main(String[] args){
		int i = 10;
		int j = 3;
		int k = 0;
		k = ++j + i; //resultará em k = 4+10 = 14
		System.out.println(k);
		
		i = 10;
		j = 3;
		k = 0;
		k = j++ + i; //resultará em k = 3+10 = 13
		System.out.println(k);
	}
}