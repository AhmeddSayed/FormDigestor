package formDigestor;

import nodeTree.nodeManager;
import java.io.File;
import org.jsoup.nodes.Document;

public class FormDigestor {

    // initiating variables:
    static Document doc;
    static nodeManager theNodeManager = new nodeManager();
    static fileProcessor theFileProcessor = new fileProcessor();

    // loading all files in the folder:
    static folder allFiles = new folder();

    // This is the main method
    public static void main(String[] args) {
        // looping through files
        for (File allFile : allFiles.allFiles) {
            // readingg the breadCrumbs String
            String[] breadCrumbs = theFileProcessor.processFile(allFile);
            // adding the breadCrumbs as nodes in the tree
            theNodeManager.addNodes(breadCrumbs);

            //System.out.println(theFileProcessor.getFormCount());
        }
        theNodeManager.printAll();
    }

}
