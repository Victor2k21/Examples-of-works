package homeworkHashMap;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class PhoneContacts {
    private Map<String, List<Contact>> storage = new HashMap<>();

    public boolean addGroup(String groupName) {
        if (storage.containsKey(groupName))
            return false;
        storage.put(groupName,new ArrayList<>());
        return true;
    }
    public boolean addContact (Contact contact, String[] groupNames) {
        for (String groupName : groupNames) {
            getGroup(groupName).add(contact);
        }
        return true;
    }
    public List<Contact> getGroup (String groupName) {
        if (!storage.containsKey(groupName)) {
            addGroup(groupName);
        }
        return storage.get(groupName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, List<Contact>> entry : storage.entrySet()) {
            sb
                    .append(entry.getKey())
                    .append("\n");
            for (Contact tmpContact : entry.getValue()) {
                sb
                        .append("\t")
                        .append(tmpContact)
                        .append("\n");
            }
        }
        return sb.toString();
    }
}