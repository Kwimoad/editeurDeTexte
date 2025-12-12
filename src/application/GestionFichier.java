package application;

import javax.swing.text.rtf.RTFEditorKit;
import java.io.*;

public class GestionFichier {

    private String path;

    public GestionFichier(String nomFichier, String cheminFichier) {
        this.path = cheminFichier + "/" + nomFichier;
    }

    public GestionFichier(String path){
        this.path = path;
    }

    public void ecrire(String texte, javax.swing.JTextPane panelPrincipale) throws Exception {
        // enregistrer avec le meme style
        try (FileOutputStream fos = new FileOutputStream(path)) {
            RTFEditorKit rtf = new RTFEditorKit();
            rtf.write(fos, panelPrincipale.getStyledDocument(), 0, panelPrincipale.getStyledDocument().getLength());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void lire(javax.swing.JTextPane panelPrincipale) throws Exception {
        /*StringBuilder contenu = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                contenu.append(line).append("\n");
            }
        }
        return contenu.toString();

         */
        // affichage avec le meme style d'enregistrement
        try (FileInputStream fis = new FileInputStream(path)) {
            RTFEditorKit rtf = new RTFEditorKit();
            panelPrincipale.setDocument(rtf.createDefaultDocument());
            rtf.read(fis, panelPrincipale.getDocument(), 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getPath(){
        return this.path;
    }

    public void setPath(String path){
        this.path = path;
    }

}