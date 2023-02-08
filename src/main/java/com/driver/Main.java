package com.driver;


public class Main {
  public static class A{
    public static String meth(){
      return "Invoking method from class A";
    }
  }
  public static class B extends A {
   public static String meth() {
      return "Method is overridden in Extendend class B";
    }
  }

  public static void main (String args []){
    B obj_A = new B();
    System.out.println(obj_A.meth());;
    B obj_B = new B();
    System.out.println(obj_B.meth());;
  }
}
