import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Person> descendants;

    public Person(String name) {
        this.name = name;
        descendants = new ArrayList<>();
    }

    public void addDescendant(Person descendant) {
        descendants.add(descendant);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" -> ( ");
        for (Person descendant : descendants) {
            sb.append(descendant.toString());
            sb.append(" ");
        }
        sb.append(")");
        return sb.toString();
    }
}