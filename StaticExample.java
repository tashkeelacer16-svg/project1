package Basics;

 class StaticExample {

    int age =23;
    static float marks =35.53f;
    public static void main (String[]args){
        StaticExample se  = new StaticExample();
        System.out.println(se.age);

        System.out.println(marks);
    }
}
