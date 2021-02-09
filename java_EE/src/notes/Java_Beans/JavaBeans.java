package notes.Java_Beans;

public class JavaBeans {

    /*

      A JavaBean in general is not a specific object or program. Instead it's any program that fulfills certain programming
      standards.
      It must have all properties private and use getter and setter methods to access them.
      It must have a public constructor that takes no arguments and
      It must implement the serializable API,
      allowing it to be written to streams. It's no accident that all of these requirements pertain to the
      way in which the Bean can be acted upon by other classes.

      The point of a JavaBean is that it is a standardized modular component that's compatible with a wide variety
      of different applications.The Enterprise JavaBeans API is designed to work with object oriented server architectures.
      It provides a common framework so that any server can be augmented with standardized components thereby extending
      its functionality.


      these Beans can be plugged into any EJB compatible server without recompilation.
      Enterprise JavaBeans is a much more complicated and robust specification than the normal JavaBeans API
      which helps it to integrate into more complex systems. There are three parts to a Enterprise JavaBeans system.

 */
 /**
     1. The component,
     2. The container, and
     3. The object and its remote interface. */

/*   The component is just the program itself.It's just standard Java program which actually has the functionality of
     the whole Bean and it has to meet certain standards which I just talked about.
     It must have the getter and setter methods. It must interface with a server, etc.
     One way to think about it is if the Enterprise JavaBeans system were a drone then this would be the payload of
     the drone.Carrying this payload is the Enterprise JavaBeans container. This framework helps the server
     to interface with the JavaBeans component. It provides a wide variety of services including resource management,
     security, and version control.


     Finally, the EJB drone has to have a way to communicate where it is and what it's doing to its controllers.
     This occurs through the object which implements the remote interface of the component on the server.
     The object is what interfaces with the client directly creating a graphical user interface and carrying out tasks
     as mandated by the component.

     In this section we're going to go into a little bit more detail about the different types of Java beans components
     and how they can be used to achieve your goals.

     */

   // The first type of component is something called a Session Bean.
/**
     A session bean is what you probably think of when you hear the term Java component.
     It's just a series of methods encapsulated in a bean that performs a specific task for the client.
     The client will invoke the session beans methods and then the bean will carry them out.
     It's primary role is to act as an intermediary, allowing the client to execute business logic without directly
     interfacing with the server.
*/
/*
        As it's name suggests, the session bean is not persistent. Only local data is stored within the session bean.
        There are three sub-types of session beans:
         1. stateful,
         2. stateless, and
         3. singleton.
*/

    /** A stateful session bean is -> */
/*      designed to run within a unique client bean session. It will always be associated with
        a single client state and when the client terminates, so too does the session bean.

 */

    /** A stateless Session Bean is -> */
 /*  somewhat more persistent. It doesn't have a conversational state with a particular client. Instead, any client
     within an application can invoke the methods of that stateless bean. The invocation of the methods may contain a
     specific state, but it will only last for the duration of the invocation.
*/

    /** Finally, there are Singleton Session Beans ->*/
/*   These beans are only instantiated once for a given application and they exist for as long as the application itself
     exists. You could think of them as the bean equivalent of global variables within a Java class. However, there's
     only one singleton session bean per application. Because it exists for the entire duration of the application,
     it can be used to perform start up and clean up tasks on the application.
*/

     //On the other hand, a Message Driven Beans ->
/**
     this bean is designed as a listener that receives Java message service messages asynchronously and then acts upon them.
     You might wonder what the difference is between message driven and session beans, since session beans also respond to
     client messages.*//* The main difference is that message driven beans don't have an interface for the client to access.
     Instead, they can only respond to a single client message.*//** As a result, they tend to be relatively short lived.
     Message beans are more commonly used to handle specific events that might occur and require special behavior,
     rather than being used for the main bulk of the processing. So those are the two types of enterprise Java beans
     components
*/


