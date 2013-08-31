package br.com.empresa.banco.conta;

public class ContaCorrente implements Conta {
    private double saldo;
    
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
    
}
