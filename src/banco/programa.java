package banco;

public class programa {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        boolean sucesso;
        conta1.dono = "conta1";
        conta1.limite = 0.;
        conta1.numero = 1;
        conta1.saldo = 1000.;
        conta2.dono = "conta2";
        conta2.limite = 0.;
        conta2.numero = 2;
        conta2.saldo = 0.;
        
        //System.out.println(conta1.dono);
        //System.out.println(conta1.saldo);
        //sucesso = conta1.sacar(150.);
        //conta1.deposita(300.);
        //System.out.println(conta1.saldo);
        //System.out.println("saque1:"+sucesso);
        /*
        System.out.println("-");
        System.out.println("Saldo Conta1:"+conta1.saldo+" Saldo Conta2:"+conta2.saldo);
        System.out.println("-");
        sucesso = conta1.transfere(conta2, 500.);
        System.out.println("Transferencia:"+sucesso);
        System.out.println("Saldo Conta1:"+conta1.saldo+" Saldo Conta2:"+conta2.saldo);
        */
        
        Conta[] contas = new Conta[10];
        contas[0] = new Conta();
        contas[1] = new Conta();
        
        contas[0] = conta1;
        contas[1] = conta2;
        
        contas[0].dono = "teste0";
        contas[1].dono = "teste1";
        
        //System.out.println(contas[0].dono);
        
        for (int i = 0; i < contas.length; i++) {
            Conta conta = contas[i];
            if (conta != null) {
                System.out.println(conta.dono);
            }
            if (contas[i] != null){
                System.out.println(conta.dono);
            }
        }
        
        // percorrer ARRAY
        for (Conta conta: contas){
            if (conta != null) {
                System.out.println(conta.dono);
            }
        }
        
    }
}
