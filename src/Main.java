public class Main {
    public static void main(String[] args) {
        State colorado = new State("Colorado", "CO");
        System.out.format("%s\n", colorado);

        School lphs = new School("Lewis-Palmer","LPHS", "1300 Highby Road", "Monument" );
        System.out.format("%s\n", lphs);

        School prhs = new School("Palmer Ridge", "PRHS", "19255 Monument Hill Road", "Monument" );
        System.out.format("%s\n", prhs);

        District lpsd = new District("Lewis-Palmer", "D38", "146 N. Jefferson Street", "Monument");
        System.out.format("%s\n", lpsd);
        lpsd.addSchool(lphs);
        lpsd.addSchool(prhs);

        lpsd.displaySchools();

        colorado.addSchoolDistrict(lpsd);

    }
}