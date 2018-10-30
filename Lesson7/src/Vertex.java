/**
 * Created by Ivan Chaykin
 * Date: 30.10.2018
 * Time: 10:42
 */
public class Vertex {

    private final String label;
    private boolean wasVisited;

    public Vertex(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }

    public boolean isWasVisited() {
        return wasVisited;
    }

    public void setWasVisited(boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}