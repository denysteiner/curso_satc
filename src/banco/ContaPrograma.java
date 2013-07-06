package banco;

public class ContaPrograma {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Conta1", 1, 0., 100.);
        Conta conta2 = new Conta("Conta2", 2, 0., 100.);
        boolean sucesso;

        System.out.println("-----------------------------------------");
        conta1.mostraConta();
        conta2.mostraConta();
        System.out.println("-----------------------------------------");
        conta1.deposita(100.);
        conta2.deposita(200.);
        conta1.mostraConta();
        conta2.mostraConta();
        System.out.println("-----------------------------------------");
        conta1.transfere(conta2, conta1.getSaldo());
        conta1.transfere(conta2, 50.);
        conta1.transfere(conta2, 40.);
        conta1.transfere(conta2, 50.);
        conta1.mostraConta();
        conta2.mostraConta();
        System.out.println("-----------------------------------------");



//        for (int i = 0; i < contas.length; i++) {
//            Conta conta = contas[i];
//            if (conta != null) {
//                System.out.println(conta.dono);
//            }
//            if (contas[i] != null){
//                System.out.println(conta.dono);
//            }
//        }
//        
//        // percorrer ARRAY
//        for (Conta conta: contas){
//            if (conta != null) {
//                System.out.println(conta.dono);
//            }
//        }
//        
    }
}
