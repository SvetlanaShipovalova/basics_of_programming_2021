public class PersonBuilder {
    public Person buildPerson(String levelName, Labyrinth labyrinth) {
        return new Person(7, 6, '@', labyrinth);
    }
}
