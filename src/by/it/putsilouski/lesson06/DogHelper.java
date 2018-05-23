package by.it.putsilouski.lesson06;

public class DogHelper {
    static void printAllNames(Dog[] dogs) {
        for (Dog dog : dogs) {
            System.out.print(dog.getName() + " ");
        }
        System.out.println();
    }

    static double averageAge(Dog[] dogs) {
        double sum = 0;
        for (int i = 0; i < dogs.length; i++) {
            sum += dogs[i].getAge();
        }
        return sum / dogs.length;
    }
}
