import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent; 
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ApplicationSessionListener implements HttpSessionListener { 
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        
        System.out.println("session creada");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        HttpSession session = se.getSession();
        System.out.println(session); 
    }
}