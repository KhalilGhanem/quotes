package quotes;

import java.util.ArrayList;
import java.util.Arrays;

public class Quotes {
//    ArrayList<String> tags = new ArrayList<String>();
    String[] tags;
    String author, likes, text;

    public Quotes(String[] tags, String author, String likes, String text) {
        this.tags = tags;
        this.author = author;
        this.likes = likes;
        this.text = text;
    }

    @Override
    public String toString() {
        return "Quotes{" +
                "tags=" + Arrays.toString(tags) +
                ", author='" + author + '\'' +
                ", likes='" + likes + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
