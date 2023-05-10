package tms.vagazzi.lesson_7.PCs;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class Computer {
    private PCSizes pcSize;
    private int sizeOfRAM;
    private String HDD;
    private String CPU;

    protected abstract void power();

}
