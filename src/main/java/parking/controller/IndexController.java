package parking.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import parking.lib.Injector;
import parking.model.Driver;
import parking.service.DriverService;

public class IndexController extends HttpServlet {
    private static final Injector injector = Injector.getInstance("parking");
    private final DriverService driverService = (DriverService) injector
            .getInstance(DriverService.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        HttpSession session = req.getSession();
        Driver driver = driverService.get((Long) session.getAttribute("driver_id"));
        req.setAttribute("user", driver.getName());
        req.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(req, resp);
    }
}
