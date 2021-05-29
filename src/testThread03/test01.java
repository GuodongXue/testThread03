package testThread03;

public class test01 {
    public static void main(String[] args) {
        for(int i = 0; i<100; i++){
            System.out.println(i);
            if(i==6){
                Thread.currentThread().stop();
            }
        }
    }
}
