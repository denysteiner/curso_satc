package heranca;

public class PessoaFisica extends Pessoa {
    private String cpf;

    public PessoaFisica(String nome, Endereco endereco){
        super(nome,endereco);
    }
    public PessoaFisica(String nome){
        this(nome,null);
    }
    
    public PessoaFisica(String nome, String rua, Integer numero, String cidade){
        Endereco endereco = new Endereco(rua,numero,cidade);
        this.endereco = endereco;
        //this(nome,endereco);
    }
    
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
