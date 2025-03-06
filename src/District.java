import java.util.ArrayList;

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
        sbr.append("District: ").append(name).append("\n");
        for (School school : schools)
                sbr.append("\tSchool: ").append(school.getName()).append("\n");
        System.out.println(sbr.toString());
    }
}
