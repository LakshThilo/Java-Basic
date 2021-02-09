package notes.Java_EE;

public class Notes {


    //JAVA Application Programming Interface (API) ------
         /*
         * An application programming interface (API), in the context of Java, is a collection of pre-written packages,
         * classes, and interfaces with their respective methods, fields and constructors
         *
         * */


    // JAVA EE ----
            /*
              Java EE consists of a set of api. over 28 specifications and a runtime environment.
              This means that all Java SE APIs can be used in combination with any Java EE component.
              This set of APIs can be used to build standard component-based multi-tier applications and
              can be deployed in different containers offering a variety of services. The Java EE programming
              model relies on annotations to specify configurations, rather than XML description files,
              and uses convention over configuration to help you get up and running with as little ceremony as possible.
              It has its own contextually-aware dependency injection framework at the heart of its programming model.
             */


            // Basic Architecture

                /*
                    The most common way to develop and package a web application has always been to collect all the resources,
                    components, and class files into a single web application or Enterprise archive file, and deploy it into a web server.
                    So a typical application for a book store might include components that manage the user's accounts, process payments,
                    control stock, customer service, and generate front-end views. All this is developed in one monolithic application,
                    and then packaged and deployed into a web server. The components are packaged together in a logical modular form,
                    and deployed as one single monolithic application.
                 */


            /**  ---------- Layered Architecture ---------------- */

    //    ||    Presentation Layer(JSP, JFS, WebSocket, Servlet)
    //          ||    Business Layer(Facade, EJB, Entities)
    //              ||    Data Access Layer(JPA, JCA, JMS, Batch Processing)
    //                  ||    Crosscutting Layer(Bean Validation, CDI, Interceptor, JSON, Security, Transaction)
                /*
                    The architectural star that was used to construct the cargo tracker is monolithic and here is a
                    representation of that layered architecture. As you can see, the monolith is divided into three layers.
                    The presentation layer, where the web pages are constructed from templates and requests from
                    users are received, processed, and forwarded to the business layer. The business layer is
                    where the heavy lifting of the application is done, and the data access layer manages the persistence
                    and retrieval of data used by the application. In each of these boxes are the APIs typically deployed
                    by code in that layer. So, for example, we can see that the Presentation Layer uses JSF to generate views,
                    the Business Layer uses EJBs to encapsulate business logic, and the Data Access Layer uses JPA to manage persistence.
                    The other box that you can see here, labelled Crosscutting Concerns, is about concerns that affect different
                    parts of the application, and often relate to locking and transaction concerns. In the box,
                    you can see some of the APIs that tackle these issues.

                 */


    // (JSF) - JavaServer Faces
        /*
             When building web application we provide the end user with a way to interact with our application and this is what JSF gives us
        */

        //  (MVC) --->> Model View Controller
                /*
                    MVC is an architectural design pattern for implementing user interfaces that divide the web application
                    into three logical connected parts. It does this in order to separate the internal representation of data from the manner in which that data is presented.

                 */

     // (CDI) -  Context and Dependency Injection

    /*
        Java EE has one of the easiest to use and most extensible dependency injection frameworks out there.
        By default, almost all Java objects are injectable, all they need to do is comply with JSR299,
        and they are instantiated by the container and ready for injection into a qualifying injection point that the container finds.
        No special annotation is required to identify the parameter you want to make injectable, this is often the case with other IOC frameworks.
        This may include EJBs, JNDI resources, persistence units, persistence contexts, as well as any object which would have been created by a factory,
        in fact, with the help of something called producer methods, any object can be made injectable.

        Imagine you have a list of objects, say books,and you want to inject this into a library service,
        you can do this by annotating a method that returns a list of books with the annotation out produces.

       @Producer
       public List<Book> availableBooks()
       {
        return getListOfBooksFromDatabase();
       }

        To mark an injection point, we use the annotation @inject, here the disposer's annotation identifies the disposed parameter of a disposer method,
        and disposer method allows the application to perform customized clean-up of an object returned by a producer method or producer field.


                     -------- Expression Language Beans  ------------

                     Beans that you want to make accessible to expression language are annotated @Named.
                     The bean is accessed by using the bean name with the first letter in lower cased

                           @Named("Tracker")
                           @ViewScoped
                           public class Track{....}



                     -------- Type Safety  ------------

                    The dependency injection service enables you to inject objects in a typesafe way,
                    and to choose a deployment time which implementation of the particular interface to inject.
                    So, instead of injecting objects by a string name, CDI uses the object's type to resolve injections.
                    When type is insufficient, a custom @Qualifier annotation can be used to disambiguate concrete implementations



                     -------- Context Service  ------------

                    The context service empowers you to bind the life cycle and interactions of stateful components
                    to well-defined life cycle contexts. Injected references to the beans are contextually aware,
                    the references always apply to the bean that is associated with a context for the thread that is making the reference.
                    There are eight scopes defined, and the CDI service places beans in the appropriate scope as defined
                    by the Java EE specifications. For example, an HTTP request context and its beans exist during the life cycle of an HTTP request.
                    There are two scopes that related to JSF, ViewScoped and FlowScoped, one scope that relates to transactions,
                    and three that relate to HTTP life cycles, an application scope, and the default, which is the dependent scope

                    HTTP Request -> @RequestScoped
                    JSP -> @ViewScoped. @FlowScoped
                    Transaction -> @Transaction
                    HTTP Life Cycle -> @RequestScoped, @SessionsScoped, @ConversationScoped
                    Default ->  @Application scope, @Dependent scope.

     */



