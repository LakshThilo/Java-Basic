package notes.Java_EE_EnterpriseBeans;

public class EnterpriseBeans {

   /*
    * Essentially, enterprise beans are server-side components that contains business logic for an application
   * */

    /*
    * For example, if you had an application that would sell vinyl records, you might have a function that returns
    * the inventory level of your records and do an order. When a front-end client calls these methods,
    * it uses the bean component to execute functions that are hosted on the server. The advantages of using
    * this approach is the ability to isolate the front end from being responsible for these elements.
    * You can have a bean for each element or component of your application to handle specific functions or methods.
    * For example, you could have a bean just responsible for reporting your vinyl sales and returning the latest numbers.
    * The component approach of using beans allows your business logic to be portable from one application to another.
    * It can be hosted on any Java EE server.
    * */

    /*
    * So when and why should you use them? There are a few reasons. One is scalability. You want to leave room for
    * your application to grow, splitting your business logic into different components will allow your beans to be hosted
    * on different machines local or in the cloud. They're highly transactional, but also many different front-end clients
    * can be connected to them. Think about this when you are considering EJBs. So now that you understand what they are,
    * let's continue exploring what are the types of beans available.
    * */

    /*
    * There are in a sense two categories of beans, and these will be the ones we'll take a look at in chapter three and four.
    * and the message driven bean. The session bean is like a task runner, it's responsible for executing a task for a client.
    * Like we've mentioned before, returning the inventory of our vinyl records would be a part of a session bean,
    * whose main task is to handle all tasks related to inventory or orders.
    * */

    /*
    * The next one is a message drive bean which basically processes messages asychnonously, which basically means
    * the operation doesn't block the rest of the operations. It doesn't respond to client events, but to messages internal
    * to the overall application. So if we take our record store example, let's say that our inventory's getting low.
    * A message could be sent to message-driven bean to send a warning about the inventory levels.
    * They don't hold a state and aren't used by the client. Simply, an event-based mechanism driven by internal messages.
    * */

    /**
     * --------------What is the EJB JAR file? ------------------
     *
     *  If you've ever compressed or uncompressed a zip file, you already know what an EJB JAR file is.
     *  It's basically a way to put all your files related to a bean, into a compressed and shareable format
     *  you can send to other developers or deploying to your host. The way it works through developer tools such as Eclipse,
     *  you'll package your EJB files into a JAR file. When you package the JAR file, a metadata XML file labeled
     *  EJB JAR could be created to include some deployment information. And with it, you include all the other class files
     *  for this EJB module, and then you compress it, and voila, you have your bean ready to be deployed along other files
     *  or shared with other developers.
     *
     *  You'll also hear from time to time developers speak of a WAR, or EAR archive.
     *  These are basically larger archives that contains multiple modules. The EAR is an enterprise archive file which
     *  is often used for assembling server deployments, and the WAR or W-A-R is for your web server. In these larger archives,
     *  you can have multiple EJB modules all packaged into their own JAR file. And all of this makes it much easier to reuse
     *  across several applications and for deployment purposes.
     *
     *
*/
/**

    ------------------    Introduction to session beans -----------------

    Session beans are used to execute particular tasks such as returning an inventory of vinyl records,
    but session beans comes in different flavors and this is what we'll explore over the course of this chapter.
    You have the stateful, stateless, and singleton session beans, and they each have their own use.
*/


/*    ------- Stateful bean ----------
      The stateful bean maintains a state, so basically it keeps some data related to a client connected to it.
      The state of this client can be shared with another client. Once a client session is terminated, the data,
      or state is erased. A good example when to use this type is when you need to hold data in between different requests by a user.
      For example, how many times he's logged into the application.

      --------- Stateless bean --------
      The stateless bean doesn't maintain a state and it's also used by many clients, versus the stateful bean that is only used
      by the client connected to it. An example of this type of bean would be when you need to return information available
      across all your clients, but not specific to a client, say return the number of vinyl records available by an artist.

      ---------- Singleton Beans ------
      The next one is the singleton. The singleton is only executed once per application and is primarily used where
      a single instance bean is used across multiple clients. This type could be used for utilities, and functions
     that run throughout the life of an application. For example, timers, or anything that is used across the application
      and only need one instance of its class executed.*/



  /**
  * --------------- Introduction to message-driven beans -------------------------
  *
  *  we briefly explored in our introduction what were message-driven beans, but before we continue working with them,
  *  lets add a bit more information on subject. Like I've said before, message beans are used for an internal messaging
  *  system in between elements of an EJB container. In the case of our application, we'll use it to drive messages when
  *  we do transactions with our vinyl records in our database. For instance, when we add a vinyl to the collection,
  *  we'll get a notification message of the success. A message bean is a stateless bean, and is mainly used for the message queue.
  *  Typically, message beans are used for JMS APIs, and what they call a Java Message Service. In JMS,
  *  you typically have a JMS provider, JMS clients, and messages. The JMS provider is the messaging system
  *  that implements the administration and control of the messages. When you use the Java EE platform,
  *  a provider is included with your installation. The JMS clients are the components that produce and consume the messages.
  *  And this is what we'll code in the following videos. And finally, you have the messages, which are objects that contain
  *  and communicate in between JMS clients. Okay so now that we've explored these at a high-level view,
  *  let's create a message bean next.
  *
  * */
}

