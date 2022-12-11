package start;

import generator.Generator;
import manager.DataBase;
import model.KeyClass;
import model.ValueClass;
import service.Service;

public class Main {
    public static void main(String[] args) {
        KeyClass key1 = Generator.makeKey();
        KeyClass key2 = Generator.makeKey();
        KeyClass key3 = Generator.makeKey();
        KeyClass key4 = Generator.makeKey();
        KeyClass key5 = Generator.makeKey();
        KeyClass key6 = Generator.makeKey();
        KeyClass key7 = Generator.makeKey();
        KeyClass key8 = Generator.makeKey();
        KeyClass key9 = Generator.makeKey();
        KeyClass key10 = Generator.makeKey();

        ValueClass value1 = Generator.makeValue();
        ValueClass value2 = Generator.makeValue();
        ValueClass value3 = Generator.makeValue();
        ValueClass value4 = Generator.makeValue();
        ValueClass value5 = Generator.makeValue();
        ValueClass value6 = Generator.makeValue();
        ValueClass value7 = Generator.makeValue();
        ValueClass value8 = Generator.makeValue();
        ValueClass value9 = Generator.makeValue();
        ValueClass value10 = Generator.makeValue();

        DataBase<KeyClass, ValueClass> db = new DataBase<>();
        Service service = new Service();
        service.addIntoMap(db, key1, value1);
        service.addIntoMap(db, key2, value2);
        service.addIntoMap(db, key3, value3);
        service.addIntoMap(db, key4, value4);
        service.addIntoMap(db, key5, value5);
        service.addIntoMap(db, key6, value6);
        service.addIntoMap(db, key7, value7);
        service.addIntoMap(db, key8, value8);
        service.addIntoMap(db, key9, value9);
        service.addIntoMap(db, key10, value10);

        db.showDataBase();

        service.isKeyIntoMap(db, key8);
        service.deleteByKey(db, key2);
        service.getSizeOfMap(db);
        service.replaceValue(db, key10);
        service.replaceValueWithOldAndNewVal(db, key1);
    }
}