    /**Session vs. Entity objects */
/*
    we're going to investigate the differences between session and entity objects within enterprise JavaBeans.
    As the name suggests, a session bean is created within a specific client session by that client.
    Although more than one client can share a session bean, the bean will only last as long as its client.
    Stateful session beans will retain a state between method calls, while stateless session beans retain no state at all.
    The state that a stateful session bean maintains is called its conversational state because it is maintaining a
    connection with one or more clients. When a client session ends, whether intentionally or due to a server crash,
    the bean disappears. When it is instantiated again, the new instantiation will not remember the state of the previous instance.
*/
/*
    On the other hand, an entity bean is designed to be persistent across multiple clients and instantiations.
    It maintains its state through a unique primary key that persistently identifies the bean. Given a primary key,
    the client can reconnect to an entity bean if it still exists. If it is no longer available, then the key can be
    used to recreate the bean with its persistent data. Entity beans are more commonly used for performing complex tasks
    for a remote client because there is a possibility that the task will not be completed in a single session.
*/

    //What is parallel processing?
/*
    If you've done any programming meant to be run on servers or clusters, then you've probably heard about parallel processing,
    but what exactly is parallel processing? Why is it so important? These are some of the questions that will be answered in here.
    Let's start with the first one. Parallel processing refers to a programming structure wherein a single program is run by
    multiple CPU cores at the same time. Depending on what the program does and how it works, this could lead to massive
    gains in speed. Of course, you might wonder why we bother working so hard to develop better methods of parallel processing.

    Why not just focus on building faster single-core CPU's? For decades that's exactly what happened. There was even a law
    coined to describe the process Moore's Law, which asserted that the number of transistors on a given area of a computer
    chip would double every 18 months. For many years, this largely held true, but eventually designers began to run into
    insurmountable problems with cooling such transistors and the speed of light was a hard cap on the size of a chip.
    In order to keep making gains in speed, computers had to switch from having one extremely fast core, to having multiple
    cores that could operate in parallel. Now that a workable solution has been found for computer hardware, it falls to us
    programmers to develop the software to match it. Once you get used to it, writing programs to run in parallel isn't difficult,
    but it requires different thought processes than sequential programming

    The first thing to do is to figure out what exactly can be parallelized. If one part of the program depends on the results of
    another part, then the second part cannot run until the first part is complete. On the other hand, most programs have large
    sections that can run without reference to one another and then combine their outputs. These are the parts that could be sped
    up with multiple processors. The objective of parallel programming then is to identify the parallelizable sections of your
    code and set them up so they can run as efficiently as possible on multiple machines. With enough processors, eventually the
    parallelizable section takes essentially no time, so the time to run the program is just equal to the time to run the
    non-parallelizable section. This concept, known as Amdahls Law, is a great way to quickly estimate how much speed can be
    gained by parallelizing an algorithm. Those are the basic principles behind parallel processing. In the next video
    we'll look at some of the techniques that are specifically applicable to enterprise Java beans.

 */


    /**CRCW, CREW, and EREW access patterns(FRAME WORKS)*/

/*  I'm going to talk about one of the key issues of parallel programming. What happens when multiple processors need to access
    the same piece of data? This challenge exists because of the way computer hardware is designed. Any type of computer processor
    runs in a series of instruction cycles, where each cycle consists of fetching an instruction, decoding it, and executing it.
    In modern computers, these cycles generally take less than a nanosecond and clock speed is measured in gigahertz, or billions
    of cycles per second. However, as long as the number of cycles is finite, there's still a chance that two cores will both send
    read or write requests to a memory location on the exact same cycle. So what should happen in this situation? We have to
    handle it somehow, or else the order in which the processors access the data could determine how the data is executed and
    we wouldn't have any good way of ensuring that our program returns consistent results because not all processors will run at the
    same speed every time. The simplest solution is just to disallow this behavior entirely.*/

    //Exclusive Read, Exclusive Write, or EREW
/** Some memory systems are set up to be exclusive read, exclusive write, or EREW. This means that only one processor can access a
    given memory location at a single time. If multiple processors attempt to do so, then only one will be able to access that
    location. Depending on the implementation of the parallel system, the other processors may either be put into a cue or denied
    access entirely. This is one of the safest set ups possible, but it's obviously slower than structures which allow multiple
    processors to read and/or write at the same time.*/

