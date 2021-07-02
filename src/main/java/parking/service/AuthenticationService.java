package parking.service;

import parking.lib.exception.AuthenticationException;
import parking.model.Driver;

public interface AuthenticationService {
    Driver login(String login, String password) throws AuthenticationException;
}
