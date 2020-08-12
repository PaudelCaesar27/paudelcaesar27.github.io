import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calculate")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int i = Integer.parseInt(request.getParameter("num1"));
        int j = Integer.parseInt(request.getParameter("num2"));
        int sum = i+j;
        int k = Integer.parseInt(request.getParameter("num3"));
        int l= Integer.parseInt(request.getParameter("num4"));
        int mul = k*l;
        out.print("<html><head><meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">" +
                "<title>ServLet assignment</title></head><body><form>" );
        out.print("<input type=number value="+i+">+<input type=number value="+j+">=<input type=number value="+sum+"><br><br>");
        out.print("<input type=number value="+k+">*<input type=number value="+l+">=<input type=number value="+mul+"><br><br>");
        out.print("<button>Submit</button>");
        out.print("</form></body></html>");
        out.println("sum is s"+ sum);
        out.print("</form></body></html>");
    }
}