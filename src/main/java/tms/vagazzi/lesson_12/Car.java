package tms.vagazzi.lesson_12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@ToString

public class Car implements Serializable {

    @Serial
    private static final long serialVersionUID = 42L;
    private int price;
    private String name;

    Car (int price, String name){
        this.price = price;
        this.name = name;
    }

    private transient int age;

}
