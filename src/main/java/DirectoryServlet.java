import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DirectoryServlet",urlPatterns = "/translate")
public class DirectoryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> directory= new HashMap<>();
        directory.put("hello","Xin chào");
        directory.put("how","Thế nào");
        directory.put("book","sách");
        directory.put("computer","máy tính");
        directory.put("Thu","Doãn Tiểu Thư");
        directory.put("Tung","Doãn Công Tử ");
        directory.put("pen","but bi");
        directory.put("shake","bình nước");

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html; charset=UTF-8");

        String search= request.getParameter("txtSearch");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        String result= directory.get(search);
        if (result!= null){
            writer.println("<h2>Word: " +search+"</h2>");
            writer.println("<h2>Result: " +result+"</h2>");

        }else writer.println("<h2>Not found !</h2>");

        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
