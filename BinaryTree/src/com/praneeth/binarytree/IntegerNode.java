package com.praneeth.binarytree;

public class IntegerNode {
	
private int value;
public int getValue() {
	return value;
}
public void setValue(int value) {
	this.value = value;
}
public IntegerNode getLeftNode() {
	return leftNode;
}
public void setLeftNode(IntegerNode leftNode) {
	this.leftNode = leftNode;
}
public IntegerNode getRightNode() {
	return rightNode;
}
public void setRightNode(IntegerNode rightNode) {
	this.rightNode = rightNode;
}
private IntegerNode leftNode;
private IntegerNode rightNode;
	
}
