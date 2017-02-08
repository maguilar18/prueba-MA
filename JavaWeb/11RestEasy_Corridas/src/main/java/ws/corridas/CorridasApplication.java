package ws.corridas;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
//import javafx.application.Application;
//import javafx.stage.Stage;
/**
 *
 * @author mpaguilar
 */
@ApplicationPath("")
public class CorridasApplication extends Application{
  private Set<Object> singletons = new HashSet<Object>();  
  
  public CorridasApplication(){     
     singletons.add(new CorridasWS());
  }
  
  @Override
  public Set<Object> getSingletons(){
    return singletons;
  }  
}
  

