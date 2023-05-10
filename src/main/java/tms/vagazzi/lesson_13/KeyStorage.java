package tms.vagazzi.lesson_13;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString

public class KeyStorage<T>{
    private T key;

}
