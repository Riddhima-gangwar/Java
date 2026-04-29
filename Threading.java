class mythread extends Thread{
    String task_name;
    public mythread(String task_name){
        this.task_name=task_name;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println(task_name+" Step "+i);
        }
    }
}
public class Threading {
    public static void main(String[] args) {
        mythread t1=new mythread("Netflix");
        mythread t2=new mythread("Vice City");
        mythread t3=new mythread("Resident Evil");
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try{
            t1.join();
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println(t1.getState());
        System.out.println();
        System.out.println(t2.getState());
        t2.start();
        System.out.println(t2.getState());
        try{
            t2.join();
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println(t2.getState());
        System.out.println();
        System.out.println(t3.getState());
        t3.start();
        System.out.println(t3.getState());
        try{
            t3.join();
        }
        catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println(t3.getState());
    }
}