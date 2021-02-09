package notes.Java_EE_WebServices;

public class Java_WebServices {

  //  Simple Object Access Protocol, or SOAP, sends messages using XML. An XML document is sent with the data in a certain format.
  //  Representational State Transfer, or REST, uses a web protocol, HTTP, to access resources like documents, pictures, or videos.

/*    You'll see benefits in re-usability, interoperability, usability, and deployability.

    First, web services support re-usability of code. A web service is a small reusable component that can be used by multiple
    systems. This can allow organizations to use web services provided by third parties. This reduces their development
    time and delivers more powerful applications

    Second, web services provide the ability for systems to communicate back and forth, and they provide language transparency.
    This means the service provider can write the web service in one language like PHP or Node.js then the service client can
    be written in a totally different language, like Python, Ruby, or Perl and they can still communicate because they speak
    a common language, such as XML or JSON. For example, a web service created in a .net platform can be invoked by
    any client application implemented in a different programming language like Java. Language transparency also
    allows you to develop services or client side code using the languages and tools you want.

    Third, web services promote usability. It's an easy way to make the data more accessible to other systems in a secure fashion.
    The data can be used by a wide range of audiences and platforms

    And finally, web services promote deployability. They are deployed over standard internet technologies making them
    easily available on a global level.
    */
/**

    we're going to talk about integration technologies or how you can use you application to service other clients that you have not programmed so back to
    our view of all of the end layers that we're dealing with integration is the ability to take your business service and provide it to a different
    presentation layer.

    So we're thinking about other people that are creating websites and mobile apps primarily and they can use your server and your
    service. So the idea is that your application can be a customer or a server to other people so for instance Facebook opens up their API so you can
    write applications to run on their platform.

    You can write your program in Java or JavaScript or other languages even though Facebook might not be using the same language so
    we're going to be building the blue part on the right side a java application that will provide the service to other clients so for instance
    if we set up a weather service we would provide the name of the city and the degrees of temperature or forecast data other people.
    Then could write their own little JavaScript app or their mobile app that would use that data and create their own service.
    so there's always a service in between a database a service and then the presentation could be on a different kind of device

    lots of companies provide services through JSON and XML, Facebook Twitter Amazon almost everybody out there that's willing to share their data is using
    rest services to do it and so it's an extremely important skill that you should have on your resume so why do we keep calling it rest services it's not because the
    server is at rest or anything so rest is just an acronym for Representational State Transfer it means that you can handle all the four crud operations in a
    database reading writing updating and deleting so you can see it's running on the HTTP protocol so we're going to be testing it in our web browser so a web api is a
    option that companies open up so that you can use their data so you can build your own custom app that uses Instagram or Google or YouTube videos embedded
    directly into your application JSON is the default format that people use these days javascript object notation is what json stands for
*/

/*
    Why is Java EE 8 a great platform for building lightweight state-of-the-art microservices? Well,
    this is the question: why? And the short answer is simple. Because Java EE 8 is the most lightweight enterprise
    framework currently out there, right? Enough said. Well, let me give you a few more details.
*/


/*
    First up, Java EE is an industry standard. It's been developed by a vendor-neutral committee.
    And there is widespread knowledge out there because Java EE is, well, out there for a couple years already!
    Java EE consists of several specifications and these specifications have a very tight integration. Also,
    Java EE applies a convention-over-configuration programming model. Which means that you don't need cumbersome
    XML scripts anymore. You only need throw in a couple of annotations and you're done. For most of the services
    you're going to develop, you will not need any external dependencies. And this leads to thin deployment artifacts.
    We talk about this in more detail in a couple of minutes. And finally, you have the availability of modern application
    servers that suit the cloud era
*/

/*
    like, a JPA for persistence, JMS for messaging, got JAX-WS for web services and JAX-RS for rest services,
    there's so many APIs you can use for your modern enterprise application development
*/

/*
    what's new in Java EE 8. So in this video, we're going to take a look at the different APIs of Java EE 8 and their
    latest advances and especially with a focus on the more microservice relevant APIs
*/

/*
    o we're going to look at JSR 370 which JAX-RS 2.1. We're going to have a look at JSR 367 which is the JSON Binding.
    And also JSR 374 which is the Java API for JSON Processing
*/


/*
    I see that CDI is been bumped to version 2.0, mainly focusing on asynchronous events also the Servlet API has
    been bumped to 4.0 adding HTTP/2 support. JSF 2.3 which is an API to build server side UIs. The old JSF Bean
    Managed model has been removed and it's fully integrated with CDI now. On the right hand side you see the
    Bean Validation API which has been bumped to 2.0. It tightly integrates with CDI now and
    it's been fully revamped to support Java 8 features such as Streams and Lambdas.
    And there is a totally new Security API for you know cloud security and path security and adding standardized
    authorization authentication recusas and APIs. Where we want to focus is those three here JAX-RS 2.1,
    JSON-P 1.1 and JSON-B 1.0. So lets get started with JAX-RS 2.1
*/
/*
    If you have a look at the Java API for JSON Processing, it's been updated to version 1.1 mainly to support
    JSON Pointer and JSON Patch. Also it now allows editing and transformation operations to your JSON object model.
    And the API has been updated to work with Java SE8 features such as Lambdas and Streams.
    Also it now allows editing and transformation operations to your JSON object model. And the API has been updated
    to work with Java SE8 features such as Lambdas and Streams. And the new kid on the block is JSON-B. The JSON Binding 1.0 API.
    It's now the new standard way to convert JSON into Java objects and vice versa.
    So we've been having JAXB for a long time to do the same for xml and JSON-B now is the API to do that for JSON.
    So JSON-B leverages JSON-P and provides a conversion layer above it. It provides a default mapping algorithm for
    converting existing Java classes to JSON. Also the mapping is highly customizable through the use of
    Java annotations as usual. And you can plug in different JSON-B runtimes to convert Java objects to and from JSON such as
    Jackson for example. So those are the most relevant Java EE 8 APIs with respect to microservice development
    and in the next video we're getting started with Java EE 8 microservice development

  */



}
