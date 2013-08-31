package heranca.exercicios;

import Interface.exercicios.Tributavel;

public class TestaTributavel {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        cc.deposita(100);
        System.out.println(cc.calculaTributos());
        System.out.println(cc.getSaldo());
        Tributavel t = cc;
        System.out.println(t.calculaTributos());
//        System.out.println(t.getSaldo());
    }
 
}
