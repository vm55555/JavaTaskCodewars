package exception_interviewTask;

public class SufficientFundNotAvailable extends RuntimeException{


    public SufficientFundNotAvailable(String msg){
        System.out.println(msg);
    }
}
