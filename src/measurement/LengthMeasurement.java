package measurement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LengthMeasurement {


    public void getNumbers(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter writer = response.getWriter();

        String number1 = request.getParameter("millimeters");
        String number2 = request.getParameter("centimeters");
        String number3 = request.getParameter("meters");



        if (!number1.equalsIgnoreCase("")){
            double millimeters = Double.valueOf(number1);
            writer.println("metry: " + millimeters/1000);
            writer.println("cetrymetry: " + millimeters/10);
            writer.println("milimetry: " + millimeters);
        }else writer.println("Należy wprowadzić tylko jedną wartość.");

        if (!number2.equalsIgnoreCase("")){
            double centimeters = Double.valueOf(number2);
            writer.println("metry: " + centimeters * 100);
            writer.println("cetrymetry: " + centimeters);
            writer.println("milimetry: " + centimeters/10);
        }else writer.println("Należy wprowadzić tylko jedną wartość.");

        if (!number3.equalsIgnoreCase("")) {

            double meters = Double.valueOf(number3);
            writer.println("metry: " + meters);
            writer.println("cetrymetry: " + meters/100);
            writer.println("milimetry: " + meters/1000);
        }else writer.println("Należy wprowadzić tylko jedną wartość.");





    }



}
