public class Main {
    public static void main(String[] args) {
        State colorado = new State("Colorado", "CO");
        System.out.format("%s\n", colorado);

        District lpsd = new District("Lewis-Palmer", "D38", "146 N. Jefferson Street", "Monument");
        System.out.format("%s\n", lpsd);
        colorado.addSchoolDistrict(lpsd);
    }
}