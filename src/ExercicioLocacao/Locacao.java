package ExercicioLocacao;

import java.text.DecimalFormat;

public class Locacao {
    private Cliente cliente;
    private ItemLocacao[] itens = new ItemLocacao[20];
    private Integer totalItens = 0;
    
    public Locacao(Cliente cliente) {
        this.cliente = cliente;
    }

    public void adicionaItem(ItemLocacao item) {
        this.itens[totalItens] = item;
        totalItens++;
    }

    public Double getValorTotalLocacao() {
        Double total = 0.;
        for (ItemLocacao item : itens) {
            if (item != null) {
                total += item.getValor();
            }
        }
        return total;
    }
    
    public void mostraLocacao() {
        DecimalFormat df = new DecimalFormat("#,##0.00;(#,##0.00)");
        StringBuilder sb = new StringBuilder("");
        sb.append("============== Locação ==============\n");
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("Itens").append("\n");
        for (ItemLocacao item : itens) {
            if (item != null) {
                sb.append(item.getInfo());
            }
        }
        sb.append("Valor Total Locação ====> ").append(df.format(this.getValorTotalLocacao())).append("\n");
        System.out.println(sb);
        
    }
}
