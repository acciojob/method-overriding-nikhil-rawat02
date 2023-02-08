package com.driver;
class A{
  String meth(){
    return "Invoking method from class A";
  }
}
class B extends A{
  String meth(){
    return "Method is overridden in Extendend class B";
  }
}
public class Main {
  public static void main (String args []){
    B obj_A = new B();
    System.out.println(obj_A.meth());;
    B obj_B = new B();
    System.out.println(obj_B.meth());;
  }
}
