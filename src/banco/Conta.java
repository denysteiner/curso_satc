package banco;

public class Conta {
    private String dono;
    private Integer numero;
    private Double saldo;
    private Double limite;

    Conta(String dono, Integer numero, Double saldo, Double limite) {
        this.dono = dono;
        this.numero = numero;
        this.saldo = saldo;
        this.limite = limite;
    }
    void mostraConta() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conta:").append(dono).append(" | ");
        sb.append("Numero:").append(numero).append(" | ");
        sb.append("Saldo:").append(saldo).append(" | ");
        sb.append("Limite:").append(limite).append(" | ");
        sb.append("Saldo com Limite:").append(getSaldoComLimite());
        System.out.println(sb);
    }
    Double getSaldo() {
        return saldo;
    }
    Double getSaldoComLimite() {
        return saldo + limite;
    }

    Double getLimite() {
        return limite;
    }
    boolean sacar(Double valor) {
        if (getSaldoComLimite() >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public void deposita(Double valor) {
        saldo += valor;
    }

    public boolean transfere(Conta contaDestino, Double valor) {
        if (sacar(valor)) {
            contaDestino.deposita(valor);
            return true;
        } else {
            System.out.println("Não efetuou a transferencia");
            return false;
        }
    }
  
}
