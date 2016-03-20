import java.util.ArrayList;

/**
 * A Rule is a grammar rule consisting of a left element and a list of right elements.
 */
public class Rule implements Comparable {
    State parent = null;
    Integer pointer = null;
    Element left;
    ArrayList<Element> right;

    public Rule(Element left, ArrayList<Element> right) {
        this.left = left;
        this.right = right;
    }

    public Rule(Element left, ArrayList<Element> right, State parent) {
        this.left = left;
        this.right = right;
        this.parent = parent;
    }

    public Rule(Element left, ArrayList<Element> right, State parent, Integer pointer) {
        this.left = left;
        this.right = right;
        this.parent = parent;
        this.pointer = pointer;
    }

    public int compareTo(Object T) {
        if (!(T instanceof Rule)) return 0;
        Rule other = (Rule) T;
        if (left.compareTo(other.left) == 0) return 0;
        if (right.size() != other.right.size()) return 0;
        for (int i = 0; i < right.size(); i++) {
            if (right.get(i).compareTo(other.right.get(i)) == 0) return 0;
        }
        return 1;               //The two rules are equal.
    }

    public String toString() {
        return "" + left + " -> " + right;
    }

}
