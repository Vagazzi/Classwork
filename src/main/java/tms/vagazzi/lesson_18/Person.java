package tms.vagazzi.lesson_18;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Person {


    @JsonIgnore
    private int age;

    @JsonProperty(value = "nick")
    private String name;

    private List<String> hobbies;

    @JsonIgnore
    private boolean isRich;
}
