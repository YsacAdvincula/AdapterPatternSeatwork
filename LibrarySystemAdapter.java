public class LibrarySystemAdapter implements SchoolManagementApp{

    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem){
        this.librarySystem = librarySystem;
    }
    @java.lang.Override
    public String integrateSystem() {
        return librarySystem.manageBooks();
    }
}