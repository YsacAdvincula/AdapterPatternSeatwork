public class GradingSystemAdapter implements SchoolManagementApp{

    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem){
        this.gradingSystem = gradingSystem;
    }
    @java.lang.Override
    public String integrateSystem() {
        return gradingSystem.recordGrades();
    }
}