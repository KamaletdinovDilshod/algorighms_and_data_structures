package leetcode.medium;

public class ImplementTriePrefixTree {
    public static void main(String[] args) {
        Trie tr = new Trie();
        tr.insert("catt");
        System.out.println(tr.search("catt"));
        System.out.println(tr.startsWith("catt"));
    }
}

class Trie {

    Node root;

    public Trie() {
        root = new Node();
    }

    public void insert(String word) {
        root.insert(word, 0);
    }

    public boolean search(String word) {
        return root.search(word, 0);
    }

    public boolean startsWith(String prefix) {
        return root.startsWith(prefix, 0);
    }

    static class Node {
        Node[] nodes;
        boolean isEnd;

        Node() {
            nodes = new Node[26];
        }

        private void insert(String word, int idx) {
            if (idx >= word.length()) return;

            int i = word.charAt(idx) - 'a';
            if (nodes[i] == null) {
                nodes[i] = new Node();
            }

            if (idx == word.length() - 1) nodes[i].isEnd = true;
            nodes[i].insert(word, idx + 1);
        }

        private boolean search(String word, int idx) {
            if (idx >= word.length()) return false;

            Node node = nodes[word.charAt(idx) - 'a'];
            if (node == null) return false;

            if (idx == word.length() - 1 && node.isEnd) return true;

            return node.search(word, idx + 1);
        }

        private boolean startsWith(String prefix, int idx) {
            if (idx >= prefix.length()) return false;
            Node node = nodes[prefix.charAt(idx) - 'a'];
            if (node == null) return false;
            if (idx == prefix.length() - 1) return true;

            return node.startsWith(prefix, idx + 1);
        }
    }
}

//class Trie {
//
//    Trie[] children;
//    boolean isEndOfWord;
//
//    public Trie() {
//
//        children = new Trie[26];
//        isEndOfWord = false;
//    }
//
//    public void insert(String word) {
//        Trie current = this;
//
//        for (char c : word.toCharArray()) {
//            if (current.children[c - 'a'] == null) {
//                Trie newNode = new Trie();
//
//                current.children[c - 'a'] = newNode;
//            }
//
//            current = current.children[c - 'a'];
//        }
//
//        current.isEndOfWord = true;
//        System.out.println(current);
//    }
//
//    public boolean search(String word) {
//
//        Trie current = this;
//
//        for (char c : word.toCharArray()) {
//            if (current.children[c - 'a'] == null) {
//                return false;
//            }
//
//            current = current.children[c - 'a'];
//        }
//
//        return current.isEndOfWord;
//    }
//
//    public boolean startsWith(String prefix) {
//        Trie current = this;
//
//        for (char c : prefix.toCharArray()) {
//            if (current.children[c - 'a'] == null) {
//                return false;
//            }
//
//            current = current.children[c - 'a'];
//        }
//
//        return true;
//    }
//}
