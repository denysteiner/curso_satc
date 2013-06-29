package banco;

public class Conta {
  Integer numero;
  String dono;
  Double saldo, limite;
  
  boolean sacar(Double valor){
      if (saldo >= valor){
          saldo -= valor;
          return true;
      } else {
          return false;
      }
      
  }
  public void deposita(Double valor){
      saldo += valor;
  }
  public boolean transfere(Conta contaDestino, Double valor){
      if (sacar(valor)){
          contaDestino.deposita(valor);
          return true;
      } else{
          return false;
      }
          
      
  }
  
}
