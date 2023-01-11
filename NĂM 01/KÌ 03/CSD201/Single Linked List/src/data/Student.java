package data;

public class Student extends SLL implements Comparable<Student>   {
    private String name;
    private int id;
    public Student(){
        id = 0;
        name = "";
    }
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Student o) {
        return  this.getId() - o.getId();
    }
    @Override
    public String toString() {
        return id +" | "+ name;
    }
}
