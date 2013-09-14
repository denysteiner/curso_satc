package Collections;

import br.com.empresa.banco.conta.ContaPoupanca;
import java.util.HashMap;
import java.util.Map;

public class TesteMap {
    public static void main(String[] args) {
        Map <String, ContaPoupanca> mapaDeContas = new HashMap<>();
        ContaPoupanca c1 = new ContaPoupanca();
        c1.setNumero(1973); // 3
        c1.deposita(4); // 2
        ContaPoupanca c2 = new ContaPoupanca();
        c2.setNumero(1462); // 1
        c2.deposita(3); // 2
        ContaPoupanca c3 = new ContaPoupanca();
        c3.setNumero(1854); // 2
        c3.deposita(2); // 1
        mapaDeContas.put("conta1", c1);
        mapaDeContas.put("conta2", c2);
        mapaDeContas.put("conta3", c3);
        
        System.out.println(mapaDeContas.get("conta2").getNumero());
        
        
    }
    
}
