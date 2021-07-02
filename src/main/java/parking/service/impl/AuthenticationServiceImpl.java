package parking.service.impl;

import java.util.Optional;
import parking.lib.Injector;
import parking.lib.Service;
import parking.lib.exception.AuthenticationException;
import parking.model.Driver;
import parking.service.AuthenticationService;
import parking.service.DriverService;

@Service
public class AuthenticationServiceImpl implements AuthenticationService {
    private static final Injector injector = Injector.getInstance("parking");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    public Driver login(String login, String password) throws AuthenticationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isPresent() && driver.get().getPassword().equals(password)) {
            return driver.get();
        }
        throw new AuthenticationException("Login or password was incorrect");
    }
}
