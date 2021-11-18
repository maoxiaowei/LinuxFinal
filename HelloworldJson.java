import com.google.gson.Gson;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloworldJson extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
       
        response.setContentType("application/json;charset=UTF-8");
              response.setCharacterEncoding("UTF-8");
       
        PrintWriter out = response.getWriter();
       
        Gson gson = new Gson();
       
        Student stu = new Student("dddd");
       	
        String json = gson.toJson(stu);
        
        out.println(json);
        out.flush();
        out.close();
   }
       
}
class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
 @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
   
}