package Collections;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ValorInvalidoException;
import java.util.ArrayList;
import java.util.List;

public class CollectionsExemplo1 {
    public static void main(String[] args) throws ValorInvalidoException {
//       ArrayList lista = new ArrayList();
       List lista = new ArrayList();
       lista.add("item1");
       lista.add("item2");
       lista.add("item3");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i+" - "+lista.toString());
        }
        
        /*************************************************/
        // <ContaCorrente> >> este código indica que a lista é do tipo ContaCorrente'
        List <ContaCorrente> contas = new ArrayList<ContaCorrente>();
        ContaCorrente c1 = new ContaCorrente();
        ContaCorrente c2 = new ContaCorrente();
        ContaCorrente c3 = new ContaCorrente();
        ContaCorrente conta = new ContaCorrente();
        
        c1.deposita(10);
        c2.deposita(20);
        c3.deposita(30);
        
        contas.add(c1);
        contas.add(c2);
        contas.add(c3);
        
        for (ContaCorrente cc:contas) {
           System.out.println(cc.getSaldo());
        }
    }
    
}
