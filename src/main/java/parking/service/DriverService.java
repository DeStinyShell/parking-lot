package parking.service;

import java.util.Optional;
import parking.model.Driver;

public interface DriverService extends GenericService<Driver> {
    Optional<Driver> findByLogin(String login);
}
