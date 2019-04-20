/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: evSugar
//!	Generated Date	: Sat, 20, Apr 2019 
	File Path	: EXE/Host/com/telelogic/drinksmachine/evSugar.java
*********************************************************************/

package com.telelogic.drinksmachine;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.RiJEvent;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/drinksmachine/evSugar.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::drinksmachine 


//## event evSugar() 
public class evSugar extends RiJEvent implements AnimatedEvent {
    
    public static final int evSugar_drinksmachine_telelogic_com_id = 6622;		//## ignore 
    
    
    // Constructors
    
    public  evSugar() {
        lId = evSugar_drinksmachine_telelogic_com_id;
    }
    
    public boolean isTypeOf(long id) {
        return (evSugar_drinksmachine_telelogic_com_id==id);
    }
    
    //#[ ignore
    /** the animated event proxy */
    public static AnimEventClass animClass = new AnimEventClass("com.telelogic.drinksmachine.evSugar");
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
          String s="evSugar(";      
          s += ")";
          return s;
    }
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/drinksmachine/evSugar.java
*********************************************************************/