    // JSP- JavaServer Pages  and (EL) - Expression Language

         /*
             JSP is Java EE's legacy of web programming technology which was released in the first version of J2E back in 1999.
             Later, it was replaced in 2003 by JSF, but it's development continued with the latest version 2.3 being released in Java EE 7
             Even though JSF has overtaken JSP as the preferred option, there are still many applications that use JSP,
            and it is very likely that you'll come across these applications for quite a few years to come. So,
            it's worth having an appreciation of this technology.

            SP consists of HTML code, and allows Java code inclusion for dynamic content.
            Since web applications contain a lot of user screens, JSPs are used a lot in web applications.
            To bridge the gap between Java code and HTML in JSP it provides additional features such as JSP tags,
            expression language, and custom tags. This makes it easy to understand and help a web developer to quickly develop JSP pages
            However, most of the times, we would use JSP for view purposes only,
            and all the business logic will be presented in servlet code or model classes.

            However, the separation of view logic and business logic is not always kept so clear.
            JSP scriptlets allow Java code to be written directly in the view logic,
            which clouds the separation. Such Java code is entered directly
            in the JSP page between rocket and and percentage signs, like so

            <%
                String user = request.getParameter("id");
                String pwd = request.getParameter("password");
            %>

            Here, we're using Java code to access the http request object in order to retrieve the query parameter named id and password.
            Mixing this kind of logic with view technology is bad practice; this is why modern Java E applications opt not to use JSP,
            but instead use the better structured, component-based JSF language


            We can use implicit objects in JSP directly in scriptlets as we saw in the previous slide
            to access the values related to the current scope or http objects.
            Here we are referencing the http request object to obtain the context path.


            To complicate matters, Expression Language has it's own implicit objects that are similarly named to those available in JSP,
            and are related to the same http objects and scope.

            ${request.getParameter("id");}

            Here we are obtaining the context path for the http request object,
            just as we did in the JSP example before.

            Let's widen the topic slightly and look at how we use Expression Language in JSP and JSF.
            In both cases, the object reference is named the same, and references the same object.
            The only difference is the syntax used to refer to the instance: JSP uses a dollar sign,
            while JSF uses the #.

            Implicit object: #{request.contentPath}
            Bean property: #{track.trackingId}

            And, as we have seen before, the bean name is referenced
            by using the class name with the first letter in lower case,
            unless another name has been explicitly defined in the named annotation. And finally,
            Let's see just a little of the syntax that we use in Expression Language. As you might expect,
            it's very familiar. We have the standard logical operators that validate equality, and perform mathematical operations.
            Additionally, we are given some syntactic sugar over compound operations such as not empty operation, which we see here
         */



    //  (EJB) - Enterprise Java Beans

