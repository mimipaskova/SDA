//7 zadacha
package stack;

import java.util.Stack;

public class Paper {

    private Stack<String> words;
    private int wordsCounter = 0;

    public Paper() {
        this.words = new Stack<>();
    }

    public void addWord(String word) {
        words.push(word);
        wordsCounter++;
    }

    public String getWord(int i) {
        return words.get(i);
    }

    public int count() {
        return wordsCounter;
    }

    public int price() {
        return (int) (wordsCounter * 0.5);
    }

    @Override
    public String toString() {
        String str = new String();
        for (String word : words) {
            str.concat(word + " ");
        }
        return str;
    }
}
