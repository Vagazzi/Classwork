package tms.vagazzi.lesson_18;

import com.sun.xml.txw2.annotation.XmlAttribute;
import lombok.*;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@AllArgsConstructor
@Setter
@ToString
@Getter
@NoArgsConstructor
@XmlAccessorType(XmlAccessType.FIELD)
public class Student {

    private int id;

    @XmlElement(name = "nick")
    private String name;
    private String gender;
    private Course course;

}
