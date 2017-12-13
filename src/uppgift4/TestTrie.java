package uppgift4;

public class TestTrie {
	public static void main(String[] args) {
		Trie trie = new Trie();
		String s1 = "Sluta titta David";
		String s2 = "Hej";
		String s3 = "Otto Göransson";
		String s4 = "Testar";
		String s5 = "Test";
		trie.put(s1);
		trie.put(s2);
		trie.put(s3);
		System.out.println("Finns " + s1 + ": " + trie.get(s1));
		System.out.println("Finns " + s2 + ": " + trie.get(s2));
		System.out.println("Finns " + s3 + ": " + trie.get(s3));
		System.out.println("Finns bajskorv: " + trie.get("bajskorv"));
		System.out.println("Finns " + s4 + ": " + trie.get(s4));
		trie.put(s4);
		System.out.println("Finns " + s4 + ": " + trie.get(s4));
		System.out.println("Finns " + s5 + ": " + trie.get(s5));
		trie.put(s5);
		System.out.println("Finns " + s5 + ": " + trie.get(s5));
	}
}
