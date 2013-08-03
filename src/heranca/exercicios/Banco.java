package heranca.exercicios;

public class Banco {
    private Conta[] conta = new Conta[10];
    private int totalConta = 0;
    
    public void adiciona(Conta c){
        conta[totalConta] = c;
        totalConta++;
    }
    
    public Conta pegaConta(int x){
        return conta[x];
    }

    public int pegaTotalDeContas(){
        return totalConta;
    }
}
