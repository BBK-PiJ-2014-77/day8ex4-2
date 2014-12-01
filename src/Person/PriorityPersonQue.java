package Person;


/**
 * Created by digibrose on 28/11/2014.
 */
public class PriorityPersonQue implements PersonQue {

    private Person head;
    private Person tail;


    public PriorityPersonQue() {
        head = null;
        tail = null;
    }

    @Override
    public void insert(Person person) {
        Person floater;
        if (head == null) {
            head = person;
            tail = person;
        } else {
            Person stepper = head;
            while (stepper != null) {
                if (stepper.getnext() == null) {
                    stepper.setnext(person);
                    break;
                }
                else if (stepper.getnext().returnage() < person.returnage()) {
                    floater = stepper.getnext();
                    stepper.setnext(person);
                    stepper.getnext().setnext(floater);
                    break;
                }
                else {
                    stepper = stepper.getnext();
                }
            }
        }
    }

    public Person retrieve() {
        Person result = head;
        head = head.returnnext();
        return result;
    }
}
