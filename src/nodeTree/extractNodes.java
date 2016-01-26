/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodeTree;

import org.jsoup.nodes.Element;

/**
 *
 * @author mm
 */
public class extractNodes {

    public String[] extractNodes(Element breadCrumb) {
        String fullText = breadCrumb.text();

        // Splitting String into subStrings each represent a node
        String[] nodes = fullText.split(">");
        
        // Loop for trimming the results to remove the spaces at
        // the end and beginning of words
        

        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = nodes[i].trim();
        }
        
        return nodes;
    }
    

}
