import java.util.Scanner;
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student(String name, String id, String group, String email) {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }

    public Student(){
        name="Student";
        id="000";
        group="K63-K2";
        email="uet@vnu.edu.vn";
    }

    public Student(String Name, String Id, String Email){
        name=Name;
        id=Id;
        email=Email;
        group="K63-K2";
    }

    public Student( Student s){
        name=s.name;
        id=s.id;
        group=s.group;
        email=s.email;
    }

    public String getInfo(){return name +" - "+ id+" - "+ group+" - "+ email; }



}



