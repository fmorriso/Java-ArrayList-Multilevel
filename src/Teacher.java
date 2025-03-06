public class Teacher extends Person {

    // private Department department;

    private Teacher() {/* prevent uninitialized instances */}
    public Teacher(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }

    @Override
    public String toString() {
        return new StringBuilder("Teacher{")
                .append("lastName='").append(lastName).append('\'')
                .append(", firstName='").append(lastName).append('\'')
                .append('}').toString();
    }
}
