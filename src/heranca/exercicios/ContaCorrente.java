package heranca.exercicios;

public class ContaCorrente extends Conta {
    
    public void atualiza(double taxa){
        super.atualiza(taxa*2);
    }

    public void deposita(double valor){
        super.deposita(valor);
        super.saca(0.10);
    }
    
}
