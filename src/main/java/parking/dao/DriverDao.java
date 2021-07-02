package parking.dao;

import java.util.Optional;
import parking.model.Driver;

public interface DriverDao extends GenericDao<Driver> {
    Optional<Driver> findByLogin(String login);
}
