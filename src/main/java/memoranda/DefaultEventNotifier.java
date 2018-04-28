/**
 * DefaultEventNotifier.java Created on 10.03.2003, 21:18:02 Alex Package:
 * net.sf.memoranda
 * 
 * @author Alex V. Alishevskikh, alex@openmechanics.net Copyright (c) 2003
 *         Memoranda Team. http://memoranda.sf.net
 */
package main.java.memoranda;

import main.java.memoranda.interfaces.IEvent;
import main.java.memoranda.interfaces.IEventNotificationListener;
import main.java.memoranda.ui.EventNotificationDialog;

/**
 *  
 */
/*$Id: DefaultEventNotifier.java,v 1.4 2004/01/30 12:17:41 alexeya Exp $*/
public class DefaultEventNotifier implements IEventNotificationListener {

	/**
	 * Constructor for DefaultEventNotifier.
	 */
	public DefaultEventNotifier() {
		super();
	}
	
	/**
	 * @see main.java.memoranda.IEventNotificationListener#eventIsOccured(main.java.memoranda.Event)
	 */
	public void eventIsOccured(IEvent ev) {		
		new EventNotificationDialog(
			"Memoranda event",
			ev.getTimeString(),
			ev.getText());
	}
	
	   /**
     * TASK 2-2 SMELL BETWEEN CLASSES
     * Smell: Speculative Generality 
     * This  class implements an interface (IEventNotificationListener.java) but 
     * implements functions that are not defined and do not provide any functionality. This can be fixed 
     * by removing the methods involved in this related functionality since 
     * they present unnecessary and superfluous code that adds zero functionality.
     * The same deletion is done in main.java.memoranda.interfaces.IEventNotificationListener
     * and in EventsScheduler.java.
     */
	
//	/**
//	 * @see main.java.memoranda.IEventNotificationListener#eventsChanged()
//	 */
//	public void eventsChanged() {
//		//
//	}

	
}
