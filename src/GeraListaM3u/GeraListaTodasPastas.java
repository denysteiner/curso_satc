/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package GeraListaM3u;

import java.io.File;

/**
 *
 * @author deny
 */
public abstract class GeraListaTodasPastas {
    public static void Lista(String pasta) {
        File file;
        file = new File(pasta);
        File vetFile[];  
        vetFile = file.listFiles();
        GeraLista.Lista(pasta);
        for(int i = 0; i < vetFile.length; i++){  
            if (vetFile[i].isDirectory()) {
                System.out.println(vetFile[i].toString());
                GeraLista.Lista(vetFile[i].toString());
                GeraListaTodasPastas.Lista(vetFile[i].toString());
            } 
        }
    }
    
}
