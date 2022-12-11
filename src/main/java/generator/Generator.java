package generator;

import com.github.javafaker.Faker;
import model.KeyClass;
import model.ValueClass;

public class Generator {
    public static KeyClass makeKey(){
        Faker faker = new Faker();
        KeyClass keyClass = new KeyClass(faker.idNumber().valid());
        return keyClass;
    }

    public static ValueClass makeValue(){
        Faker faker = new Faker();
        ValueClass valueClass = new ValueClass(faker.name().firstName(), faker.name().lastName(),
                faker.date().birthday(18,65));
        return valueClass;
    }
}
