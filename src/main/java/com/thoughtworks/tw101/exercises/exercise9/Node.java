package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Node implements Comparator<String> {
    private String name;

    Node left;
    Node right;

    private ArrayList<String> names = new ArrayList<>();

    public Node(String name) {
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void add(String nameOfNewNode) {
        insert(this, nameOfNewNode);
    }

    private Node insert(Node rootNode, String nameOfNewNode) {
        if(rootNode == null) {
            rootNode = new Node(nameOfNewNode);
            return rootNode;
        } else if(compare(rootNode.getName(), nameOfNewNode) > 0) {
            rootNode.left = insert(rootNode.left, nameOfNewNode);
        } else {
            rootNode.right = insert(rootNode.right, nameOfNewNode);
        }

        return rootNode;
    }

    public List<String> names() {
        ArrayList<String> alphabetizedNames = names;

        printNode(this);

        Collections.sort(names);

        return alphabetizedNames;
    }

    private void printNode(Node rootNode) {
        if(rootNode == null) {
            return;
        }
        printNode(rootNode.left);
        printNode(rootNode.right);

        names.add(rootNode.getName());
    }

    public String getName() {
        return name;
    }

    @Override
    public int compare(String nameOfCurrentNode, String nameOfNewNode) {
        return nameOfCurrentNode.compareTo(nameOfNewNode);
    }
}
