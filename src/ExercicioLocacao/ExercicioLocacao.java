package ExercicioLocacao;

public class ExercicioLocacao {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Filmes filmes[] = new Filmes[3];
            ItemLocacao[] itemLocacao = new ItemLocacao[10];
            Clientes cliente[] = new Clientes[10];
            cliente[0] = new Clientes("Juliano");
            cliente[1] = new Clientes("Regiane");

            filmes[0] = new Filmes("Coração Valente", 5, 0);
            filmes[1] = new Filmes("Se Beber nao case 3", 3, 2);
            filmes[2] = new Filmes("Os intocáveis", 5, 1);
		
            itemLocacao[0] = new ItemLocacao("111", filmes[0], 0);
            itemLocacao[1] = new ItemLocacao("222", filmes[0], 1);
            itemLocacao[2] = new ItemLocacao("333", filmes[1], 0);
            itemLocacao[3] = new ItemLocacao("444", filmes[1], 2);
            itemLocacao[4] = new ItemLocacao("555", filmes[2], 0);
            itemLocacao[5] = new ItemLocacao("666", filmes[2], 2);
            /**
             * ****************************************************
            */
            Locacao locacao = new Locacao(cliente[0]);
            locacao.AdicionaItem(itemLocacao[0], 0);
            locacao.AdicionaItem(itemLocacao[2], 1);
            locacao.mostraLocacao();

            Locacao locacao1 = new Locacao(cliente[1]);
            locacao1.AdicionaItem(itemLocacao[0], 0);
            locacao1.AdicionaItem(itemLocacao[2], 1);
            locacao1.AdicionaItem(itemLocacao[5], 2);
            locacao1.mostraLocacao();

	}

}
