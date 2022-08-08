package homeworkTreeMap;

public class Contact {
    private String phone;
    private String firstName;
    private String lastName;

    public Contact (String phone, String firstName, String lastName) {
        this.phone = phone;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%s)", firstName, lastName,phone);
    }
}
