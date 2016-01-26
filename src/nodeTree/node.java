package nodeTree;

import java.util.ArrayList;

public class node {

    int parentIndex, nodeIndex;
    String name;
    ArrayList<node> children = new ArrayList<>();

    public node(String nodeName) {
        // making sure that node is empty and have no children
        children.clear();
        this.name = nodeName;
    }

    public void addChild(String newNodeName) {
        node newNode = new node(newNodeName);
        children.add(newNode);
    }
    
    public void addData(){
        
    }

}
