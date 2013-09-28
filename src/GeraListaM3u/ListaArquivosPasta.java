package GeraListaM3u;
import java.io.File;

/**
 *
 * @author deny
 */
public abstract class ListaArquivosPasta {

    /**
     *
     * @param pasta
     * @param prefixo
     * @return
     */
    public static String ListaArqMp3(String pasta,String prefixo){
        String listaRet;
        File file;  
        file = new File(pasta);
        File vetFile[];  
        vetFile = file.listFiles();
        listaRet = "";
        for(int i = 0; i < vetFile.length; i++){  
            if (vetFile[i].toString().endsWith(".mp3")){  
                if (prefixo.length() > 0) { listaRet += prefixo + "\\"; }
                listaRet += vetFile[i].toString().substring(vetFile[i].toString().lastIndexOf("\\")+1, 
                                                            vetFile[i].toString().length());
                listaRet += "\r\n";
            }
        }
        return listaRet;
    }
}
