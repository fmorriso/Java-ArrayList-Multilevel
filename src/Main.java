import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Teacher mgrohman = new Teacher( "Mark", "Grohman");

        School lphs = new School("Lewis-Palmer","LPHS", "1300 Highby Road", "Monument" );
        System.out.format("%s\n", lphs);
        lphs.addTeacher(mgrohman);

        School prhs = new School("Palmer Ridge", "PRHS", "19255 Monument Hill Road", "Monument" );
        System.out.format("%s\n", prhs);
        prhs.addTeacher(mgrohman);

        District lpsd = new District("Lewis-Palmer", "D38", "146 N. Jefferson Street", "Monument");
        System.out.format("%s\n", lpsd);

        // add a bunch of schools to the district in one call
        Collections.addAll(lpsd.getSchools(), lphs, prhs);
        // lpsd.addSchool(lphs);
        // lpsd.addSchool(prhs);

        lpsd.displaySchools();
        lpsd.displaySchoolsAndTeachers();

        lphs.displayTeachers();


        State colorado = new State("Colorado", "CO");
        System.out.format("%s\n", colorado);
        colorado.addSchoolDistrict(lpsd);

    }
}