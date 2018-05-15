import java.util.ArrayList;
import java.util.Iterator;

public class URLIterator implements Iterator {

    private ArrayList<String> urls = new ArrayList<>();

    public boolean hasNext() {
        return false;
    }

    public String next() {
        String url = urls.get(0);
        urls.remove(url);
        return url;
    }
}
