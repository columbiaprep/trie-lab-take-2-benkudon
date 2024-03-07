// Java implementation of search and insert operations
// on Trie
//Stolen and modified from Baeldung

public class Trie {


    //base of the trie
    public static TrieNode root;


    // If not present, inserts key into trie
    // If the key is prefix of trie node,
    // just marks leaf node
    public static void insert(String key, TrieNode n) {
        //go character byy character, building out the string
        //recursive call: remove from key the first letter
        
        //one base case: key.length < 2
        if (key.length() < 2){
            return;
        }
        //else, strip the first character from the word
        else {
            //strip character from word and convert it into char
            char currentLetter = key.charAt(0); 
            //get the nodes leading to other branches of the tree
            TrieNode[] kids = root.children;
            //see if that node exists already
            //if it does, were going to go to it and make our recurisve call
            //if it doesnt, were going to make it, go to it, and  make our recursive call
            for (TrieNode k: kids){
                if (currentLetter == k.theLetter) {
                    //enter that TrieNode and repeat
                    insert(key.substring(1),k);
                }
            }
            insert(key.substring(1), new TrieNode());
        }