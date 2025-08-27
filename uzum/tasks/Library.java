package uzum.tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

public class Library {
    HashMap<UUID, Book> dataBase = new HashMap<>();

    public UUID add(Book book){
        UUID uuid = UUID.randomUUID();
        book.setId(uuid);
        dataBase.put(book.getId(), book);
        return book.getId();
    }

    public boolean remove(UUID uuid) {
        return dataBase.remove(uuid) != null;
    }


    public Book getBookById(UUID uuid){
        return dataBase.get(uuid);
    }

    public List<Book> getAll() {
        return new ArrayList<>(dataBase.values());
    }
}
