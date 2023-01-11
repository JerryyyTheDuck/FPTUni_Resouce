package data;

/**
 *
 * @author green
 */
public class Student { //code mark name

    private String code = "";
    private String name = "";
    private int mark = 0;

    public Student() {

    }

    public Student(String code, String name, int mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        name = name.trim().toUpperCase();
        if (name.length() > 0) {
            this.name = name;
        }
    }
    public void setMark(int mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
        }
    }

    @Override
    public String toString() {
        return code + ", " + name + ", " + mark;
    }

}
