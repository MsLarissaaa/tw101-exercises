package com.thoughtworks.tw101.exercises.exercise9;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class Node {
    private String name;
    private Node left, right;
    private List<String> listOfNames;

    Node(String name) {
        this.name = name;
        left = null;
        right = null;
        listOfNames = new ArrayList<>();
    }

    void add(String nameOfNewNode) {
        if (left == null){
            left = new Node(nameOfNewNode);
        } else if(right == null){
            right = new Node(nameOfNewNode);
        } else {
            if(countNodes(left)<= countNodes(right)){
                left.add(nameOfNewNode);
            } else {
                right.add(nameOfNewNode);
            }
        }
    }

    private static int countNodes(Node root){
        if (root == null){
            return 0;
        } else {
            int count = 1;
            count += countNodes(root.left);
            count += countNodes(root.right);
            return count;
        }
    }

    List<String> names() {
        listOfNames.add(String.valueOf(name));
        addToList(left);
        addToList(right);
        Collections.sort(listOfNames);
        return listOfNames;
    }

    private void addToList(Node node){
        if(node != null) {
            listOfNames.add(String.valueOf(node.name));
            addToList(node.left);
            addToList(node.right);
        }
    }
}



