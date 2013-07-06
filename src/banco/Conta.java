package banco;

public class Conta {
    private String dono;
    private Integer numero;
    private Double saldo;
    private Double limite;
    private Data inclusao;
    private static Integer contadorInstancias = 0;

    Conta(String dono, Integer numero) {
        this.dono = dono;
        this.numero = numero;
        this.limite = 0.;
        this.saldo = 0.;
        this.contadorInstancias++;
    }

    Conta(String dono, Integer numero, Double saldo) {
        this(dono, numero);
        this.saldo = saldo;
        this.limite = 0.;
        //this.inclusao = new Data();
    }

    Conta(String dono, Integer numero, Double saldo, Double limite, Integer dia, Integer mes, Integer ano) {
        this(dono, numero, saldo);
        this.limite = limite;
        this.inclusao = new Data(dia, mes, ano);
    }

    public static Integer getContadorInstancias() {
        return contadorInstancias;
    }

    void mostraConta() {
        StringBuilder sb = new StringBuilder();
        sb.append("Conta:").append(dono).append(" | ");
        sb.append("Numero:").append(numero).append(" | ");
        sb.append("Inclusão:").append(inclusao.mostraData()).append(" | ");
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
