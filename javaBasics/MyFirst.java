package javaBasics;


public class MyFirst {
int a=20,b=20;
    public static void main(String[] args) {
        System.out.println("My first java");
        MyFirst myFirst=new MyFirst();
        myFirst.doAdition();
        myFirst.doSub();
        myFirst.doMul();
        myFirst.doModule();
    }
        void doAdition(){
        System.out.println("Adition is"+(a+b));
        }
        void doSub(){
            System.out.println("sub is"+(a-b));
            }
            void doMul(){
                System.out.println("mul is"+(a*b));
                }
                void doModule(){
                    System.out.println("module is"+(a%b));
                    }
    
    
    
    }
