package homeworkTreeMap;
import java.util.HashMap;
import java.util.Map;

public class PhoneContacts {
    private Map<String, Contact> storage = new HashMap<>();

    public void addContact(Contact contact) {
        storage.put(contact.getPhone(), contact);
    }

    public Contact getByPhone(String phone) {
        return storage.get(phone);
    }
}
