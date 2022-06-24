package javaCertificate.part4.Task1_inheritance;

public class Car extends Vehicle{

    String trans;

    Car(String type, int maxSpeed, String trans){
        super(type, maxSpeed);
        this.trans = trans;
    }

//    Car(String type, int maxSpeed, String trans){
//        super(type, maxSpeed);
//       // this(trans); - this has to be first statement
//    }

    @Override
    public String toString() {
        return "Car{" +
                "trans='" + trans + '\'' +
                "speed" + maxSpeed +
                '}';
    }
}
