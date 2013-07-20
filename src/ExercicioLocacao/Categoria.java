package ExercicioLocacao;

public class Categoria {
   private static String[] categoria = {"Catálogo", "Lançamento", "Super lançamentos"};
   private static Double[] acrescimo = {0.0, 25.0, 50.0};
   private static Integer[] prazoDevolucao = {3, 2, 1};
   
   public static String getCategoria(Integer posicao) {
	   return categoria[posicao];
    }

    public static Double getAcrescimo(/*Double valor, */Integer categoria) {
        //return valor + (acrescimo[categoria] / 100 * valor);
        return acrescimo[categoria];
    }

    public static Integer getPrazoDevolucao(Integer categoria) {
        return prazoDevolucao[categoria];
    }
   
}
