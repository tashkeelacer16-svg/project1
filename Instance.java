package Basics;
 class Instance {
     String name = "tashkeel";
     int age= 21;
     float  marks = 45.6f;
     void info(){
         System.out.println("Students name:"+name);
         System.out.println("Students age" +age);
         System.out.println("Students marks "+ marks);
     }

     public static void main(String[] args) {
        Instance i  = new Instance();
         System.out.println(i.name) ;
         System.out.println(i.age);
         System.out.println(i.marks);
         i.info();
     }
}
