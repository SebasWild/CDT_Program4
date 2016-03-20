/**
 * An element can either be a terminal or a nonterminal
 */
public interface Element extends Comparable {
    String toString();

    int compareTo(Object T);
}
