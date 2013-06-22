package aula3;

/* ESTUDAE REGEX*/
public class aula1 {
   public static void main (String[] args){
      Carro lancer = new Carro();
      Carro filder = new Carro();
      lancer.setNome("Lancer");
      lancer.setCor("Azul");
      filder.setNome("Filder");
      filder.setCor("Preto");
      lancer.acelerar();
      filder.acelerar();
      lancer.parar();
      filder.parar();
      System.out.println("Carro:"+lancer.getNome()+" Cor:"+lancer.getCor());
      System.out.println("Carro:"+filder.getNome()+" Cor:"+filder.getCor());
      
      Carro.lavar(lancer);
      
      
      double num1 = 9999;
      int num2 = (int)num1;
      
      System.out.println(filder instanceof Carro);
      //System.out.println(filder instanceof lancer);
      
      
   } 
}

