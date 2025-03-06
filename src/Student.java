public class Student extends Person {


    private int gradeLevel;

    private Student() {/* prevent uninitialized instances */}
    public Student(String firstName, String lastName, int gradeLevel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradeLevel = gradeLevel;
    }

    @Override
    public String toString() {
        return new StringBuilder("Student{")
                .append("lastName='").append(lastName).append('\'')
                .append(", firstName='").append(firstName).append('\'')
                .append(", gradeLevel=").append(gradeLevel)
                .append('}').toString();
    }

}
