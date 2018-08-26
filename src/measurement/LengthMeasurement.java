package measurement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LengthMeasurement {

    private Double millimeters;
    private Double centimeters;
    private Double meters;


    public void getNumbers(HttpServletRequest request, HttpServletResponse response) throws IOException {

        if (request.getParameter("millimeters") != null) {

            millimeters = Double.valueOf(request.getParameter("millimeters"));
        }

        if (request.getParameter("centimeters") != null) {

            centimeters = Double.valueOf(request.getParameter("centimeters"));
        }

        if (request.getParameter("meters") != null) {

            meters = Double.valueOf(request.getParameter("meters"));
        }


    }

    public void number(HttpServletRequest request, HttpServletResponse response) throws IOException {

        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        if (millimeters != null && centimeters == null && meters == null) {
            writer.println("metry: " + millimeters / 1000);
            writer.println("centrymetry: " + millimeters / 100);
            writer.println("milimetry: " + millimeters);

        }
        if (centimeters != null && meters == null && millimeters == null) {
            writer.println("Centrymentry nie są null. metry: " + centimeters / 100);
            writer.println("centrymetry: " + centimeters);
            writer.println("milimetry: " + centimeters * 10);
        }
        if (meters != null && centimeters == null && millimeters == null) {
            writer.println("Metry nie są null: metry: " + meters / 100);
            writer.println("centrymetry: " + meters);
            writer.println("milimetry: " + meters * 10);
        }


    }

}
