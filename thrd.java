// class thrd extends Thread
// {
//     public void run()
//     {
//         System.out.println("Thread is running");
//     }
//     public static void main(String args[])
//     {
//         thrd t1=new thrd();
//         t1.run();
//     }
// }

class thrd implements Runnable
{
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String args[])
    {
        thrd t1=new thrd();
        Thread t2=new Thread(t1);
        t2.start();
    }
}