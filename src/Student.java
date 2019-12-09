public class Student {

    protected String studentId;           //or String studentId,studentName,faculty,major;  , พิม pro กด clrt+spacebar
    protected String studentName;         //or shift+ctrl
    protected String faculty;
    protected String major;

    public  void enrollment() {
        System.out.println("enrollment");
    }
    public void payment() {
        System.out.println("payment");
    }
    public void addCourse() {
        System.out.println("addCourse");
    }
    public void dropCourse() {
        System.out.println("dropCourse");
    }
    public void showData() {
        System.out.println("ID :"+studentId);
        System.out.println("Name :"+studentName);
        System.out.println("Major :"+major);
        System.out.println("Faculty :"+faculty);
    }
}//end class
