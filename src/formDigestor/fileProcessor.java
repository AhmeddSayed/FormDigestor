package formDigestor;

import static formDigestor.FormDigestor.doc;
import forms.formElement;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import nodeTree.extractNodes;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.select.Elements;

public class fileProcessor {
    int formCount;
    public void fileProcessor() {
        formCount = 0;
    }

    public String[] processFile(File allFile) {
        if (allFile.isFile()) {
            try {
                // reading the file as an html document and storing it in a doc file
                doc = Jsoup.parse(allFile, "iso-8859-1", "file:///F:/Ahmed/yellout/");
            } catch (IOException ex) {
                Logger.getLogger(FormDigestor.class.getName()).log(Level.SEVERE, null, ex);
            }
            //System.out.println(allFile.getName());
        }
        // getting the breadCrumb path from the html document
        // and using it as an Element
        Elements breadCrumbs = doc.getElementsByClass("location");
        
        formElement newForm = new formElement(doc.getElementById("form1"));
       
        formCount++;
        
        
        // passing the breadCrumb element to extract the nodes
        extractNodes newNodes = new extractNodes();
        return newNodes.extractNodes(breadCrumbs.first());
    }
    
    public int getFormCount(){
        return formCount;
    }
}
