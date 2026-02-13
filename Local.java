package Basics;

 class Local {

     void run(){
         int rate =12;
         System.out.println("Kankarbagh bus rate "+rate);
     }
     void run1(){
         int rate1 =15;
         System.out.println("Kamhrar bus rate "+rate1);
     }
     void run2(){
         int rate2 =20;
         System.out.println("Boring road bus rate"+ rate2);
     }
     public void run3(){
         Local l = new Local();
         l.run();
         l.run1();
         l.run2();

     }
}
