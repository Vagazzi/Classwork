package tms.vagazzi.lesson_14;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@ToString
@Getter
public class Fruit {
    private final String name;
    private final int weight;
    private final String colour;
}
