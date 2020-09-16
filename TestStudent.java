public class TestStudent {
    public static void main(String[] args) {
        StudentManagement st=new StudentManagement();
        Student student1=new Student();
        st.addStudent(student1);
        st.studentsByGroup();
    }
}
