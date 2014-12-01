package TestPerson;

import Person.Person;
import Person.PriorityPersonQue;

/**
 * Created by digibrose on 01/12/2014.
 */
public class PriorityPersonQueTest {

    public static void main (String[] args) {

 //       System.out.println("test");

        Person Fred = new Person(34, "Fred");
        Person Sid = new Person(45, "Sid");
        Person Able = new Person(29, "Able");
        Person John = new Person(28, "John");

        PriorityPersonQue Tesco = new PriorityPersonQue();
        Tesco.insert(John);
        Tesco.insert(Fred);
        Tesco.insert(Sid);
        Tesco.insert(Able);


        System.out.println(Tesco.retrieve().returnname());
        System.out.println(Tesco.retrieve().returnname());
        System.out.println(Tesco.retrieve().returnname());
        System.out.println(Tesco.retrieve().returnname());


    }


}
