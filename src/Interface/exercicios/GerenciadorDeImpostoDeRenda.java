package Interface.exercicios;

public class GerenciadorDeImpostoDeRenda {
    private double total;
    
    public void adiciona(Tributavel tributavel){
        this.total += tributavel.calculaTributos();
    }
    
    public double getTotal(){
        return this.total;
    }  
    
}
