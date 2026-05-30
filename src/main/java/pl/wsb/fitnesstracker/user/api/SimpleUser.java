
package pl.wsb.fitnesstracker.user.api;

public class SimpleUser {

    private Long id;
    private String firstName;
    private String lastName;

    public SimpleUser(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

