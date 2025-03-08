import java.util.Objects;

public class Course {
    private String name;
    private String description;

    private Course() {/* prevent uninitialized instances */}
    public Course(String name, String description) {
        this.name = name;
        this.description = description;
    }


    public String getName() {return name;}
    public String getDescription() {return description;}

    @Override
    public String toString() {
        return new StringBuilder("Course{")
                .append("name='").append(name).append('\'')
                .append(", description='").append(description).append('\'')
                .append('}').toString();
    }

    @Override
    public boolean equals(Object o) {
        // same memory address is easy
        if (this == o) return true;
        // if you're not one of us, go away.
        if (!(o instanceof Course course)) return false;
        return Objects.equals(name, course.name) && Objects.equals(description, course.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description);
    }
}
