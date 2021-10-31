package com.inheritance.tms.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@ToString(callSuper = true)
public class MilitaryAirTransport extends AirTransport {
    private boolean hasEscapeSystem;
    private int rocketsQuantity;

    public String shot() {
        if (rocketsQuantity > 0) {
            rocketsQuantity--;
            return "Ракета пошла...";
        } else {
            return "Боеприпасы отсутствуют";
        }
    }

    public String catapult() {
        if (hasEscapeSystem) {
            setHasEscapeSystem(false);
            return "Катапультирование прошло успешно";
        } else {
            return "У вас нет такой системы";
        }
    }
}