   // Exclusive Read, Exclusive Write, or EREW
/** Some memory systems are set up to be exclusive read, exclusive write, or EREW. This means that only one processor can access
    a given memory location at a single time. If multiple processors attempt to do so, then only one will be able to access that
    location. Depending on the implementation of the parallel system, the other processors may either be put into a cue or denied
    access entirely. This is one of the safest set ups possible, but it's obviously slower than structures which allow multiple
    processors to read and/or write at the same time.*/

    //  Concurrent Read, Concurrent Write, or CRCW
/** The final and fastest method of handling conflicts is known as concurrent read, concurrent write, or CRCW. In this structure,
    there are no restrictions on accessing or editing memory locations. Any number of cores can simultaneously read or write to a
    single location. Obviously this limits the number of wasted cycles, but it also leads to a certain amount of ambiguity.
    What happens when two processors try to write different values to the same memory location in one cycle? If a processor reads a
    memory location as it is being written, what value does it get? The old one or the new one? There are many different algorithms
    that can answer these questions, from picking a processor at random to weighting certain processors by priority*/


    // Big-O Notation
/*  The standard method of measuring the theoretical performance of algorithms is called Big-O Notation. In this system,
    the speed of the algorithm is defined as the relationship between the number of operations required by the algorithm
    and the size of its input. For instance, a program that takes in an input and simply writes it to a file runs in O of n time.
    For an input of size n, the program must complete something on the order of n operations. It could be two n, it could be five n,
    it doesn't really matter, it's just that it takes on the order of n operations so as it scales up, that's what it's going to take.
    A good sorting algorithm, on the other hand, takes O of n log in time, whereas the writing program will take twice as long to
    process twice as much input, if you double the size of the input for a sorting algorithm, it will take a little bit longer.
    Other algorithms scale up even more quickly taking O of n squared, O of n cubed or even O of two to the n time as input grows.
    Algorithms whose complexity scales up too quickly with the size of the input become impractical to use for large inputs.
    The beauty of big-O notation is its simplicity.*/


    // Choosing session vs. entity object types
/** You might be wondering than, what is the difference between a session bean and an entity bean? When should we use each type of
    bean and what are the differences in their capabilities? All of those questions will be answered in this video.
    A session bean is an enterprise Java bean associated with a single client session. It is created and/or activated by that client.
    It exists for the duration of a single session and then it disappears. A single session could encapsulate a single transaction
    or it could comprise a series of transactions. If the session bean is stateful, then it will maintain a conversational state
    across multiple transactions. Stateless session beans store nothing at all from transaction to transaction. The state of a
    session bean is managed by the EJB container, but the bean itself handles persistent data. In some, a session bean is a short
    lived program that handles one session between one client and one server.*/

/** On the other hand, an entity bean is associated not with a specific client session, but with a set of persistent data from
    a permanent database. Unlike session beans, entity beans are essentially permanent, so they store persistent data across
    multiple transactions and client sessions. This persistence could be either bean managed, meaning that the information is
    stored and retrieved through direct database calls, or container managed, meaning that the bean accesses the database
    indirectly using standard API's. There could be multiple instances of the same entity bean, so they each generate a primary
    key that uniquely identifies them. An interesting property of entity beans is that they don't even require a client to
    create them. A client can generate an entity bean using the create method in it's home interface, but beans can also be
    created by adding data to the database indicating that that bean type exists and no client is necessary.*/

/*  The primary determinant of whether you should use a session bean or an entity bean is the level of permanence you are looking for.
    If the access methods only need to be used by a client for a single session, and there is nothing that needs to be stored from
    session to session, then a session bean is your best choice. If all of the beans methods revolve around a specific set of
    persistent data and you need it to endure multiple clients and sessions, then an entity bean is your best choice.
    While it's possible to implement any program using either type of bean, knowing the differences between the two beans will make
    programming much easier and much more efficient.*/


}
