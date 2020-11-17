package schoolpro.demo.test;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import schoolpro.demo.model.Student;
import schoolpro.demo.model.Subject;
@RestController
@RequestMapping("/add")

public class SchoolTest {
    @RequestMapping("/URL")
    @ResponseBody

    public static void main(String[] ages) {
        //测试subject是否有效
        Subject sub1 = new Subject("计算机科学与技术", "J001", -5);
        System.out.println(sub1.info());
        System.out.println("========================");
        Student stu1=new Student("郑杰标","男","1612402607022",101);
        System.out.println(stu1.leg(sub1));
        System.out.println("========================");
        Student stu2=new Student("陈志达","男","1612402607023",25);
        System.out.println(stu2.leg("计算机科学与技术",5));
        System.out.println("========================");
        Student stu3=new Student("郑武警","男","1612402607024",28);
        System.out.println(stu3.leg(sub1));
        System.out.println("========================");
        //测试指定专业中有多少学生报名
        sub1.addStudent(stu1);
        sub1.addStudent(stu2);
        sub1.addStudent(stu3);
        System.out.println(sub1.getSubjectName()+"专业已有"+sub1.getStudentNum()+"学生进行了报名");

    }
}
