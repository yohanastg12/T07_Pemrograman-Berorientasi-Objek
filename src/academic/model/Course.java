package academic.model;

import java.util.List;
import java.util.ArrayList;

public class Course {
    private String code;
    private String name;
    private int credit;
    private String passingGrade;
    private List<CourseOpening> courseOpenings; // tambahkan list courseOpenings

    public Course(String code, String name, int credit, String passingGrade) {
        this.code = code;
        this.name = name;
        this.credit = credit;
        this.passingGrade = passingGrade;
    }

    public List<CourseOpening> getCourseOpenings() {
        return courseOpenings;
    }

    public void setCourseOpenings(List<CourseOpening> courseOpenings) {
        this.courseOpenings = courseOpenings;
    }

    // tambahkan method addCourseOpening untuk menambah courseOpening ke list
        public void addCourseOpening(CourseOpening courseOpening) {
            if (courseOpenings == null) {
                courseOpenings = new ArrayList<>();
            }
            courseOpenings.add(courseOpening);
        }

// tambahkan method findCourseByCode untuk mencari course berdasarkan kode
    public static Course findCourseByCode(String courseCode, List<Course> courses) {
        for (Course course : courses) {
            if (course.getCode().equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }

    public String getPassingGrade() {
        return passingGrade;
    }

    //buatlah overridenya
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(code).append("|").append(name).append("|").append(credit).append("|").append(passingGrade);

    // if (courseOpenings != null) {
    //     for (CourseOpening opening : courseOpenings) {
    //         sb.append("\n").append(code).append("|").append(opening.getAcademicYear())
    //                 .append("|").append(opening.getSemester())
    //                 .append("|").append(opening.getLecturers().get(0));
    //     }
    // }

    return sb.toString();
}

}