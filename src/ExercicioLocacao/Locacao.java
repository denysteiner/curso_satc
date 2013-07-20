package ExercicioLocacao;

public class Locacao {
    private Clientes cliente;
    private ItemLocacao[] itens = new ItemLocacao[20];
    
    public Locacao(Clientes cliente) {
        this.cliente = cliente;
    }

    public void AdicionaItem(ItemLocacao item, Integer posicao) {
        this.itens[posicao] = item;
    }

    public void mostraLocacao() {
        Double total = 0.;
        StringBuilder sb = new StringBuilder("");
        sb.append("============== Locação ==============\n");
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("Itens").append("\n");
        for (ItemLocacao item : itens) {
            if (item != null) {
                sb.append("Titulo: ").append(item.getFilmes().getTitulo());
                sb.append(" - Genero: ").append(item.getFilmes().getGenero());
                sb.append(" - Valor: ").append(item.getValor());
                sb.append(" - Entregar em ").append(item.getPrazo()).append(" dia(s)").append("\n");
                total += item.getValor();
            }
        }
        sb.append("Valor Total Locação ====> ").append(total).append("\n");
        System.out.println(sb);


        //
                /*                          ============== Locação ==============
                 Cliente: Klaus
                 Itens	
                 Titulo: O Corvo Genero: Terror Valor: 2.5 Entregar em 3 dia(s)
                 Titulo: Homem de Ferro 3 Genero: Ação Valor: 3.75 Entregar em 1 dia(s)
                 Valor Total Locação ====> 6.25
                 */
    }
}
