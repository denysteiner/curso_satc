package GeraListaM3u;

import java.io.File;

/**
 *
 * @author deny
 */
public abstract class ListaPastas {
    
    /**
     *
     * @param pasta
     * @param prefixo
     * @return
     */
    public static String ListaPasta(String pasta,String prefixo){
        String listaMP3,listaAux,pastaAux;
        listaMP3 = "";
        File file;
        file = new File(pasta);
        File vetFile[];  
        vetFile = file.listFiles();
        
        listaMP3 += "";
        for(int i = 0; i < vetFile.length; i++){  
            if (vetFile[i].isDirectory()) {
                pastaAux = "";
                if ( prefixo.length() > 0 ) { pastaAux += prefixo+"\\"; }
                pastaAux += vetFile[i].toString().substring(vetFile[i].toString().lastIndexOf("\\")+1, vetFile[i].toString().length());
                listaAux = ListaPastas.ListaPasta(vetFile[i].toString(),pastaAux);
                listaMP3 += listaAux;
            } 
        }
        listaAux = ListaArquivosPasta.ListaArqMp3(pasta,prefixo);
        listaMP3 += listaAux;
        return listaMP3;
    }
    
}
