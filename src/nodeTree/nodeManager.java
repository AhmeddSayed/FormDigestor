package nodeTree;

import java.util.ArrayList;

public class nodeManager {

    node Head;

    public nodeManager() {
        this.init();
    }

    private void init() {
        Head = new node("root");
    }

    public void addNodes(String[] nodes) {
        node currentNode;
        boolean insertMode = false;
        node previousNode = null;

        for (String node : nodes) {
            currentNode = nodeExists(Head, node);

            if (currentNode == null) {
                // not found
                currentNode = new node(node);
                if (previousNode != null) {
                    previousNode.children.add(currentNode);
                } else {
                    Head.children.add(currentNode);
                }
            } else {
                //currentNode.children.add(new node(node));
            }
            previousNode = currentNode;
        }
    }

    public node nodeExists(node currentNode, String nodeName) {
        if (currentNode.name.equals(nodeName)) {
            return currentNode;
        }
        if (currentNode.children.isEmpty()) {
            return null;
        } else {
            return nodeExists(currentNode.children, nodeName);
        }
    }

    public node nodeExists(ArrayList<node> childs, String nodeName) {
        node bingo = null;
        node currentNode;
        for (node child : childs) {
            currentNode = nodeExists(child, nodeName);
            if (currentNode != null) {
                bingo = currentNode;
            }
        }
        return bingo;
    }

    public void printAll() {
        printAll(Head);

    }

    public void printAll(node currentNode) {
        if (currentNode.name.equals("root")) {
            System.out.println("--> Head <--\n\n");
        } else {
            System.out.print(currentNode.name);
        }
        if (!currentNode.children.isEmpty()) {
            for (node child : currentNode.children) {
                //System.out.print("->"+child.name);
                System.out.print("->");
                printAll(child);
            }
        }else{
            System.out.println("\n");
        }
    }

}
