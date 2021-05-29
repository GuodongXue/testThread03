package testThread03;

public class test extends Thread{
    public test(String name) {
        super(name);
    }

    @Override
    public void run() {
        for(int i = 1; i <=100; i++){
            System.out.println(this.getName()+"---"+i);
            if(i==6){
                Thread.yield();
                //暂停
            }
        }
    }

    public static void main(String[] args) {
        test t1 = new test("Thread1");
        t1.start();
        t1.setDaemon(true);
        test t2 = new test("Thread2");
        t2.start();
    }
}
