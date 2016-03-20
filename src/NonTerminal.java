/**
 * A NonTerminal represents a non terminal in a grammar.
 */
public class NonTerminal implements Element {
    String id;

    public String toString() {
        return "";
    }

    public int compareTo(Object T) {
        if (T instanceof NonTerminal) {
            NonTerminal other = (NonTerminal) T;
            return id.compareTo(other.id);
        }
        return 0;
    }
}
