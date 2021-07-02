package parking.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Data
public class Car {
    private Long id;
    private String model;
    private Manufacturer manufacturer;
    private List<Driver> drivers;

    public Car(String model, Manufacturer manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
        drivers = new ArrayList<>();
    }
}
