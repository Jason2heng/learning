package schoolpro.demo.model;

public class Student {
    //学生属性：姓名，性别，学号，年龄
    private String studentname;
    private String studentsex;
    private String numbel;
    private int ago;
    private Subject studentsubject;


    public Student() {


    }
    public Student(String studentname, String studentsex, String numbel, int ago) {
        this.setStudentname(studentname);
        this.setNumbel(numbel);
        this.setStudentsex(studentsex);
        this.setAgo(ago);

    }

    public Student(String studentname, String studentsex, String numbel, int ago,Subject studentsubject) {
        this.setStudentname(studentname);
        this.setNumbel(numbel);
        this.setStudentsex(studentsex);
        // this.setAgo(ago);
        this.ago = ago;
        this.setStudentsubject(studentsubject);
    }



    /**

* @Description:    获取专业对象，是否有实例化，如果没有，则先实例化再返回
 * 专业对象信息

* @Author:        叫兽

*/

    public Subject getStudentsubject() {
        if (studentsubject==null)
        this.studentsubject=new Subject();
        return studentsubject;
    }

    public void setStudentsubject(Subject studentsubject) {

        this.studentsubject = studentsubject;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getStudentsex() {
        return studentsex;
    }

    public void setStudentsex(String studentsex) {
        this.studentsex = studentsex;
    }

    public String getNumbel() {
        return numbel;
    }

    public void setNumbel(String numbel) {
        this.numbel = numbel;
    }

    public int getAgo() {
        return ago;
    }

    public void setAgo(int ago) {
        if (ago > 0 || ago < 100)
            this.ago = 18;
        else
            this.ago = ago;
    }

    /**
     * @Description: java类作用描述
     * @Author: 叫兽
     */
//  public String leg() {
//        String str = "学生信息如下：\n学生名称：" + this.getStudentname() + "\n学生性别：" + this.getStudentsex() + "\n学生学号：" + this.getNumbel() + "\n学生年龄：" + this.getAgo();
//        return str;


    /**方法一
     * @Description: 学生自我介绍信息
     * @Author: 学生姓名，性别，学号，年龄，科目，年限
     */
    public String leg(String subjectName, int subjectLife) {
        String str = "学生信息如下：\n学生名称：" + this.getStudentname() + "\n学生性别：" + this.getStudentsex() + "\n学生学号：" + this.getNumbel() + "\n学生年龄：" + this.getAgo() + "\n学生所选的专业：" + subjectName + "\n专业年限：" + subjectLife;
        return str;
    }
/**方法二

* @Description:    通过Subject类来调用里面的属性,传入对象，对象里的属性都可以调用
 * subject mysubject

* @Author:        叫兽

*/
    public String leg(Subject mySubject) {
        String str = "学生信息如下：\n学生名称：" + this.getStudentname() + "\n学生性别：" + this.getStudentsex() + "\n学生学号：" + this.getNumbel() + "\n学生年龄：" + this.getAgo() + "\n学生所选的专业：" + mySubject.getSubjectName() + "\n专业年限：" + mySubject.getSubjectLift();
        return str;
    }
    /**方法三

    * @Description:    先调用对象再调用属性get类后再。get属性

    * @Author:        叫兽

    */
    public String leg() {
        String str = "学生信息如下：\n学生名称：" + this.getStudentname() + "\n学生性别：" + this.getStudentsex() + "\n学生学号：" + this.getNumbel() + "\n学生年龄：" + this.getAgo()+"\n学生所选的专业：" + this.getStudentsubject().getSubjectName()+ "\n专业年限：" + this.getStudentsubject().getSubjectLift();
        return str;
    }
}
