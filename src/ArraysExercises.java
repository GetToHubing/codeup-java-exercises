import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person[] people = new Person[3]; //this creates a new array named people using the Person class made before...found in the src dir. since were using an outside class the array is an array of objects
        people[0] = new Person("David"); //this line assigns a new INSTANCE of the Person class to the first element in the people array, here the first element would be "David".
        people[1] = new Person("Luis"); //another instance of the Person class
        people[2] = new Person("Austin"); //and another instance of the Person class
        //the elements of the array can be thought of as a variable, a variable that you can use dot notation on. ex: calling the method .getName() on the people array in a loop
        for (Person person: people) {
            System.out.println(person.getName());
        }
        System.out.println("-----------------------");

        Person newPerson = new Person("Chris");
        Person newPerson1 = new Person("Chrisv2");

        people = addPerson(people, newPerson);
        people = addPerson(people, newPerson1);

        for (Person person: people) {
            System.out.println(person.getName());
        }
//        Person[] peopleV2 = addPerson(people, newPerson); //if you want a new array the new array has to match variable types, that is why you have to use Person[] here instead of some random named array
    }

    public static Person[] addPerson(Person[] people, Person newPerson){
        Person[] newPeople = Arrays.copyOf(people, people.length + 1);
//        newPeople = Arrays.copyOf(people, people.length + 1);
        newPeople[people.length] = newPerson;
        return newPeople;
    }
}
