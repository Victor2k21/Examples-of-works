package homeworkTreeMap;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TreeMap;
import java.util.Map;

public class MissedCalls {

    private  static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    private Map<LocalDateTime, String> storage = new TreeMap<>();

    public void addMissedCall(String phone) {
        storage.put(LocalDateTime.now(), phone);
    }

    public String toString(PhoneContacts contacts) {
        StringBuilder sb = new StringBuilder("Все пропущенные:\n");
        for (Map.Entry<LocalDateTime, String> entry: storage.entrySet()) {
            Contact contact = contacts.getByPhone(entry.getValue());
            sb
                    .append(entry.getKey().format(FORMATTER))
                    .append(" - ")
                    .append(contact == null ? entry.getValue(): contact)
                    .append("\n");
        }
        return sb.toString();
    }

    public void clear() {
        storage = new TreeMap<>();
    }
}
