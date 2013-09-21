package CollectionsExercicios;

import heranca.exercicios.Conta;
import heranca.exercicios.ContaCorrente;
import java.util.HashMap;
import java.util.Map;

public class Exercicio2_3 {
    public static void main(String[] args) {
        Conta c1 = new ContaCorrente();
        c1.deposita(10000);
        Conta c2 = new ContaCorrente();
        c2.deposita(30000);
        
        Map mapaDeContas = new HashMap();
        mapaDeContas.put("diretor",c1);
        mapaDeContas.put("gerente",c2);
        
        Conta contaDoDiretor = (Conta) mapaDeContas.get("diretor");
        
        System.out.println("SAldo Conta Diretor:"+contaDoDiretor.getSaldo());
        
    }
 
}
