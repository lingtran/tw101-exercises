package com.thoughtworks.tw101.exercises.exercise9;

import java.util.List;

public class Node implements Comparable {
    private String name;
    Node left;
    Node right;

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(Node node, String nameOfNewNode) {
        // create newNode
        Node newNode = new Node(nameOfNewNode);

        // if nameOfNode is < currentNode, add to currentNode.left
        // if nameOfNode is > currentNode, add to currentNode.right
        // if root is null, assign root to this newNode
        if(this.name.compareTo(newNode.name) < 0) {
            add(this.left, newNode.name);
        } else if (this.name.compareTo(newNode.name) > 0) {
            add(this.right, newNode.name);
        } else {
            System.out.println("hmm still thinking about what else");
        }
    }

    public List<String> names() {
        return null;
    }

    @Override
    public int compareTo(String name) {
        if(this.name > name) {
            return 1;
        } else if(this.name < name) {
            return -1;
        } else {
            return 0;
        }
    }
}
