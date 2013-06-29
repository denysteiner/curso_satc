package banco;


public class programa_funcionario {
   public static void main (String[] args){
       Departamento departamentoA = new Departamento("A",10.);
       Departamento departamentoB = new Departamento("B",15.);
       
       Funcionario func1 = new Funcionario("Joao",departamentoA,"123456",1000.,5,1,2013);
       Funcionario func2 = new Funcionario("Maria",departamentoB,"321654",2000.,15,10,2013);
       Funcionario func3 = func2;
       func1.mostra();
       //func1.recebeAumento(150.);
//     func1.mostra();
       /*
       if (func1.equals(func2)) {
           System.out.println("func1 = func2");
       } else{
           System.out.println("func1 <> func2");
       }
       if (func2.equals(func3)) {
           System.out.println("func2 = func3");
       } else{
           System.out.println("func2 <> func3");
       }
         */  
       func3.mostra();
       
   }    
}
