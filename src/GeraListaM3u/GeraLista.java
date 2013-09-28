/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GeraListaM3u;

/**
 *
 * @author deny
 */
public abstract class GeraLista {
   public static void Lista (String pasta){
        String mp3listname,arquivoGravar;
        if (!pasta.equals("")){
            mp3listname = pasta.substring(pasta.lastIndexOf("\\")+1, pasta.length());
            arquivoGravar = pasta+"\\Lista_"+mp3listname+".m3u";
            GravaArquivo.Grava(arquivoGravar, ListaPastas.ListaPasta(pasta,""));
        }
   } 
}
