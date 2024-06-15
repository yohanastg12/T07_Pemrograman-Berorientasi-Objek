package academic.model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class CourseOpening {
     private String academicYear;
    private String semester;
    private List<String> lecturers;

    public CourseOpening(String academicYear, String semester, List<String> lecturers) {
        this.academicYear = academicYear;
        this.semester = semester;
        this.lecturers = lecturers;
    }

    public String getAcademicYear() {
        return academicYear;
    }

    public String getSemester() {
        return semester;
    }

    public List<String> getLecturers() {
        return lecturers;
    }

    @Override
    public String toString() {
        StringBuilder lecturerString = new StringBuilder();
        for (String lecturer : lecturers) {
            lecturerString.append(lecturer).append(",");
        }
        return academicYear + "|" + semester + "|" + lecturerString.toString().replaceAll(",$", "");
    }
}