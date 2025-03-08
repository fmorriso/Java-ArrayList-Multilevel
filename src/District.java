import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class District {
    private String name;
    private String abbreviation;
    private String street;
    private String city;

    private ArrayList<School> schools = new ArrayList<School>();

    private District() {/* prevent uninitialized instances */}

    public District(String name, String abbreviation, String street, String city) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.street = street;
        this.city = city;
    }

    public String getName() {return name;}
    public String getAbbreviation() {return abbreviation;}
    public String getStreet() {return street;}
    public String getCity() {return city;}
    public List<School> getSchools() { return schools; }



    public void addSchool(School school) {
        schools.add(school);
    }


    @Override
    public String toString() {
        return new StringBuilder("District{")
                .append("name='").append(name).append('\'')
                .append(", abbreviation='").append(abbreviation).append('\'')
                .append(", street='").append(street).append('\'')
                .append(", city='").append(city).append('\'')
                .append('}').toString();
    }

    public void displaySchools() {
        StringBuilder sbr = new StringBuilder();
        sbr.append(this).append("\n");
        for (School school : schools)
                sbr.append("\t").append(school).append("\n");
        System.out.println(sbr.toString());
    }

    public void displaySchoolsAndTeachers(){
        StringBuilder sbr = new StringBuilder();
        sbr.append(this).append("\n");
        for (School school : schools) {
            sbr.append("\t").append(school).append("\n");
            for(Teacher teacher: school.getTeachers())
                sbr.append("\t\t").append(teacher).append("\n");
        }
        System.out.println(sbr.toString());
    }

    @Override
    public boolean equals(Object o) {
        // same memory address is easy
        if (this == o) return true;
        // if you're not one of us, go away.
        if (!(o instanceof District district)) return false;
        return Objects.equals(name, district.name) && Objects.equals(abbreviation, district.abbreviation) && Objects.equals(street, district.street) && Objects.equals(city, district.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, abbreviation, street, city);
    }
}
