class BMSprinter extends Thread{
    public void run(){
    try{
        while (true){

            System.out.println("bms collage of engneering ");
            Thread.sleep(100000);

        }
    }
    catch(InterruptedException e){
        System.out.println("Thread interupterr");
    }

    }
}
class CSEprinter extends Thread{
    public void run(){
    try{
        while (true){

            System.out.println("CSE department ");
            Thread.sleep(1000);

        }
    }
    catch(InterruptedException e){
        System.out.println("Thread interupterr");
    }

    }
}
class Week8{
    public static void main(String args[]){
        BMSprinter t1=new BMSprinter();
        CSEprinter t2=new CSEprinter();
        t2.start();
        t1.start();
    }
}