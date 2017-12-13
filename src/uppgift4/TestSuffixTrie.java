package uppgift4;

public class TestSuffixTrie {
	public static void main(String[] args) {
		String t = "bananas";
		String pattern1 = "an";
		String pattern2 = "anas";
		SuffixTrie st = new SuffixTrie(t);
		System.out.println("T: " + t + "\n");
		System.out.println("Pattern: " + pattern1);
		System.out.println(st.longestMatch(pattern1));
//		System.out.println("Längsta prefixlängd av " + pattern1 + " som finns i " + t + ": " + st.longestMatch(pattern1));
		System.out.println("\nPattern: " + pattern2);
		System.out.println(st.longestMatch(pattern2));
//		System.out.println("Längsta prefixlängd av " + pattern2 + " som finns i " + t + ": " + st.longestMatch(pattern2));
	}
}
