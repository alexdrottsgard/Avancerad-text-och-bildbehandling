package uppgift4;

import java.util.LinkedList;

public class Trie {
	private LinkedList<Node> root;

	public Trie() {
		root = new LinkedList<Node>();
	}

	public void put(String s) {		
		LinkedList<Node> current_node = root;
		int N = s.length();
		for(int i = 0; i < N; i++) {
			char c = s.charAt(i);
			if(getNode(current_node, c) != null) {
				current_node = getNode(current_node, c);
			}else {
				Node new_node = new Node(c);
				current_node.add(new_node);
				current_node = new_node.getList();
			}
		}
		current_node.add(new Node('$'));
	}
	
	public LinkedList<Node> getNode(LinkedList<Node> node, char c) {
		for(int i = 0; i < node.size(); i++) {
			if(node.get(i).getChar() == c) {
				return node.get(i).getList();
			}
		}
		return null;
	}

	public boolean get(String s) {
		LinkedList<Node> current_node = root;
		int N = s.length();
		for(int i = 0; i < N; i++) {
			char c = s.charAt(i);
			if(getNode(current_node, c) != null) {
				current_node = getNode(current_node, c);
			}else {
				return false;
			}
		}
		if(getNode(current_node, '$') != null) {
			return true;
		}else {
			return false;
		}
	}
	
	private class Node {
		private LinkedList<Node> list;
		private char ch;
		
		private Node(char c) {
			ch = c;
			list = new LinkedList<Node>();
		}

		private LinkedList<Node> getList() {
			return list;
		}
		
		private char getChar() {
			return ch;
		}
	}
}
