/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: Display
//!	Generated Date	: Sat, 20, Apr 2019 
	File Path	: EXE/Host/com/telelogic/drinksmachine/Display.java
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
// com/telelogic/drinksmachine/Display.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::drinksmachine 


//## class Display 
public class Display implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassDisplay = new AnimClass("com.telelogic.drinksmachine.Display",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected DrinksMachine itsDrinksMachine;		//## link itsDrinksMachine 
    
    protected KeyReader itsKeyReader;		//## classInstance itsKeyReader 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int WaitForKeys=1;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    
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
    public boolean isIn(int state) {
        return reactive.isIn(state);
    }
    
    //## statechart_method 
    public boolean isCompleted(int state) {
        return reactive.isCompleted(state);
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
    public  Display(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassDisplay.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation processKey(char) 
    public void processKey(char key) {
        try {
            animInstance().notifyMethodEntered("processKey",
               new ArgData[] {
                   new ArgData(char.class, "key", AnimInstance.animToString(key))
               });
        
        //#[ operation processKey(char) 
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public DrinksMachine getItsDrinksMachine() {
        return itsDrinksMachine;
    }
    
    //## auto_generated 
    public void __setItsDrinksMachine(DrinksMachine p_DrinksMachine) {
        itsDrinksMachine = p_DrinksMachine;
        if(p_DrinksMachine != null)
            {
                animInstance().notifyRelationAdded("itsDrinksMachine", p_DrinksMachine);
            }
        else
            {
                animInstance().notifyRelationCleared("itsDrinksMachine");
            }
    }
    
    //## auto_generated 
    public void _setItsDrinksMachine(DrinksMachine p_DrinksMachine) {
        if(itsDrinksMachine != null)
            {
                itsDrinksMachine.__setItsDisplay(null);
            }
        __setItsDrinksMachine(p_DrinksMachine);
    }
    
    //## auto_generated 
    public void setItsDrinksMachine(DrinksMachine p_DrinksMachine) {
        if(p_DrinksMachine != null)
            {
                p_DrinksMachine._setItsDisplay(this);
            }
        _setItsDrinksMachine(p_DrinksMachine);
    }
    
    //## auto_generated 
    public void _clearItsDrinksMachine() {
        animInstance().notifyRelationCleared("itsDrinksMachine");
        itsDrinksMachine = null;
    }
    
    //## auto_generated 
    public KeyReader getItsKeyReader() {
        return itsKeyReader;
    }
    
    //## auto_generated 
    public void __setItsKeyReader(KeyReader p_KeyReader) {
        itsKeyReader = p_KeyReader;
        if(p_KeyReader != null)
            {
                animInstance().notifyRelationAdded("itsKeyReader", p_KeyReader);
            }
        else
            {
                animInstance().notifyRelationCleared("itsKeyReader");
            }
    }
    
    //## auto_generated 
    public void _setItsKeyReader(KeyReader p_KeyReader) {
        if(itsKeyReader != null)
            {
                itsKeyReader.__setItsDisplay(null);
            }
        __setItsKeyReader(p_KeyReader);
    }
    
    //## auto_generated 
    public KeyReader newItsKeyReader(RiJThread p_thread) {
        itsKeyReader = new KeyReader(p_thread);
        itsKeyReader._setItsDisplay(this);
        animInstance().notifyRelationAdded("itsKeyReader", itsKeyReader);
        return itsKeyReader;
    }
    
    //## auto_generated 
    public void deleteItsKeyReader() {
        itsKeyReader.__setItsDisplay(null);
        animInstance().notifyRelationRemoved("itsKeyReader", itsKeyReader);
        itsKeyReader=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        itsKeyReader = newItsKeyReader(p_thread);
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
        done &= itsKeyReader.startBehavior();
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
            initStatechart();
        }
        
        //## statechart_method 
        public boolean isIn(int state) {
            if(rootState_subState == state)
                {
                    return true;
                }
            return false;
        }
        
        //## statechart_method 
        public boolean isCompleted(int state) {
            return true;
        }
        
        //## statechart_method 
        public void rootState_add(AnimStates animStates) {
            animStates.add("ROOT");
            if(rootState_subState == WaitForKeys)
                {
                    WaitForKeys_add(animStates);
                }
        }
        
        //## statechart_method 
        public void rootState_entDef() {
            {
                rootState_enter();
                rootStateEntDef();
            }
        }
        
        //## statechart_method 
        public int rootState_dispatchEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(rootState_active == WaitForKeys)
                {
                    res = WaitForKeys_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void WaitForKeys_add(AnimStates animStates) {
            animStates.add("ROOT.WaitForKeys");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
        }
        
        //## statechart_method 
        public void WaitForKeysExit() {
        }
        
        //## statechart_method 
        public void WaitForKeys_exit() {
            WaitForKeysExit();
            animInstance().notifyStateExited("ROOT.WaitForKeys");
        }
        
        //## statechart_method 
        public int WaitForKeys_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evKeyPress.evKeyPress_drinksmachine_telelogic_com_id))
                {
                    res = WaitForKeysTakeevKeyPress();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void WaitForKeys_entDef() {
            WaitForKeys_enter();
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void rootState_enter() {
            animInstance().notifyStateEntered("ROOT");
            rootStateEnter();
        }
        
        //## statechart_method 
        public void rootStateEnter() {
        }
        
        //## statechart_method 
        public int WaitForKeysTakeevKeyPress() {
            evKeyPress params = (evKeyPress) event;
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            //## transition 2 
            if(params.key == 's')
                {
                    animInstance().notifyTransitionStarted("1");
                    animInstance().notifyTransitionStarted("2");
                    WaitForKeys_exit();
                    //#[ transition 2 
                    itsDrinksMachine.gen(new evStart());
                    //#]
                    WaitForKeys_entDef();
                    animInstance().notifyTransitionEnded("2");
                    animInstance().notifyTransitionEnded("1");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            else
                {
                    //## transition 3 
                    if(params.key == 'a')
                        {
                            animInstance().notifyTransitionStarted("1");
                            animInstance().notifyTransitionStarted("3");
                            WaitForKeys_exit();
                            //#[ transition 3 
                            itsDrinksMachine.gen(new evStop());
                            //#]
                            WaitForKeys_entDef();
                            animInstance().notifyTransitionEnded("3");
                            animInstance().notifyTransitionEnded("1");
                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                        }
                    else
                        {
                            //## transition 4 
                            if(params.key == '1')
                                {
                                    animInstance().notifyTransitionStarted("1");
                                    animInstance().notifyTransitionStarted("4");
                                    WaitForKeys_exit();
                                    //#[ transition 4 
                                    itsDrinksMachine.gen(new evCoffee());
                                    //#]
                                    WaitForKeys_entDef();
                                    animInstance().notifyTransitionEnded("4");
                                    animInstance().notifyTransitionEnded("1");
                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                }
                            else
                                {
                                    //## transition 5 
                                    if(params.key == '2')
                                        {
                                            animInstance().notifyTransitionStarted("1");
                                            animInstance().notifyTransitionStarted("5");
                                            WaitForKeys_exit();
                                            //#[ transition 5 
                                            itsDrinksMachine.gen(new evTea());
                                            //#]
                                            WaitForKeys_entDef();
                                            animInstance().notifyTransitionEnded("5");
                                            animInstance().notifyTransitionEnded("1");
                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                        }
                                    else
                                        {
                                            //## transition 6 
                                            if(params.key == '3')
                                                {
                                                    animInstance().notifyTransitionStarted("1");
                                                    animInstance().notifyTransitionStarted("6");
                                                    WaitForKeys_exit();
                                                    //#[ transition 6 
                                                    itsDrinksMachine.gen(new evCocoa());
                                                    //#]
                                                    WaitForKeys_entDef();
                                                    animInstance().notifyTransitionEnded("6");
                                                    animInstance().notifyTransitionEnded("1");
                                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                                }
                                            else
                                                {
                                                    //## transition 7 
                                                    if(params.key == 'x')
                                                        {
                                                            animInstance().notifyTransitionStarted("1");
                                                            animInstance().notifyTransitionStarted("7");
                                                            WaitForKeys_exit();
                                                            //#[ transition 7 
                                                            System.exit(1);
                                                            //#]
                                                            WaitForKeys_entDef();
                                                            animInstance().notifyTransitionEnded("7");
                                                            animInstance().notifyTransitionEnded("1");
                                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                                        }
                                                    else
                                                        {
                                                            //## transition 8 
                                                            if(params.key == 'n')
                                                                {
                                                                    animInstance().notifyTransitionStarted("1");
                                                                    animInstance().notifyTransitionStarted("8");
                                                                    WaitForKeys_exit();
                                                                    //#[ transition 8 
                                                                    itsDrinksMachine.gen(new evSugar());
                                                                    //#]
                                                                    WaitForKeys_entDef();
                                                                    animInstance().notifyTransitionEnded("8");
                                                                    animInstance().notifyTransitionEnded("1");
                                                                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                                                }
                                                            else
                                                                {
                                                                    //## transition 9 
                                                                    if(params.key == 't')
                                                                        {
                                                                            animInstance().notifyTransitionStarted("1");
                                                                            animInstance().notifyTransitionStarted("9");
                                                                            WaitForKeys_exit();
                                                                            //#[ transition 9 
                                                                            itsDrinksMachine.gen(new evSugar());
                                                                            //#]
                                                                            WaitForKeys_entDef();
                                                                            animInstance().notifyTransitionEnded("9");
                                                                            animInstance().notifyTransitionEnded("1");
                                                                            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            return res;
        }
        
        //## statechart_method 
        public void WaitForKeys_enter() {
            animInstance().notifyStateEntered("ROOT.WaitForKeys");
            rootState_subState = WaitForKeys;
            rootState_active = WaitForKeys;
            WaitForKeysEnter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            WaitForKeys_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void WaitForKeysEnter() {
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
            return Display.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassDisplay; 
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
        
        msg.add("itsKeyReader", true, true, itsKeyReader);
        msg.add("itsDrinksMachine", false, true, itsDrinksMachine);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(Display.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            Display.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            Display.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/drinksmachine/Display.java
*********************************************************************/

