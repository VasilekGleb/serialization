public class Main {

    public static void main(String[] args) {
        Person person = new Person("name",00);
        Car car = new Car("VW");
        ObjectWrite writeObject = new ObjectWrite();
        System.out.println("result ObjectWrite " + writeObject.objectWrite(person));
        ObjectRead readObject = new ObjectRead();
        System.out.println(readObject.objectRead(Person.class));
    }
}
