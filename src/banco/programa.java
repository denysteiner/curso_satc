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
        
        System.out.println("-");
        System.out.println("Saldo Conta1:"+conta1.saldo+" Saldo Conta2:"+conta2.saldo);
        System.out.println("-");
        sucesso = conta1.transfere(conta2, 500.);
        System.out.println("Transferencia:"+sucesso);
        System.out.println("Saldo Conta1:"+conta1.saldo+" Saldo Conta2:"+conta2.saldo);
        
        
        
        
        
    }
}
