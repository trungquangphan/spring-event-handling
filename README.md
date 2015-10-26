How to publish and handle event in Spring in different ways.

Spring allows us to create an event, publish and listen it in spring application since from the creation, spring's application context provides the functionality to support events and listeners in code.
Through this sample project, I will demostrate how to perform the publishing and listening an event in Spring application from Spring 3.x to 4.x.

How to create an event?

In Spring 3.x, an event must extend ApplicationEvent object that is acceptable by the event publisher
In Spring 4.2+, an event can be any object, that is the new greate feature that helps increase the flexibility of the system.

How to publish an event?

Spring provides "ApplicationEventPublisher" interface with the default implementation that publishes an event easily with simple method publishEvent(). As a sequence, in Spring 4.2+, ApplicationEventPublisher accepts any object as an event that is able to be published.

How to listen an event?

To listen an event, we need to create a listener and register it with spring's applicationo context.
In Spring 3.x, a listener closely follows the below pattern:

public class MyApplicationEventListener implement ApplicationListener<MyEventObject>{
    public void onApplicationEvent(MyEventObject myEvent) {
        //do something here....
    }
}

In Spring 4.x, the biggest new feature is the support of annotation-driven event listeners.
@Component
public class EntireApplicationListener{
    @EventListener
    public void handleMyEventObjectListener(MyEventObject myEvent) {
        //do something here....
    }
}

This also allows to handle multiple event within one class with less-effort.

We also can execute the method for handling event asynchronous by indicating explicitly ApplicationEventMulticaster with a task executor.

