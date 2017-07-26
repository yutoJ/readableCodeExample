package ex9;

public class PersonName {
    private final String firstName;
    private final String lastName;

    public PersonName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String fullName(){
        return String.format("%s %s", firstName, lastName);
    }

}
