/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evStop
//!	Generated Date	: Wed, 10, Apr 2019 
	File Path	: EXE/Host/com/telelogic/drinksmachine/evStop.java
*********************************************************************/

package com.telelogic.drinksmachine;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/drinksmachine/evStop.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::drinksmachine 


//## event evStop() 
public class evStop extends RiJEvent implements AnimatedEvent {
    
    public static final int evStop_drinksmachine_telelogic_com_id = 6621;		//## ignore 
    
    
    // Constructors
    
    public  evStop() {
        lId = evStop_drinksmachine_telelogic_com_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evStop_drinksmachine_telelogic_com_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("com.telelogic.drinksmachine.evStop");
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public Object getFieldValue(java.lang.reflect.Field f, Object userInstance) { 
         Object obj = null;
         try {
             obj = f.get(userInstance);
         } catch(Exception e) {
              java.lang.System.err.println("Exception: getting Field value: " + e);
              e.printStackTrace();
         }
         return obj;
    }
    /**  see com.ibm.rational.rhapsody.animation.AnimatedEvent interface */
    public void addAttributes(AnimAttributes msg) {      
    }
    public String toString() {
          String s="evStop(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/drinksmachine/evStop.java
*********************************************************************/

