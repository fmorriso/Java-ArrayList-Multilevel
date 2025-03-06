import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String abbreviation;
    private String street;
    private String city;
    //
    private List<Teacher> teachers = new ArrayList<Teacher>();
    private List<Student> students = new ArrayList<>();

    private School() {/* prevent uninitialized instances */}

    public School(String name, String abbreviation, String street, String city) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.street = street;
        this.city = city;
    }

    public String getName() {return name;}
    public String getAbbreviation() {return abbreviation;}
    public String getStreet() {return street;}
    public String getCity() {return city;}
    public List<Teacher> getTeachers() { return teachers;}
    public List<Student> getStudents() { return students;}

    @Override
    public String toString() {
        return new StringBuilder("School{")
                .append("name='").append(name).append('\'')
                .append(", abbreviation='").append(abbreviation).append('\'')
                .append(", street='").append(street).append('\'')
                .append(", city='").append(city).append('\'')
                .append('}').toString();
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addStudent(Student student) { students.add(student); }

    public void displayTeachers() {
        StringBuilder sbr = new StringBuilder();
        sbr.append(this).append("\n");
        for (Teacher teacher : teachers)
            sbr.append("\t").append(teacher).append("\n");
        System.out.println(sbr.toString());
    }

    public void displayStudents() {
        StringBuilder sbr = new StringBuilder();
        sbr.append(this).append("\n");
        for (Student student : students)
            sbr.append("\t").append(student).append("\n");
        System.out.println(sbr.toString());
    }




}
