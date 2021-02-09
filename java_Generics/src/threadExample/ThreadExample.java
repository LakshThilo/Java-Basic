package threadExample;


/**
 *  Threads allow multiple actions to be performed at the same time inside a single process.
 *  Imagine someone is cooking a meal and they only have a stove with one burner. They need to cook rice and potatoes,
 *  but they can only cook one at a time. They have to wait for the rice to finish cooking before they can cook the potatoes.
 *  If they had a stove with two burners, they would be able to cook both the rice and potatoes at the same time.
 *  This would be much quicker. Threads work a bit like this. In this analogy, cooking the meal is the process,
 *  the burner is like the core in the CPU. When you have a stove with multiple burners, you can cook multiple ingredients at once.
 *  Similarly, when you have a machine with multiple cores, you can run multiple tasks at the same time.
 *  In programming, a single process can have multiple threads working at the same time.
 *  Like a process, a thread is an independent path of execution that runs in isolation.
 *  Each thread has its own stack and its own local variables so when a method is running on a thread,
 *  the local variables in the method are only available within that thread.
 *  This leads to the question: Why not just use multiple processes instead of multiple threads? The answer is that threads
 *  are more closely connected to each other than separate processes. When you open an email app on your computer and then open a browser window,
 *  those things are separate processes and have nothing to do with each other. But threads inside the same process are more closely connected,
 *  they share memory with other threads. All of the threads have the same access to global variables.
 *  This can sometimes lead to issues and mean that care should be taken when using multiple threads.
 *  Java has its own API for handling threads which is actually quite simple to use, but care should be taken when using threads in complex applications.
 *  Examples of when threads can be useful in Java include: Using blocking input and output functions. For example,
 *  if the program asks the user to input some data, a read method might be used which blocks the program until the user has input something.
 *  This might prevent the program from performing other tasks while waiting for the user. If they try to do something else, like click on a button,
 *  nothing would happen. If the program has a graphical user interface, and especially if they use toolkits such as AWT and Swing,
 *  multi-threading can be used to improve the responsiveness of the program and stop it from hanging. In particular,
 *  if there is a large and complex program that performs independent tasks, using multi-threading is often the most elegant solution.
 *  It is now much more common than it used to be for machines to have multiple processes and multi-threading allows you to take advantage of that.
 *
 */
public class ThreadExample extends Thread {

    @Override
    public void run() {
       int i = 1;
       while(i<=20){
           System.out.println(i + " " +this.getName());
           i++;
       }
    }
}
