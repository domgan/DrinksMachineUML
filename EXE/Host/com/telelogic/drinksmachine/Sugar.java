/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Sugar
//!	Generated Date	: Sat, 20, Apr 2019 
	File Path	: EXE/Host/com/telelogic/drinksmachine/Sugar.java
*********************************************************************/

package com.telelogic.drinksmachine;

//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/drinksmachine/Sugar.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::drinksmachine 


//## class Sugar 
public class Sugar implements Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassSugar = new AnimClass("com.telelogic.drinksmachine.Sugar",false);
    //#]
    
    
    // Constructors
    
    //## auto_generated 
    public  Sugar() {
        try {
            animInstance().notifyConstructorEntered(animClassSugar.getUserClass(),
               new ArgData[] {
               });
        
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassSugar; 
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
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
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimInstance animInstance() {
        if (animate == null) 
            animate = new Animate(); 
        return animate; 
    } 
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addAttributes(AnimAttributes msg) {
        
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Sugar.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Sugar.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Sugar.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/drinksmachine/Sugar.java
*********************************************************************/

