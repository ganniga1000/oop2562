public class TestStudent {   
    public static void main(String[] args) {   //psvm+tab  
        Student wutti = new Student();
        System.out.print("Object = " + wutti); //sout+tab
        wutti.studentId = "614234020";
        wutti.studentName = "wuttichai";
        wutti.major = "CS";
        wutti.faculty = "Sci and Technology";
        wutti.showData();
        wutti.enrollment();
        wutti.dropCourse();
        
        Student nas = new Student();
        nas.studentId = "614234028";
        nas.studentName = "Teeravut";
        nas.major = "CS";
        nas.faculty = "sci and Technology";
        System.out.println("Object = " + nas);
        nas.showData();
        
        GraduateStudent baw = new GraduateStudent();
        baw.studentLevel = "Year2";
        baw.thesisAdviser = "Dr.Bew";
        baw.showData();
        baw.oralExamination();
        baw.thesisAdiser();
        
    }

}//end 
