
package UAS_PBO_ALDI;

import com.dbConn.DB;
import com.FrameLogin.FrameLogin;

public class App {
    public static void main(String[] args) {
       FrameLogin login = new FrameLogin();
       login.show();
       DB.loadConnection();
    }
    
}
