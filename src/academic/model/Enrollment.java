package academic.model;

public class Enrollment {
    private String code;
    private String id;
    private String academicYear;
    private String semester;
    private String grade = "None";
    private String previousGrade = "None";

    public Enrollment(String code, String id, String academicYear, String semester) {
        this.code = code;
        this.id = id;
        this.academicYear = academicYear;
        this.semester = semester;
    }

    public String getCode() {
        return code;
    }

    public String getId() {
        return id;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public String getGrade() {
        return this.grade;
    }

    public String getPreviousGrade() {
        return this.previousGrade;
    }
    
    public void setGrade(String grade) {
        this.grade = grade; // Set nilai grade baru
    }


    public void setPreviousGrade(String previousGrade) {
        String tempGrade = this.grade;
        this.grade = previousGrade;
        this.previousGrade = tempGrade; // Set nilai grade sebelumnya
    }

    @Override
    public String toString() {
        if (previousGrade == null || previousGrade.equals("None")) {
            return code + "|" + id + "|" + academicYear + "|" + semester + "|" + grade;
        } else {
            return code + "|" + id + "|" + academicYear + "|" + semester + "|" + grade + "(" + previousGrade + ")";
        }
    }
}