    /*
        ------------ Enterprise Java Beans  --------------------

                 The Java E programming model has been simplified substantially since J2EE.
                 Annotations have replaced the xml description files, convention over configuration has replaced the
                 tedious manual configuration, and dependency injection hides the creation and look up of resources.
                 All you need is a plain old java object, and an annotation that specifies its services, and you have
                 yourself an EJB. It does not need to extend an interface or adopt a class hierarchy, unlike previous versions.
                 EJB3 simplified programming model emphasizes convention over configuration.
                 Allowing you to write the least amount of code required to make something work.

                 We have been talking about the different layers of a typical application, and we have talked about
                 the presentation layers so far. But now, we want to go on and talk about the business layer.
                 This is where EJBs fit into our architecture. EJBs tend to encapsulate business logic.
                 So, this is where you'll find much of the heavy weight logic being executed.
                 EJBs execute in a container that provide a range of services to your EJBs such as thread safety.
                 In fact, all EJBs are thread safe. And as each EJB instance runs in a single threaded context,
                 you will never run into concurrency issues. Instances are pulled and access is throttled.
                 EJBs are monitored. If you look at the container console, you should find an interesting interface
                 showing data related to your EJBs that are running, and response times, and much, much more useful information, as well.
                 Your EJBs will always run within a transaction, so whenever you call an EJB method,
                 you can be assured that it will execute within a transaction. All of these services are provided out of the box,
                 and for free by the container.

                There are essentially two types of EJBs. Session beans, and message driven beans.
                These beans have supporting annotations. Session beans implement business logic.
                These are going to be either @Stateful, @Stateless or @Singletons.

                A session bean functions as an extension of the client in the sense that it holds specific client-related data,
                that is unique and distinct client state data. It creates a one-to-one relationship between the client and the bean itself.
                So, if there are 100 client connections, there will be 100 instances of the stateful bean in memory.
                So, when designing a bean, you must ask yourself, is this bean an extension of the client. If so,
                I need the bean to hold state, so it must be a @Stateful bean, otherwise, it should be a @Stateless bean.
                If I want to reuse objects, and have a single object accessed by multiple clients, you should use either a @Singleton or a @Stateless bean.
                In the stateless world, this many-to-one relationship is created through a pulling structure.
                So, when a client makes a request, it looks and feels like a many-to-one relationship, but actually,
                one object is retrieved from the pool.

                There is only one type of workflow bean, which is the @MessageDriven bean,
                and we annotate it @MessageDriven. Message driven beans are extensions of the messaging system,
                representing the endpoint functionality. They don't need to worry about how the message is delivered,
                or consumed, only what to do with it when it arrives. It's just about message handling.
                They look and feel similar to stateless session beans, but cannot be directly accessed by a client.
                The only way to interact with the message bean is via messages. They are completely hidden from the client.


                EJBs can be classed into three access modes depending on the access afforded to the client.
                The default mode is local access. This means that the bean cannot be accessed over the network,
                but only from within the container itself.

                The remote mode means that an EJB can be accessed by an external application.

                An web service mode means that the EJB can be accessed via a client using the web service as a protocol.

                Access mode is specified by the annotation.

                The management mode determines who is responsible for configuring the bean's service.
                By default, the container manages the bean's configuration, and this is the mode that is most commonly used.

                The container makes intelligent default configurations based on convention. However,
                the developer can take back this control and manage the bean's configuration within the bean class itself.
                This means that the bean's transactions, characteristics, security and so on, are in the hands of the developer.
                This is done by using the service annotations. Configuration of a bean is made via metadata passed to the appropriate annotation.
                Concurrency can be figured via annotations such as @Lock, which controls read and write operations.
                An @AccessTimeout period can be explicitly configured via the access timeout annotation.

                The scope of a transaction can be controlled via the transaction attribute and the transactional annotation.
                Security options can also be defined. For example, @PermitAll can be used to specify that all security roles are allowed to evoke the annotated method.
                And @RolesAllowed to specify the security roles permitted to access the method. The client access can be controlled by @Remote and @Local annotations,
                and special behaviour can be given to beans that makes them @Asynchronous and act as cute based on a chron-style time schedule.
                To bring all this together, I have summarized what we have been talking about in a table that shows
                the EJB's different component types against client access and relationship. So, as you can see,
                EJB is a fully featured API that conveys a lot of powerful characteristics to your beans,
                with little or no code on your behalf. So, let's move on and see some of this in action.


                ------------ Service Annotation --------------

                    Concurrency: @Lock, @AccessTimeout
                    Transaction: @Transactional. @TransactionAttribute
                    Security:    @PermitAll, @RoleAllowed
                    Access:      @Remote, @Local
                    Behaviour:    @Schedule, @Asynchronous

     */
}
