package com.jason.animal.demo.Animal;

public class Dog extends Animal {
    private String sex;
    public Dog(){

    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void sleep(){
        System.out.println(this.getName()+"是一只"+this.getSex()+"的狗。它很爱喝奶茶，不爱出专辑");
    }
    private String sleep(String name){
        return "";

    }
    /**

    * @Description:    子类重写了父类eat的方法
     * 1.方法重写，有继承关系的子类中
     * 2.方法名相同，参数列表相同（参数类型，个数，顺序），方法的返回值相同
     * 3.访问修饰符
     * 4.与方法的参数名无关

    * @Author:        叫兽

    */
    public void eat(){
        System.out.println(this.getName()+"很想吃泡面~~~~");
    }
    /**

    * @Description:    eat（）里的可任意去书写

    * @Author:        叫兽

    */
    public void eat( String weight){
        System.out.println(weight+"很想喝奶茶");
    }
}
