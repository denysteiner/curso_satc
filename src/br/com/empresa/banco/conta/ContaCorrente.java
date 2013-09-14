package br.com.empresa.banco.conta;

public class ContaCorrente implements Conta {

    private double saldo;
    protected int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    @Override
    public void atualiza(double taxa){
//        super.atualiza(taxa*2);
    }

    @Override
    public void deposita(double valor) throws ValorInvalidoException {
        if (valor < 0){
            throw new ValorInvalidoException(valor);
        } else{
//            saca(0.10);
            this.saldo+=valor;
        }
    }

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void saca(double valor) throws ValorInvalidoException{
        if (valor < 0){
            throw new ValorInvalidoException(valor);
        } else{
            if (this.saldo>=valor){
                this.saldo -= valor;
            } else {
                throw new ValorSaqueForaDoLimiteException(valor,this.getSaldo());
            }
        }
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ContaCorrente other = (ContaCorrente) obj;
        if (Double.doubleToLongBits(this.saldo) != Double.doubleToLongBits(other.saldo)) {
            return false;
        }
        return true;
    }
    
}
