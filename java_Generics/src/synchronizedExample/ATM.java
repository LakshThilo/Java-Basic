package synchronizedExample;

public class ATM {

    /**
     * In the first thread, t1, someone goes to an ATM and tries to withdraw $100,
     * and the second person also tries to withdraw $100 from the account.
     * I start running both threads at the same time to see what happens.
     * When I run the application, the output shows that current balance is  -100,
     * but the overdraft limit is $50, so something has gone wrong.
     * If I look again at the withdraw method in the ATM class, I can see what might have happened.
     * The first thread has entered the withdraw method and called getBalance. This returns $100,
     * because that is the amount in the account to start with.
     *
     * It then moves on to check if withdrawing the money from the account will make it overdrawn.
     * At this point, the second thread could have entered the method and called the getBalance method.
     * Because the first thread hasn't yet withdrawn any money, it also returns $100,
     * so both threads are able to withdraw $100 each, taking the account balance below the overdraft
     *
     * There is no knowing which order the threads will execute the lines in the method in,
     * so sometimes it may work perfectly fine, but sometimes, like this time, it doesn't.
     * This may seem like a complex problem to solve, but it's actually very simple.
     * All I have to do is add the synchronized keyword to the signature of the withdraw method
     * right before the return type. This means that now only one thread can enter this method at a time.
     * So the first thread will enter the method, get the balance, which will be $100, then withdraw $100.
     * So the balance is now $0.
     *
     *
     */
        static synchronized void withdraw(BankAccount account,int amount){
        //static  void withdraw(BankAccount account,int amount){

        int balance = account.getBalance();
        if((balance - amount) < - account.getOverdraft()){

            System.out.println("Transaction Denied");
        }else {

            account.debit(amount);
            System.out.println("$" + amount+ " Successfully withdraw");
        }
        System.out.println("Current balance: "+account.getBalance());

    }
}
