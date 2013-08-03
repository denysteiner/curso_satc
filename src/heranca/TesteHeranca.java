package heranca;

public class TesteHeranca {
    public static void main(String[] args){
        PessoaFisica pessoafisica = new PessoaFisica("nome","rua testeRua",123,"cidadeTeste","12345678901");
        pessoafisica.mostra();
        PessoaJuridica pessoajuridica = new PessoaJuridica("nome","rua testeRua",123,"cidadeTeste","12345678901");
        pessoajuridica.mostra();
    }
}
