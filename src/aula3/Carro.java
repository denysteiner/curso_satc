package aula3;

public class Carro {
    private String nome;
    private String cor;
    
    public void setNome(String p_nome){
        nome = p_nome;
    }
    public String getNome(){
        return nome;
    }

    public void setCor(String p_cor){
        cor = p_cor;
    }
    public String getCor(){
        return cor;
    }

    void acelerar() {
       System.out.println("Acelerando "+nome);
    }
    void parar() {
       System.out.println("Parando "+nome);
    }
    static void lavar(Carro carr){
        System.out.println("Lavando o Carro:"+carr.getNome());
    }
}
