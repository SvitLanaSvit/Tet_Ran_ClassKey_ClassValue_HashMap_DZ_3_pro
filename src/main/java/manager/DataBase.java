package manager;

import model.KeyClass;
import model.ValueClass;

import java.util.HashMap;
import java.util.Map;

public class DataBase<K extends KeyClass, V extends ValueClass> {
    private HashMap<K, V> hashMap;

    public DataBase(){
        hashMap = new HashMap<>();
    }

    public HashMap<K, V> getHashMap(){
        return hashMap;
    }

    public void showDataBase(){
        if(!hashMap.isEmpty()){
            System.out.println("-----------------------------------------------------------------------------");
            String id = "ID", name = "NAME", surname = "SURNAME", dateOfBirth = "DATE OF BIRTH";
            System.out.printf("%7s %13s %18s %26s%n", id,name,surname,dateOfBirth);
            System.out.println("-----------------------------------------------------------------------------");
            for (Map.Entry<K, V> entry : hashMap.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
            System.out.println("-----------------------------------------------------------------------------");
        }
    }
}
