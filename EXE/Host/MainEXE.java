/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Host
//!	Generated Date	: Wed, 10, Apr 2019 
	File Path	: EXE/Host/MainEXE.java
*********************************************************************/


//## auto_generated
import com.telelogic.drinksmachine.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.*;

//----------------------------------------------------------------------------
// MainEXE.java                                                                  
//----------------------------------------------------------------------------


//## ignore 
public class MainEXE {
    
    //#[ ignore
    // link with events in order to register them in the animation browser
    static {
      // Setting Animation Default Port 
      AnimTcpIpConnection.setDefaultPort(6423);
      // Registering Events 
      try {
        
            Class.forName("com.telelogic.drinksmachine.evCocoa");
            Class.forName("com.telelogic.drinksmachine.evCoffee");
            Class.forName("com.telelogic.drinksmachine.evKeyPress");
            Class.forName("com.telelogic.drinksmachine.evStart");
            Class.forName("com.telelogic.drinksmachine.evStop");
            Class.forName("com.telelogic.drinksmachine.evTea");
    
        // Registering Static Classes 
        
      }
      catch(Exception e) { 
         java.lang.System.err.println(e.toString());
         e.printStackTrace(java.lang.System.err);
      }
    }
    //#]
    
    protected static DrinksMachineBuilder p_DrinksMachineBuilder = null;
    
    //## configuration EXE::Host 
    public static void main(String[] args) {
        RiJOXF.Init(null, 0, 0, true, args);
        MainEXE initializer_EXE = new MainEXE();
        p_DrinksMachineBuilder = new DrinksMachineBuilder(RiJMainThread.instance());
        p_DrinksMachineBuilder.startBehavior();
        //#[ configuration EXE::Host 
        //#]
        RiJOXF.Start();
        p_DrinksMachineBuilder=null;
    }
    
}
/*********************************************************************
	File Path	: EXE/Host/MainEXE.java
*********************************************************************/

