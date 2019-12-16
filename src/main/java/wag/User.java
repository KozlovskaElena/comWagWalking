package wag;

public class User {

    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String cellPhone;

    public User(String email, String password, String firstName, String lastName, String cellPhone) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCellPhone() {
        return cellPhone;
    }
}
