package br.com.empresa.banco.conta;

public class ContaPoupanca implements Conta, Comparable<ContaPoupanca>{
    private double saldo;
    protected int numero;

    @Override
    public int compareTo(ContaPoupanca o){
        if (this.getNumero() < o.getNumero()){
            return -1;
        }
        if (this.getNumero() > o.getNumero()){
            return 1;
        }
        return 0;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public void atualiza(double taxa){
//        super.atualiza(taxa*3);
    }

    @Override
    public double getSaldo() {
       return this.saldo;
    }

    @Override
    public void deposita(double valor) {
        if (valor < 0){
            throw new IllegalArgumentException();
        } else {
            this.saldo+=valor;
        }
    }

    @Override
    public void saca(double valor) {
        if (this.saldo>=valor){
            this.saldo -= valor;
        } else {
            
        }
    }
    
}
