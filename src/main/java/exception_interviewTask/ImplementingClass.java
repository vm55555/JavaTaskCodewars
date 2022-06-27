package exception_interviewTask;

public class ImplementingClass {

    public static void main(String[] args) {

        Account obj1 = new Account();
        obj1.balance = 100_000;

        obj1.withdraw(110_000);

        obj1.deposit(100_000);
    }
}

