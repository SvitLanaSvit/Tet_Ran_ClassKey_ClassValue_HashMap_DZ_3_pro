package service;

import com.github.javafaker.Faker;
import manager.DataBase;
import model.KeyClass;
import model.ValueClass;

import java.util.HashMap;

public class Service {
    public void addIntoMap(DataBase<KeyClass, ValueClass> db, KeyClass key, ValueClass value){
        HashMap<KeyClass, ValueClass> map = db.getHashMap();
        map.put(key, value);
    }
    public void isKeyIntoMap(DataBase<KeyClass, ValueClass> db, KeyClass key){
        HashMap<KeyClass, ValueClass> map = db.getHashMap();
        boolean isKey = map.containsKey(key);
        if(!map.isEmpty()){
            if(isKey)
                System.out.println("Key " + key.getId() + " is in collection.");
            else System.out.println("Key " + key.getId() + " is NOT in collection.");
        }
        else{
            System.out.println("The collection is empty.");
        }
    }
    public void deleteByKey(DataBase<KeyClass, ValueClass> db, KeyClass key){
        HashMap<KeyClass, ValueClass> map = db.getHashMap();
        if(!map.isEmpty()){
            if(map.containsKey(key)){
                System.out.println(map.get(key).getName() + " " + map.get(key).getSurname() +
                        " by key " + key.getId() + " has been deleted. ");
                map.remove(key);
                db.showDataBase();
            }
        }
        else{
            System.out.println("The collection is empty.");
        }
    }
    public void getSizeOfMap(DataBase<KeyClass, ValueClass> db){
        HashMap<KeyClass, ValueClass> map = db.getHashMap();
        if(!map.isEmpty()){
            System.out.println("The count of collection is " + map.size());
        }
        else{
            System.out.println("The collection is empty.");
        }
    }
    public void replaceValue(DataBase<KeyClass, ValueClass> db, KeyClass key){
        Faker faker = new Faker();
        HashMap<KeyClass, ValueClass> map = db.getHashMap();
        if(!map.isEmpty()){
            if(map.containsKey(key)) {
                ValueClass newValue = map.get(key);
                System.out.println(newValue.getName() + " " + newValue.getSurname() + " by key " + key.getId() + " changed by");
                newValue.setName(faker.name().firstName());
                newValue.setSurname(faker.name().lastName());
                System.out.println(newValue.getName() + " " + newValue.getSurname() + " by key " + key.getId());
                map.replace(key, newValue);
                db.showDataBase();
            }
        }
        else{
            System.out.println("The collection is empty.");
        }
    }
    public void replaceValueWithOldAndNewVal(DataBase<KeyClass, ValueClass> db, KeyClass key){
        Faker faker = new Faker();
        HashMap<KeyClass, ValueClass> map = db.getHashMap();
        if(!map.isEmpty()){
            if(map.containsKey(key)) {
                ValueClass oldValue = map.get(key);
                ValueClass newValue = new ValueClass(faker.name().firstName(), faker.name().lastName(), faker.date().birthday(18,65));
                System.out.println(oldValue.getName() + " " + oldValue.getSurname() + " by key " + key.getId() + " changed by\n"
                        + newValue.getName() + " " + newValue.getSurname() + " by key " + key.getId());
                map.replace(key, oldValue, newValue);
                db.showDataBase();
            }
        }
        else{
            System.out.println("The collection is empty.");
        }
    }
}
