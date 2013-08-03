package heranca;

public class Pessoa {
    private String nome;
    Endereco endereco;
    
    public Pessoa(String nome, String rua, Integer numero, String cidade){
        this.nome = nome;
        Endereco endereco = new Endereco(rua,numero,cidade);
        this.endereco = endereco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
