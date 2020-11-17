package schoolpro.demo.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping
@ResponseBody
public class Subject {
    private String subjectName;
    private String subjectNo;
    private int subjectLift;
    private Student[] myStudent;//容器
    private int studentNum;//个数的统计池
    //无参构造
    public Subject(){

    }
    //带参构造 实现对属性的全部赋值
    public Subject(String subjectName,String subjectNo,int subjectLift){
        //this.subjectName=subjectName;
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLift(subjectLift);


    }
    public Subject(String subjectName,String subjectNo,int subjectLift,Student[]myStudent,int studentNum){
        //this.subjectName=subjectName;
        this.setSubjectName(subjectName);
        this.setSubjectNo(subjectNo);
        this.setSubjectLift(subjectLift);
        this.setMyStudent(myStudent);
        this.setStudentNum(studentNum);


    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    /**

* @Description:    获取专业选修课学生的信息，先实例化长度500
 *

* @Author:        叫兽

*/

    public Student[] getMyStudent() {
        if (this.myStudent==null)
            this.myStudent=new Student[500];
        return myStudent;
    }
    public void setMyStudent(Student[] myStudent) {
        this.myStudent = myStudent;
    }

    public void setSubjectName(String subjectName){
        this.subjectName=subjectName;
    }
    public String getSubjectName(){
        return this.subjectName;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLift() {
        return subjectLift;
    }
//设置年限的条件，年限必须>0
    public void setSubjectLift(int subjectLift) {
        if(subjectLift<0)
            return;
        this.subjectLift = subjectLift;
    }
    /**

    * @Description:    专业介绍方法
     * 专业介绍相关信息

    * @Author:        叫兽

    */
    public String info(){
        String str="专业信息如下：\n专业名称："+this.getSubjectName()+"\n专业编号："+this.getSubjectNo()+"\n专业年限："+this.getSubjectLift()+"年";
        return str;
    }
    /**

    * @Description:    将学生保存到数组中

    * @Author:        叫兽

    */
    public void addStudent(Student stu){
        int i;
        for (i=0;i<this.getMyStudent().length;i++) {
            if (this.getMyStudent()[i] == null) {
                this.getMyStudent()[i] = stu;
                break;
            }
        }
        /**

        * @Description:    将学生个数保存在Studentnum

        * @Author:        叫兽

        */
        this.studentNum=i+1;
    }
}

