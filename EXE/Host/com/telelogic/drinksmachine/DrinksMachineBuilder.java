/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: DrinksMachineBuilder
//!	Generated Date	: Wed, 10, Apr 2019 
	File Path	: EXE/Host/com/telelogic/drinksmachine/DrinksMachineBuilder.java
*********************************************************************/

package com.telelogic.drinksmachine;

//## auto_generated
import com.ibm.rational.rhapsody.oxf.*;
//## auto_generated
import com.ibm.rational.rhapsody.animation.*;
//## auto_generated
import com.ibm.rational.rhapsody.oxf.states.*;
//## auto_generated
import com.ibm.rational.rhapsody.animcom.animMessages.*;

//----------------------------------------------------------------------------
// com/telelogic/drinksmachine/DrinksMachineBuilder.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::drinksmachine 


//## class DrinksMachineBuilder 
public class DrinksMachineBuilder implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassDrinksMachineBuilder = new AnimClass("com.telelogic.drinksmachine.DrinksMachineBuilder",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected Display itsDisplay;		//## classInstance itsDisplay 
    
    protected DrinksMachine itsDrinksMachine;		//## classInstance itsDrinksMachine 
    
    
    //## statechart_method 
    public RiJThread getThread() {
        return reactive.getThread();
    }
    
    //## statechart_method 
    public void schedTimeout(long delay, long tmID, RiJStateReactive reactive) {
        getThread().schedTimeout(delay, tmID, reactive);
    }
    
    //## statechart_method 
    public void unschedTimeout(long tmID, RiJStateReactive reactive) {
        getThread().unschedTimeout(tmID, reactive);
    }
    
    //## statechart_method 
    public RiJEventConsumer getEventConsumer() {
        return (RiJEventConsumer)reactive;
    }
    
    //## statechart_method 
    public void gen(RiJEvent event) {
        reactive._gen(event);
    }
    
    //## statechart_method 
    public void queueEvent(RiJEvent event) {
        reactive.queueEvent(event);
    }
    
    //## statechart_method 
    public int takeEvent(RiJEvent event) {
        return reactive.takeEvent(event);
    }
    
    // Constructors
    
    //## auto_generated 
    public  DrinksMachineBuilder(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassDrinksMachineBuilder.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public Display getItsDisplay() {
        return itsDisplay;
    }
    
    //## auto_generated 
    public Display newItsDisplay(RiJThread p_thread) {
        itsDisplay = new Display(p_thread);
        animInstance().notifyRelationAdded("itsDisplay", itsDisplay);
        return itsDisplay;
    }
    
    //## auto_generated 
    public void deleteItsDisplay() {
        animInstance().notifyRelationRemoved("itsDisplay", itsDisplay);
        itsDisplay=null;
    }
    
    //## auto_generated 
    public DrinksMachine getItsDrinksMachine() {
        return itsDrinksMachine;
    }
    
    //## auto_generated 
    public DrinksMachine newItsDrinksMachine(RiJThread p_thread) {
        itsDrinksMachine = new DrinksMachine(p_thread);
        animInstance().notifyRelationAdded("itsDrinksMachine", itsDrinksMachine);
        return itsDrinksMachine;
    }
    
    //## auto_generated 
    public void deleteItsDrinksMachine() {
        animInstance().notifyRelationRemoved("itsDrinksMachine", itsDrinksMachine);
        itsDrinksMachine=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsDisplay = newItsDisplay(p_thread);
        itsDrinksMachine = newItsDrinksMachine(p_thread);
        itsDisplay.setItsDrinksMachine(itsDrinksMachine);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsDisplay.startBehavior();
        done &= itsDrinksMachine.startBehavior();
        done &= reactive.startBehavior();
        return done;
    }
    
    //## ignore 
    public class Reactive extends RiJStateReactive implements AnimatedReactive {
        
        // Default constructor 
        public Reactive() {
            this(RiJMainThread.instance());
        }
        
        
        // Constructors
        
        public  Reactive(RiJThread p_thread) {
            super(p_thread);
        }
        
        /**  methods added just for design level debugging instrumentation */
        public boolean startBehavior() {
            try {
              animInstance().notifyBehavioralMethodEntered("startBehavior",
                  new ArgData[] {
                   });
              return super.startBehavior();
            }
            finally {
              animInstance().notifyMethodExit();
            }
        }
        public int takeEvent(RiJEvent event) { 
            try { 
              //animInstance().notifyTakeEvent(new AnimEvent(event));
              animInstance().notifyBehavioralMethodEntered("takeEvent",
                  new ArgData[] { new ArgData(RiJEvent.class, "event", event.toString())
                   });
              return super.takeEvent(event); 
            }
            finally { 
              animInstance().notifyMethodExit();
            }
        }
        /**  see com.ibm.rational.rhapsody.animation.AnimatedReactive interface */
        public AnimInstance animInstance() { 
            return DrinksMachineBuilder.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassDrinksMachineBuilder; 
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
        
        msg.add("itsDisplay", true, true, itsDisplay);
        msg.add("itsDrinksMachine", true, true, itsDrinksMachine);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(DrinksMachineBuilder.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            DrinksMachineBuilder.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            DrinksMachineBuilder.this.addRelations(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/drinksmachine/DrinksMachineBuilder.java
*********************************************************************/

