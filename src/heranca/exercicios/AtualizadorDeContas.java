package heranca.exercicios;

public class AtualizadorDeContas {
   private double saltoTotal = 0;
   private double selic;
   
   public AtualizadorDeContas(double selic){
       this.selic = selic;
   }
   
   public void roda(Conta c){
       System.out.print("Salto anterior:"+c.getSaldo());
       c.deposita(c.getSaldo()*selic);
       System.out.println(" Salto atualizado:"+c.getSaldo());
       this.saltoTotal += c.getSaldo();
   }
   
   public double getSaldoTotal(){
       return this.saltoTotal;
   }
           
}
