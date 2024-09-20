public class Main {
    public static void main(String[] args) {

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        SchoolManagementApp asSm = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        SchoolManagementApp gsSm = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        SchoolManagementApp lsSm = new LibrarySystemAdapter(librarySystem);

        System.out.println(asSm.integrateSystem());

        System.out.println(gsSm.integrateSystem());

        System.out.println(lsSm.integrateSystem());



    }
}