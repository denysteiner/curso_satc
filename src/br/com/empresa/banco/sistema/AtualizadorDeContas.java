package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ValorInvalidoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AtualizadorDeContas {
   private double saltoTotal = 0;
   private double selic;
   
   public AtualizadorDeContas(double selic){
       this.selic = selic;
   }
   
   public void roda(Conta c){
       System.out.print("Salto anterior:"+c.getSaldo());
       try {
           c.deposita(c.getSaldo()*selic);
       } catch (ValorInvalidoException ex) {
           Logger.getLogger(AtualizadorDeContas.class.getName()).log(Level.SEVERE, null, ex);
       }
       System.out.println(" Salto atualizado:"+c.getSaldo());
       this.saltoTotal += c.getSaldo();
   }
   
   public double getSaldoTotal(){
       return this.saltoTotal;
   }
           
}
