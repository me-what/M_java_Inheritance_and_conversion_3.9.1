public class Main {
    public static void main(String[] args) {
        Person tom = new Person("Tom");
        tom.display();
        System.out.println();

        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        System.out.println();

        Person bob = new Client("Bob", "DeutscheBank", 3000);
        bob.display();
        System.out.println();

        Person nolan = new Client("Nolan", "DeutscheBank", 3000);
        nolan.display();
        System.out.println();

        Person alice = new Employee("Alice", "Google");
        alice.display();
        System.out.println();

        Object pavel = new Employee("Pavel", "Telegram");
        Employee emp = (Employee) pavel;
        emp.display();
        System.out.println(emp.getCompany());
        System.out.println();

        Object paul = new Client("Paul", "DeutscheBank", 2000);
        ((Person) paul).display();
        System.out.println();

        Object yan = new Employee("Yan", "Chess.com");
        ((Employee) yan).display();
        System.out.println();

        Object anna = new Client("Anna", "DeutscheBank", 2000);
        if (anna instanceof Client clientAnna) {
            clientAnna.display();
        } else {
            System.out.println("Conversion is invalid");
        }
    }
}