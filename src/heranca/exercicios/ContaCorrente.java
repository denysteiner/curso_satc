package heranca.exercicios;

public class ContaCorrente extends Conta implements TesteInterface.Tributavel{
    
    @Override
    public void atualiza(double taxa){
        super.atualiza(taxa*2);
    }

    @Override
    public void deposita(double valor){
        super.saca(0.10);
        super.deposita(valor);
    }

    @Override
    public double calculaTributos() {
        return this.getSaldo()*0.01;
    }
    
}
