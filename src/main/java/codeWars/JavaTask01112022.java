package codeWars;

public class JavaTask01112022 {

    //https://www.codewars.com/kata/5388f0e00b24c5635e000fc6/train/java

    public Object[] arguments;

    public void Swapper(final Object[] args){
        arguments=args;
    }

    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }
}
