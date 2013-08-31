package br.com.empresa.banco.conta;




import br.com.empresa.banco.conta.Conta;

public class ContaPoupanca implements Conta {
    private double saldo;
    
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
