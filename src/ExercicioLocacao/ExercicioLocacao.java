package ExercicioLocacao;

public class ExercicioLocacao {
    public static void main(String[] args) {

            Categoria categoria[] = new Categoria[3];
            categoria[0] = new Categoria("Catálogo", 3);
            categoria[1] = new Categoria("Lançamento", 2, 25.);
            categoria[2] = new Categoria("Super lançamentos", 1, 50.);

            Genero genero[] = new Genero[13];
            genero[0] = new Genero("Ação");
            genero[1] = new Genero("Animação");
            genero[2] = new Genero("Aventura");
            genero[3] = new Genero("Comédia");
            genero[4] = new Genero("Documentário");
            genero[5] = new Genero("Drama");
            genero[6] = new Genero("Ficção");
            genero[7] = new Genero("Guerra");
            genero[8] = new Genero("Musical");
            genero[9] = new Genero("Policial");
            genero[10] = new Genero("Romance");
            genero[11] = new Genero("Suspense");
            genero[12] = new Genero("Terror");

            Cliente cliente[] = new Cliente[10];
            cliente[0] = new Cliente("Juliano");
            cliente[1] = new Cliente("Regiane");

            Filme filmes[] = new Filme[3];
            filmes[0] = new Filme("Coração Valente", genero[5], categoria[0]);
            filmes[1] = new Filme("Se Beber nao case 3", genero[3], categoria[2]);
            filmes[2] = new Filme("Os intocáveis", genero[5], categoria[1]);

            TipoMidia tipoMidia[] = new TipoMidia[3];
            tipoMidia[0] = new TipoMidia("DVD", 2.50);
            tipoMidia[1] = new TipoMidia("VHS", 2.50);
            tipoMidia[2] = new TipoMidia("BlueRay", 3.50);

            ItemLocacao[] itemLocacao = new ItemLocacao[10];
            itemLocacao[0] = new ItemLocacao("111", filmes[0], tipoMidia[0]);
            itemLocacao[1] = new ItemLocacao("222", filmes[0], tipoMidia[1]);
            itemLocacao[2] = new ItemLocacao("333", filmes[1], tipoMidia[0]);
            itemLocacao[3] = new ItemLocacao("444", filmes[1], tipoMidia[2]);
            itemLocacao[4] = new ItemLocacao("555", filmes[2], tipoMidia[0]);
            itemLocacao[5] = new ItemLocacao("666", filmes[2], tipoMidia[2]);
            
            /*******************************************************/
            
            Locacao locacao = new Locacao(cliente[0]);
            locacao.adicionaItem(itemLocacao[0]);
            locacao.adicionaItem(itemLocacao[2]);
            locacao.mostraLocacao();

            Locacao locacao1 = new Locacao(cliente[1]);
            locacao1.adicionaItem(itemLocacao[0]);
            locacao1.adicionaItem(itemLocacao[2]);
            locacao1.adicionaItem(itemLocacao[5]);
            locacao1.mostraLocacao();

	}

}
