package notes.Java_EE_Facelet;

public class Java_EE_Facelets {


    /*
        Java_EE_ Servlets vs. JSP vs. Facelets

    There have been three presentation technologies in the Java EE ecosystem.
    We started with Servlets, then became JSPs, or JavaServer Pages, and newest and most recently,
    Facelets
    */

    /**
    ----------Java Servlets ---------------

        Java Servlets are the foundation of web application development in Java EE. It's important to know that
        this includes Java server faces. Servlets allow access to the basic request and response objects that
        carry information back and forth between the server and the client. After receiving the HTTP request
        from the browser, you have to painstakingly build the HTML or other markup that constitutes the response
        from the server. There aren't any utilities for common tasks like validating request, or building markup response,
        no in-built security features either
    */

    /**
    -------------- Java Server Pages ------------------------

        JSPs fill a lot of the markup gap, allowing us to focus more on business logic. It introduced
        JavaServer Pages Standard Tag Library (JSTL), And, more importantly, Expression Language (EL).
        Both of these are custom XML based markup syntax that are used to code the webpage that is presented to the end user.
        It allows us to create custom tags to generate custom HTML markup. Unfortunately, JSPs were also slow to load and compile,
        difficult to debug, and left some work to the developer on basic validation, type conversion, and security.
        I say were because JSP is deprecated. Web applications using this are incredibly outdated, and poor performing
    */

     /**
     ------------- Facelets -------------------------------

        Facelets is the latest and greatest view presentation technology. Plugging all the gaps left by JSPs and Servlets.
        It's the default presentation technology for Java server faces, offering markup generation, Expression Language,
        and JavaServer Pages Standard Tag Library Support, data type conversion, fast compilation, great rendering performance,
        validation and web application security features. We get a lot more mileage in our Web application development in
        Java EE using Facelets. At this stage in the evolution of Java Web application technology, we have the best of legacy development
        technologies without their baggage or hassle. This is the promise that Facelets technology delivers on.
    */

     /*
       *
       *    -------------------- What is JSF and why use it? -------------------
       *
       *     Simply put, it's a component-based Java EE framework for building web applications. Or as I like to say,
       *     it's object-oriented web application development for the Java developer. JSF aims to provide a web application
       *     framework that adheres to the model-view-controller pattern that's MVC and is supported by an event-driven
       *     programming model and allows the developer to build in a natural-feeling, object-oriented manner more akin
       *     to what a regular Java developer is used to. JSF is built as a platform and a very robust one at that.
       *     What I mean is that JSF starts as a technical specification, you know, a document that states how the software needs
       *     to be built or how it needs to behave so that software vendors like Red Hat or Apache could build a library that
       *     conforms to the specification standards. Then software vendors implement the version of the framework as concrete
       *     libraries

       *     JSF provides a number of easy-to-use UI components that help web developers build very powerful Ajax-enabled UIs in
       *     the web tier. It also provides fine-grained control in the back end with basic Java programming.
      */


     /*
      *     -------------- Introduction to Facelets ----------
      *
      *       Facelets is a technology that we use to create web-pages in JSF. We define our web-page components in XML syntax,
      *       save them as XHTML files, and the Facelet engine converts our XML definitions into standard HTML and JavaScript
      *
      *
      */

    /**
     *  -------------  Expression language in JSF -----------------
     *
     *  we've been seeing the pound sign and the curly brackets all over as Expression Language, but what is Expression Language?
     *  Expression language, or EL, is a scripting language, or syntax, that we use to evaluates Java variables, values,
     *  and objects within Facelets, and many other platforms. For example, EL was available in JSPs,
     *  and you'll find it in other frameworks, like the Spring Framework. For most of our usage,
     *  we use it to connect our JSF page to the Java code in our backing bean, retrieving and saving values and connecting
     *  controls to methods. If usage is generally of the form of an object, usually backing bean, then a field,
     *  or method on that bean or object. There are two fundamental rules for using EL in JSF. The first rule is that for
     *  managed bean bindings, the Java class must be annotated with the @Named annotation
     *
     *  The second rule of EL in JSF is that all managed bean fields that need to be available in Expression Language,
     *  on the web page or elsewhere, must be encapsulated by JavaBean conventions, that is,
     *  the getters and setters. If the encapsulation isn't present, the variable doesn't exist as far as EL is concerned
     *
     *
     *
     */

}



