package ExercicioLocacao;

public class TipoMidia {
   private static String[] tipoMidia = {"DVD","VHS","BlueRay"};
   private static Double[] valor = {2.50, 2.50, 3.50};

   public static String getMidia(Integer midia) {
	   return tipoMidia[midia];
    }

    public static Double getValor(Integer posicao) {
        return valor[posicao];
    }
}
