package banco;

public class programa_funcionario {
   public static void main (String[] args){
       Funcionario func1 = new Funcionario("Joao","RH","123456",500.,5,1,2013);
       Funcionario func2 = new Funcionario("Maria","Codificacao","321654",600.,5,1,2013);
       Funcionario func3 = func2;
       
       func1.mostra();
       func1.recebeAumento(150.);
       func1.mostra();
       
       if (func1 == func2) {
           System.out.println("func1 = func2");
       } else{
           System.out.println("func1 <> func2");
       }
       if (func2 == func3) {
           System.out.println("func2 = func3");
       } else{
           System.out.println("func2 <> func3");
       }
           
       func3.mostra();
       //System.out.println(func3.getClass().getName());
       System.out.println(String.format("00", 1));
       
   }    
}
