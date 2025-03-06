import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person {

    private Department department;
    // courses taught by this teacher
    private List<Course> courses = new ArrayList<>(); // courses taught

    private Teacher() {/* prevent uninitialized instances */}
    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public Department getDepartment() { return department; }
    public List<Course> getCourses() { return courses;}

    @Override
    public String toString() {
        return new StringBuilder("Teacher{")
                .append("lastName='").append(lastName).append('\'')
                .append(", firstName='").append(lastName).append('\'')
                .append('}').toString();
    }
}
