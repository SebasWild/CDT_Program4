/**
 * Terminal. Represents a terminal symbol in a grammar.
 */
public class Terminal implements Element {
    String id;

    public String toString() {
        return "" + id;
    }

    public int compareTo(Object T) {
        if (T instanceof Terminal) {
            Terminal other = (Terminal) T;
            return id.compareTo(other.id);
        }
        return 0;
    }
}
