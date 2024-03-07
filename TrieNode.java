// trie node
public class TrieNode
{
    // Alphabet size (names.txt was stripped only alphabet contained)
    static final int ALPHABET_SIZE = 26;

    TrieNode[] children = new TrieNode[ALPHABET_SIZE];

    // isEndOfWord is true if the node represents
    // end of a word
    boolean isEndOfWord;
    char theLetter = '\u0000';

    TrieNode(){
        isEndOfWord = false;
        for (int i = 0; i < ALPHABET_SIZE; i++)
            children[i] = null;
    }
};