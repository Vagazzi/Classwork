package tms.vagazzi.lesson_8;

import lombok.Getter;
import lombok.Setter;

@Setter
public class BadParent {
    private String name;

    public String getName(){
        return "this is a bad parent " + name;
    }
}
