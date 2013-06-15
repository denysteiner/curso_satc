package aula3;

class carro {
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
}
/* ESTUDAE REGEX*/
public class aula1 {
   public static void main (String[] args){
      carro lancer = new carro();
      carro filder = new carro();
      lancer.setNome("Lancer");
      lancer.setCor("Azul");
      filder.setNome("Filder");
      filder.setCor("Preto");
      lancer.acelerar();
      filder.acelerar();
      lancer.parar();
      filder.parar();
      System.out.println("Carro:"+lancer.getNome()+" Cor:"+lancer.getCor());
      System.out.println("Carro:"+filder.getNome()+" Cor:"+filder.getCor());
      
              
              
              
              
      
   } 
}
