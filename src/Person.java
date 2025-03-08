import java.util.Objects;
import java.util.UUID;

public class Person {

    protected UUID id = UUID.randomUUID();
    protected String firstName;
    protected String lastName;

    public UUID getId() {return id;}
    public String getFirstName() {return firstName;}
    public String getLastName() {return lastName;}

    public void setId(UUID id) {this.id = id;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public void setLastName(String lastName) {this.lastName = lastName;}

    public String fullNameFirstLast() {
        return String.format("%s %s", firstName, lastName);
    }
    public String fullNameLastFirst() { return String.format("%s, %s", lastName, firstName); }

    @Override
    public boolean equals(Object o) {
        // same memory address is easy
        if (this == o) return true;
        // if you're not one of us, go away.
        if (!(o instanceof Person person)) return false;
        return  Objects.equals(id, person.id)
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName);
    }
}
