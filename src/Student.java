public class Student {

    private String firstName;
    private String lastName;

    private Student() {/* prevent uninitialized instances */}
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return new StringBuilder("Student{")
                .append("lastName='").append(lastName).append('\'')
                .append(", firstName='").append(firstName).append('\'')
                .append('}').toString();
    }

}
