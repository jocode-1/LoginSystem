import java.util.HashMap;

public class IdAndPassword {
    HashMap<String,String> logininfo = new HashMap<String,String> ();

    IdAndPassword(){
        logininfo.put("Admin","admin");
        logininfo.put("Ola", "jonny");
        logininfo.put("Olalekan", "Cougar@123");
    }

    protected HashMap getLoginInfo () {
        return logininfo;
    }
}
