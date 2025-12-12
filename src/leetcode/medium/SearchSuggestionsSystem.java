package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SearchSuggestionsSystem {
    public static void main(String[] args) {

        String[] products = new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"};
        System.out.println(suggestedProducts(products, "mouse"));
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Trie trie = new Trie();
        List<List<String>> suggestions = new ArrayList<>();

        for (String product : products) {
            trie.insert(product);
        }

        String prefix = "";

        for (int i = 0; i < searchWord.length(); i++) {
            prefix += searchWord.charAt(i);
            suggestions.add(trie.searchAndReturnWords(prefix));
        }

        return suggestions;
    }
}
