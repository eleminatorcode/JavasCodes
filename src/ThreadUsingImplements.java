//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class ThreadUsingImplements {
    
    public static void main(String[] args) {
        ThreadEx1 t1 = new ThreadEx1();
        Thread t2 = new Thread(t1);
        t2.start();








    }

    static class ThreadEx1 implements Runnable {
        ThreadEx1() {
        }

        public void run() {
            System.out.println("THIS  IS RUNNING");
        }
    }
}
