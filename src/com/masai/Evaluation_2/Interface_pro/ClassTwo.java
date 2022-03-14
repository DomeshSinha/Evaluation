package com.masai.Evaluation_2.Interface_pro;

public class ClassTwo extends ClassOne{
    @Override
    public void methodOne(){
        System.out.println("Inside methodOne of ClassTwo");
    }
    @Override
    public void methodTwo(){
        System.out.println("Inside methodTwo of ClassTwo");
    }

    @Override
    public String toString(){
        return "This is ClassTwo object";
    }

    public static void main(String[] args) {
        InterfaceThree int3 = new ClassTwo();
        System.out.println(int3);
        int3.methodOne();
        int3.methodTwo();
        int3.methodThree();

        InterfaceOne int1 = new ClassTwo();
        int1.methodOne();

        ClassTwo cl2  = (ClassTwo)int1;
        cl2.methodTwo();
        cl2.methodThree();

    }
}
