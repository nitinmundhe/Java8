package com.java8.methodreference;

public class MethReferenceTesting {

    public static void main(String[] args) {
        // Lambda Expression
        Sayble S1 = (int a) -> MethRef.saySomething(a);
        S1.say(1000);

        //Method Reference
        Sayble S2 = MethRef::saySomething;
        S2.say(2000);

        //Method Reference
        // ERRRO The type MethRef does not define saySomethingNew(int) that is applicable here
        //Sayble S3 = MethRef::saySomethingNew;
        //S3.say(2000);

        // Lambda Expression
        Sayble S4 = (int a) -> new MethRef().saySomethingByInstance(a);
        S4.say(1000);

        //Method Reference
        Sayble S5 = new MethRef()::saySomethingByInstance;
        S5.say(2000);


        // Lambda Expression
        Sayble S6 = (int a) -> new MethRef(a);
        S6.say(6000);

        //Method Reference
        Sayble S7 = MethRef::new;
        S7.say(7000);
    }

}
