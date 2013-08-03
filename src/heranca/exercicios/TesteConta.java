package heranca.exercicios;

public class TesteConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        Conta c1 = new Conta();
        Conta cc1 = new ContaCorrente();
        Conta cp1 = new ContaPoupanca();
        
        c1.deposita(1000);
        cc1.deposita(1000);
        cp1.deposita(1000);
        c1.atualiza(0.01);
        cc1.atualiza(0.01);
        cp1.atualiza(0.01);
        System.out.println(c1.getSaldo());
        System.out.println(cc1.getSaldo());
        System.out.println(cp1.getSaldo());
        
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        System.out.println("SaldoTotal:"+adc.getSaldoTotal());

        /***************************************************************/
        Conta c2 = new Conta();
        Conta cc2 = new ContaCorrente();
        Conta cp2 = new ContaPoupanca();
        
        c2.deposita(1000);
        cc2.deposita(1000);
        cp2.deposita(1000);
        Banco banco = new Banco();
        banco.adiciona(c2);
        banco.adiciona(cc2);
        banco.adiciona(cp2);
        System.out.println("-----------------");
        AtualizadorDeContas adc1 = new AtualizadorDeContas(.01);
        for(int i=0;i<banco.pegaTotalDeContas();i++){
            adc1.roda(banco.pegaConta(i));
        }
        
    }
}
