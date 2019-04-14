/*********************************************************************
	Rhapsody	: 8.3.1
	Login		: student
	Component	: EXE
	Configuration 	: Host
	Model Element	: DrinksMachine
//!	Generated Date	: Sun, 14, Apr 2019 
	File Path	: EXE/Host/com/telelogic/drinksmachine/DrinksMachine.java
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
// com/telelogic/drinksmachine/DrinksMachine.java                                                                  
//----------------------------------------------------------------------------

//## package com::telelogic::drinksmachine 


//## class DrinksMachine 
public class DrinksMachine implements RiJStateConcept, Animated {
    
    //#[ ignore
    // Instrumentation attributes (Animation)
    private Animate animate;
    
    public static AnimClass animClassDrinksMachine = new AnimClass("com.telelogic.drinksmachine.DrinksMachine",false);
    //#]
    
    public Reactive reactive;		//## ignore 
    
    protected int cocoaTime;		//## attribute cocoaTime 
    
    protected int coffeeTime;		//## attribute coffeeTime 
    
    protected int pouringTime;		//## attribute pouringTime 
    
    protected int stopTime;		//## attribute stopTime 
    
    protected int teaTime;		//## attribute teaTime 
    
    protected Heater heater;		//## classInstance heater 
    
    protected Display itsDisplay;		//## link itsDisplay 
    
    protected Nozzle nozzle;		//## classInstance nozzle 
    
    //#[ ignore 
    public static final int RiJNonState=0;
    public static final int Stop=1;
    public static final int Running=2;
    public static final int Pouring=3;
    public static final int makingTea=4;
    public static final int makingCoffee=5;
    public static final int makingCocoa=6;
    public static final int End=7;
    public static final int Choosing=8;
    public static final int Off=9;
    //#]
    protected int rootState_subState;		//## ignore 
    
    protected int rootState_active;		//## ignore 
    
    public static final int DrinksMachine_Timeout_Stop_id = 1;		//## ignore 
    
    protected int Running_subState;		//## ignore 
    
    public static final int DrinksMachine_Timeout_Pouring_id = 2;		//## ignore 
    
    public static final int DrinksMachine_Timeout_End_id = 3;		//## ignore 
    
    
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
    public  DrinksMachine(RiJThread p_thread) {
        try {
            animInstance().notifyConstructorEntered(animClassDrinksMachine.getUserClass(),
               new ArgData[] {
               });
        
        reactive = new Reactive(p_thread);
        initRelations(p_thread);
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## operation setup() 
    public void setup() {
        try {
            animInstance().notifyMethodEntered("setup",
               new ArgData[] {
               });
        
        //#[ operation setup() 
        coffeeTime = 70;
        teaTime = 100;
        cocoaTime = 50;
        pouringTime = 5000;
        stopTime = 4000;
        //#]
        }
        finally {
            animInstance().notifyMethodExit();
        }
        
    }
    
    //## auto_generated 
    public int getCocoaTime() {
        return cocoaTime;
    }
    
    //## auto_generated 
    public void setCocoaTime(int p_cocoaTime) {
        cocoaTime = p_cocoaTime;
    }
    
    //## auto_generated 
    public int getCoffeeTime() {
        return coffeeTime;
    }
    
    //## auto_generated 
    public void setCoffeeTime(int p_coffeeTime) {
        coffeeTime = p_coffeeTime;
    }
    
    //## auto_generated 
    public int getPouringTime() {
        return pouringTime;
    }
    
    //## auto_generated 
    public void setPouringTime(int p_pouringTime) {
        pouringTime = p_pouringTime;
    }
    
    //## auto_generated 
    public int getStopTime() {
        return stopTime;
    }
    
    //## auto_generated 
    public void setStopTime(int p_stopTime) {
        stopTime = p_stopTime;
    }
    
    //## auto_generated 
    public int getTeaTime() {
        return teaTime;
    }
    
    //## auto_generated 
    public void setTeaTime(int p_teaTime) {
        teaTime = p_teaTime;
    }
    
    //## auto_generated 
    public Heater getHeater() {
        return heater;
    }
    
    //## auto_generated 
    public Heater newHeater() {
        heater = new Heater();
        animInstance().notifyRelationAdded("heater", heater);
        return heater;
    }
    
    //## auto_generated 
    public void deleteHeater() {
        animInstance().notifyRelationRemoved("heater", heater);
        heater=null;
    }
    
    //## auto_generated 
    public Display getItsDisplay() {
        return itsDisplay;
    }
    
    //## auto_generated 
    public void __setItsDisplay(Display p_Display) {
        itsDisplay = p_Display;
        if(p_Display != null)
            {
                animInstance().notifyRelationAdded("itsDisplay", p_Display);
            }
        else
            {
                animInstance().notifyRelationCleared("itsDisplay");
            }
    }
    
    //## auto_generated 
    public void _setItsDisplay(Display p_Display) {
        if(itsDisplay != null)
            {
                itsDisplay.__setItsDrinksMachine(null);
            }
        __setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void setItsDisplay(Display p_Display) {
        if(p_Display != null)
            {
                p_Display._setItsDrinksMachine(this);
            }
        _setItsDisplay(p_Display);
    }
    
    //## auto_generated 
    public void _clearItsDisplay() {
        animInstance().notifyRelationCleared("itsDisplay");
        itsDisplay = null;
    }
    
    //## auto_generated 
    public Nozzle getNozzle() {
        return nozzle;
    }
    
    //## auto_generated 
    public Nozzle newNozzle() {
        nozzle = new Nozzle();
        animInstance().notifyRelationAdded("nozzle", nozzle);
        return nozzle;
    }
    
    //## auto_generated 
    public void deleteNozzle() {
        animInstance().notifyRelationRemoved("nozzle", nozzle);
        nozzle=null;
    }
    
    //## auto_generated 
    protected void initRelations(RiJThread p_thread) {
        heater = newHeater();
        nozzle = newNozzle();
    }
    
    //## auto_generated 
    public boolean startBehavior() {
        boolean done = true;
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
            if(Running_subState == state)
                {
                    return true;
                }
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
            switch (rootState_subState) {
                case Running:
                {
                    Running_add(animStates);
                }
                break;
                case Off:
                {
                    Off_add(animStates);
                }
                break;
                case Stop:
                {
                    Stop_add(animStates);
                }
                break;
                default:
                    break;
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
            switch (rootState_active) {
                case Choosing:
                {
                    res = Choosing_takeEvent(id);
                }
                break;
                case makingCoffee:
                {
                    res = makingCoffee_takeEvent(id);
                }
                break;
                case Pouring:
                {
                    res = Pouring_takeEvent(id);
                }
                break;
                case makingTea:
                {
                    res = makingTea_takeEvent(id);
                }
                break;
                case makingCocoa:
                {
                    res = makingCocoa_takeEvent(id);
                }
                break;
                case End:
                {
                    res = End_takeEvent(id);
                }
                break;
                case Off:
                {
                    res = Off_takeEvent(id);
                }
                break;
                case Stop:
                {
                    res = Stop_takeEvent(id);
                }
                break;
                default:
                    break;
            }
            return res;
        }
        
        //## statechart_method 
        public void Stop_add(AnimStates animStates) {
            animStates.add("ROOT.Stop");
        }
        
        //## statechart_method 
        public void Running_add(AnimStates animStates) {
            animStates.add("ROOT.Running");
            switch (Running_subState) {
                case Choosing:
                {
                    Choosing_add(animStates);
                }
                break;
                case makingCoffee:
                {
                    makingCoffee_add(animStates);
                }
                break;
                case Pouring:
                {
                    Pouring_add(animStates);
                }
                break;
                case makingTea:
                {
                    makingTea_add(animStates);
                }
                break;
                case makingCocoa:
                {
                    makingCocoa_add(animStates);
                }
                break;
                case End:
                {
                    End_add(animStates);
                }
                break;
                default:
                    break;
            }
        }
        
        //## statechart_method 
        public void Pouring_add(AnimStates animStates) {
            animStates.add("ROOT.Running.Pouring");
        }
        
        //## statechart_method 
        public void makingTea_add(AnimStates animStates) {
            animStates.add("ROOT.Running.makingTea");
        }
        
        //## statechart_method 
        public void makingCoffee_add(AnimStates animStates) {
            animStates.add("ROOT.Running.makingCoffee");
        }
        
        //## statechart_method 
        public void makingCocoa_add(AnimStates animStates) {
            animStates.add("ROOT.Running.makingCocoa");
        }
        
        //## statechart_method 
        public void End_add(AnimStates animStates) {
            animStates.add("ROOT.Running.End");
        }
        
        //## statechart_method 
        public void Choosing_add(AnimStates animStates) {
            animStates.add("ROOT.Running.Choosing");
        }
        
        //## statechart_method 
        public void Off_add(AnimStates animStates) {
            animStates.add("ROOT.Off");
        }
        
        //## auto_generated 
        protected void initStatechart() {
            rootState_subState = RiJNonState;
            rootState_active = RiJNonState;
            Running_subState = RiJNonState;
        }
        
        //## statechart_method 
        public void makingCoffeeEnter() {
            //#[ state ROOT.Running.makingCoffee.(Entry) 
            System.out.println("Wybrales kawe!");    
            char[] animationChars = new char[]{'|', '/', '-', '\\'};
            
                    for (int i = 0; i <= 100; i++) {
                        System.out.print("Zaczekaj chwile: " + i + "% " + animationChars[i % 4] + "\r");
            
                        try {
                            Thread.sleep(coffeeTime);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            
                    System.out.println("Zaczekaj chwile: Gotowe!          ");
            //#]
        }
        
        //## statechart_method 
        public void makingCoffee_entDef() {
            makingCoffee_enter();
        }
        
        //## statechart_method 
        public int Running_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evStop.evStop_drinksmachine_telelogic_com_id))
                {
                    res = RunningTakeevStop();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void Off_enter() {
            animInstance().notifyStateEntered("ROOT.Off");
            rootState_subState = Off;
            rootState_active = Off;
            OffEnter();
        }
        
        //## statechart_method 
        public int ChoosingTakeevCoffee() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("4");
            Choosing_exit();
            makingCoffee_entDef();
            animInstance().notifyTransitionEnded("4");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void makingCoffeeExit() {
        }
        
        //## statechart_method 
        public void Pouring_exit() {
            PouringExit();
            animInstance().notifyStateExited("ROOT.Running.Pouring");
        }
        
        //## statechart_method 
        public void PouringExit() {
            itsRiJThread.unschedTimeout(DrinksMachine_Timeout_Pouring_id, this);
        }
        
        //## statechart_method 
        public int OffTakeevStart() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("2");
            Off_exit();
            //#[ transition 2 
            setup();
            //#]
            Running_entDef();
            animInstance().notifyTransitionEnded("2");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ChoosingEnter() {
            //#[ state ROOT.Running.Choosing.(Entry) 
            System.out.println("Wybierz napoj");
            System.out.println("1 - Kawa, 2 - Herbata, 3 - Kakao, a - aby anulowac zamowienie");
            //#]
        }
        
        //## statechart_method 
        public void makingTea_entDef() {
            makingTea_enter();
        }
        
        //## statechart_method 
        public void StopExit() {
            itsRiJThread.unschedTimeout(DrinksMachine_Timeout_Stop_id, this);
            //#[ state ROOT.Stop.(Exit) 
            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
            System.out.println("Nacisnij 's' aby wybrac kolejny napoj. Nacisnij 'x' aby wylaczyc maszyne.");
            //#]
        }
        
        //## statechart_method 
        public void makingCocoaEnter() {
            //#[ state ROOT.Running.makingCocoa.(Entry) 
            System.out.println("Wybrales kakao! Zaczekaj chwile.");   
            char[] animationChars = new char[]{'|', '/', '-', '\\'};
            
                    for (int i = 0; i <= 100; i++) {
                        System.out.print("Zaczekaj chwile: " + i + "% " + animationChars[i % 4] + "\r");
            
                        try {
                            Thread.sleep(cocoaTime);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            
                    System.out.println("Zaczekaj chwile: Gotowe!          ");
            //#]
        }
        
        //## statechart_method 
        public void makingCoffee_exit() {
            popNullConfig();
            makingCoffeeExit();
            animInstance().notifyStateExited("ROOT.Running.makingCoffee");
        }
        
        //## statechart_method 
        public int makingTea_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = makingTeaTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void RunningExit() {
        }
        
        //## statechart_method 
        public void Running_entDef() {
            Running_enter();
            
            animInstance().notifyTransitionStarted("1");
            Choosing_entDef();
            animInstance().notifyTransitionEnded("1");
        }
        
        //## statechart_method 
        public void Stop_entDef() {
            Stop_enter();
        }
        
        //## statechart_method 
        public int Choosing_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evCoffee.evCoffee_drinksmachine_telelogic_com_id))
                {
                    res = ChoosingTakeevCoffee();
                }
            else if(event.isTypeOf(evCocoa.evCocoa_drinksmachine_telelogic_com_id))
                {
                    res = ChoosingTakeevCocoa();
                }
            else if(event.isTypeOf(evTea.evTea_drinksmachine_telelogic_com_id))
                {
                    res = ChoosingTakeevTea();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int ChoosingTakeevTea() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("8");
            Choosing_exit();
            makingTea_entDef();
            animInstance().notifyTransitionEnded("8");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int EndTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == DrinksMachine_Timeout_End_id)
                {
                    animInstance().notifyTransitionStarted("13");
                    Running_exit();
                    Off_entDef();
                    animInstance().notifyTransitionEnded("13");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void makingTeaExit() {
        }
        
        //## statechart_method 
        public void RunningEnter() {
        }
        
        //## statechart_method 
        public void Choosing_exit() {
            ChoosingExit();
            animInstance().notifyStateExited("ROOT.Running.Choosing");
        }
        
        //## statechart_method 
        public void End_entDef() {
            End_enter();
        }
        
        //## statechart_method 
        public void Pouring_enter() {
            animInstance().notifyStateEntered("ROOT.Running.Pouring");
            Running_subState = Pouring;
            rootState_active = Pouring;
            PouringEnter();
        }
        
        //## statechart_method 
        public void makingCocoa_exit() {
            popNullConfig();
            makingCocoaExit();
            animInstance().notifyStateExited("ROOT.Running.makingCocoa");
        }
        
        //## statechart_method 
        public int rootState_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            return res;
        }
        
        //## statechart_method 
        public void Running_exit() {
            switch (Running_subState) {
                case Choosing:
                {
                    Choosing_exit();
                }
                break;
                case makingCoffee:
                {
                    makingCoffee_exit();
                }
                break;
                case Pouring:
                {
                    Pouring_exit();
                }
                break;
                case makingTea:
                {
                    makingTea_exit();
                }
                break;
                case makingCocoa:
                {
                    makingCocoa_exit();
                }
                break;
                case End:
                {
                    End_exit();
                }
                break;
                default:
                    break;
            }
            Running_subState = RiJNonState;
            RunningExit();
            animInstance().notifyStateExited("ROOT.Running");
        }
        
        //## statechart_method 
        public int Stop_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = StopTakeRiJTimeout();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void EndEnter() {
            //#[ state ROOT.Running.End.(Entry) 
            System.out.println("Smacznego!");
            //#]
            itsRiJThread.schedTimeout(stopTime, DrinksMachine_Timeout_End_id, this, "ROOT.Running.End");
        }
        
        //## statechart_method 
        public void makingTea_enter() {
            animInstance().notifyStateEntered("ROOT.Running.makingTea");
            pushNullConfig();
            Running_subState = makingTea;
            rootState_active = makingTea;
            makingTeaEnter();
        }
        
        //## statechart_method 
        public int RunningTakeevStop() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("3");
            Running_exit();
            Stop_entDef();
            animInstance().notifyTransitionEnded("3");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void Stop_enter() {
            animInstance().notifyStateEntered("ROOT.Stop");
            rootState_subState = Stop;
            rootState_active = Stop;
            StopEnter();
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
        public void Off_entDef() {
            Off_enter();
        }
        
        //## statechart_method 
        public int End_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = EndTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int makingCocoa_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = makingCocoaTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void makingCocoa_entDef() {
            makingCocoa_enter();
        }
        
        //## statechart_method 
        public void makingTeaEnter() {
            //#[ state ROOT.Running.makingTea.(Entry) 
            System.out.println("Wybrales herbate! Zaczekaj chwile.");   
            char[] animationChars = new char[]{'|', '/', '-', '\\'};
            
                    for (int i = 0; i <= 100; i++) {
                        System.out.print("Zaczekaj chwile: " + i + "% " + animationChars[i % 4] + "\r");
            
                        try {
                            Thread.sleep(teaTime);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
            
                    System.out.println("Zaczekaj chwile: Gotowe!          ");
            //#]
        }
        
        //## statechart_method 
        public int PouringTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == DrinksMachine_Timeout_Pouring_id)
                {
                    animInstance().notifyTransitionStarted("5");
                    Pouring_exit();
                    End_entDef();
                    animInstance().notifyTransitionEnded("5");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
        }
        
        //## statechart_method 
        public void OffEnter() {
        }
        
        //## statechart_method 
        public void Choosing_enter() {
            animInstance().notifyStateEntered("ROOT.Running.Choosing");
            Running_subState = Choosing;
            rootState_active = Choosing;
            ChoosingEnter();
        }
        
        //## statechart_method 
        public int makingCocoaTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("11");
            makingCocoa_exit();
            Pouring_entDef();
            animInstance().notifyTransitionEnded("11");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void End_exit() {
            EndExit();
            animInstance().notifyStateExited("ROOT.Running.End");
        }
        
        //## statechart_method 
        public void makingCoffee_enter() {
            animInstance().notifyStateEntered("ROOT.Running.makingCoffee");
            pushNullConfig();
            Running_subState = makingCoffee;
            rootState_active = makingCoffee;
            makingCoffeeEnter();
        }
        
        //## statechart_method 
        public void rootStateEntDef() {
            animInstance().notifyTransitionStarted("0");
            Off_entDef();
            animInstance().notifyTransitionEnded("0");
        }
        
        //## statechart_method 
        public int makingTeaTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("10");
            makingTea_exit();
            Pouring_entDef();
            animInstance().notifyTransitionEnded("10");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void makingTea_exit() {
            popNullConfig();
            makingTeaExit();
            animInstance().notifyStateExited("ROOT.Running.makingTea");
        }
        
        //## statechart_method 
        public void StopEnter() {
            //#[ state ROOT.Stop.(Entry) 
            System.out.println("Anulowales zamowienie! Maszyna za chwile sie wylaczy.");
            //#]
            itsRiJThread.schedTimeout(stopTime, DrinksMachine_Timeout_Stop_id, this, "ROOT.Stop");
        }
        
        //## statechart_method 
        public void Off_exit() {
            OffExit();
            animInstance().notifyStateExited("ROOT.Off");
        }
        
        //## statechart_method 
        public void Choosing_entDef() {
            Choosing_enter();
        }
        
        //## statechart_method 
        public void Pouring_entDef() {
            Pouring_enter();
        }
        
        //## statechart_method 
        public void Running_enter() {
            animInstance().notifyStateEntered("ROOT.Running");
            rootState_subState = Running;
            RunningEnter();
        }
        
        //## statechart_method 
        public int ChoosingTakeevCocoa() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("9");
            Choosing_exit();
            makingCocoa_entDef();
            animInstance().notifyTransitionEnded("9");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public void ChoosingExit() {
        }
        
        //## statechart_method 
        public void rootStateExit() {
        }
        
        //## statechart_method 
        public void OffExit() {
        }
        
        //## statechart_method 
        public void EndExit() {
            itsRiJThread.unschedTimeout(DrinksMachine_Timeout_End_id, this);
            //#[ state ROOT.Running.End.(Exit) 
            System.out.println(new String(new char[50]).replace("\0", "\r\n"));
            System.out.println("Nacisnij 's' aby wybrac kolejny napoj. Nacisnij 'x' aby wylaczyc maszyne.");
            //#]
        }
        
        //## statechart_method 
        public void End_enter() {
            animInstance().notifyStateEntered("ROOT.Running.End");
            Running_subState = End;
            rootState_active = End;
            EndEnter();
        }
        
        //## statechart_method 
        public int makingCoffee_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.NULL_EVENT_ID))
                {
                    res = makingCoffeeTakeNull();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public int Pouring_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(RiJEvent.TIMEOUT_EVENT_ID))
                {
                    res = PouringTakeRiJTimeout();
                }
            
            if(res == RiJStateReactive.TAKE_EVENT_NOT_CONSUMED)
                {
                    res = Running_takeEvent(id);
                }
            return res;
        }
        
        //## statechart_method 
        public void PouringEnter() {
            //#[ state ROOT.Running.Pouring.(Entry) 
            System.out.println("Twoj napoj jest gotowy! Upewnij sie, ze kubek jest na swoim miejscu.");
            //#]
            itsRiJThread.schedTimeout(pouringTime, DrinksMachine_Timeout_Pouring_id, this, "ROOT.Running.Pouring");
        }
        
        //## statechart_method 
        public void Stop_exit() {
            StopExit();
            animInstance().notifyStateExited("ROOT.Stop");
        }
        
        //## statechart_method 
        public int Off_takeEvent(short id) {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.isTypeOf(evStart.evStart_drinksmachine_telelogic_com_id))
                {
                    res = OffTakeevStart();
                }
            
            return res;
        }
        
        //## statechart_method 
        public void makingCocoaExit() {
        }
        
        //## statechart_method 
        public void makingCocoa_enter() {
            animInstance().notifyStateEntered("ROOT.Running.makingCocoa");
            pushNullConfig();
            Running_subState = makingCocoa;
            rootState_active = makingCocoa;
            makingCocoaEnter();
        }
        
        //## statechart_method 
        public int makingCoffeeTakeNull() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            animInstance().notifyTransitionStarted("6");
            makingCoffee_exit();
            Pouring_entDef();
            animInstance().notifyTransitionEnded("6");
            res = RiJStateReactive.TAKE_EVENT_COMPLETE;
            return res;
        }
        
        //## statechart_method 
        public int StopTakeRiJTimeout() {
            int res = RiJStateReactive.TAKE_EVENT_NOT_CONSUMED;
            if(event.getTimeoutId() == DrinksMachine_Timeout_Stop_id)
                {
                    animInstance().notifyTransitionStarted("12");
                    Stop_exit();
                    Off_entDef();
                    animInstance().notifyTransitionEnded("12");
                    res = RiJStateReactive.TAKE_EVENT_COMPLETE;
                }
            return res;
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
            return DrinksMachine.this.animInstance(); 
        }
        
    }
    //#[ ignore
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public AnimClass getAnimClass() { 
        return animClassDrinksMachine; 
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
        
        msg.add("coffeeTime", coffeeTime);
        msg.add("teaTime", teaTime);
        msg.add("cocoaTime", cocoaTime);
        msg.add("pouringTime", pouringTime);
        msg.add("stopTime", stopTime);
    }
    /**  see com.ibm.rational.rhapsody.animation.Animated interface */
    public void addRelations(AnimRelations msg) {
        
        msg.add("heater", true, true, heater);
        msg.add("itsDisplay", false, true, itsDisplay);
        msg.add("nozzle", true, true, nozzle);
    }
    /** An inner class added as instrumentation for animation */
    public class Animate extends AnimInstance { 
        public  Animate() { 
            super(DrinksMachine.this); 
        } 
        public void addAttributes(AnimAttributes msg) {
            DrinksMachine.this.addAttributes(msg);
        }
        public void addRelations(AnimRelations msg) {
            DrinksMachine.this.addRelations(msg);
        }
        
        public void addStates(AnimStates msg) {
            if ((reactive != null) && (reactive.isTerminated() == false))
              reactive.rootState_add(msg);
        }
        
    } 
    //#]
    
}
/*********************************************************************
	File Path	: EXE/Host/com/telelogic/drinksmachine/DrinksMachine.java
*********************************************************************/

