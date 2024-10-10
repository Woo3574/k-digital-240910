package Zd.단어정렬;

public class Word implements Comparable<Word> {
    String word;
    int input;

    public Word(String word, int input) {
        this.word = word;
        this.input = input;
    }


    @Override
    public int compareTo(Word o) {
        if (word.length() > o.word.length()) return 1;
        else if (word.length() == o.word.length()) {
            int rst = word.compareTo(o.word);
            if (rst == 0) {
                return word.compareTo(o.word);
            } else return rst;
        } else return -1;
    }
}
