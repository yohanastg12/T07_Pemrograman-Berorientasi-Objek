package academic.model;

//12S22050 - YOHANA SITANGGANG
public class Lecturer {
    private String id;
    private String name;
    private String initial;
    private String email;
    private String studyProgram;


    public Lecturer(String id, String name, String initial, String email, String studyProgram) {

        this.id = id;
        this.initial = initial;
        this.email = email;
        this.studyProgram = studyProgram;
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // buatlah getter name
    public String getName() {
        return name;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    // getter untuk initial
    public String getInitial() {
        return initial;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // getter email
    public String getEmail() {
        return email;
    }

    public void setStudyProgram(String studyProgram) {
        this.studyProgram = studyProgram;
    }

    // getter setter untuk id
    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + initial + "|" + email + "|" + studyProgram;
    }

}
