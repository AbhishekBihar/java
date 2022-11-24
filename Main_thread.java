class Name extends Thread
{
    public void run()
    {
        initialPriority();
    }
    void initialPriority()
    {
        System.out.println(Thread.currentThread().getPriority());
    }
}
public class Main_thread{
    public static void main(String[] args) {
        Name n = new Name();
        n.start();
        Name n2 = new Name();
        n2.setPriority(1);
        n2.start();
    }
}