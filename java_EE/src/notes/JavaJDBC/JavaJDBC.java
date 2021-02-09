package notes.JavaJDBC;

public class JavaJDBC {

    /**  ----------------------    Java Database Connectivity  ----------------   */

 /*
    JDBC is an API, a set of interfaces and classes that let you easily connect to relational databases,
    such as Oracle, SQL Server, MySQL, and many others. It was originally known as Java Database Connectivity,
    but more recently it's been known by simply the acronym JDBC


    So who uses JDBC? It's most commonly used in web-based applications that are hosted in JEE or Java Enterprise Edition servers.
    These include JBoss, Tomcat, WebSphere, and others. Developers also commonly use JDBC when
    they're working on desktop applications or applets that are working either with local databases stored on the client computer
    or with remote databases accessed over the Internet. Less common uses include JDBC in Android applications. Android has
    its own API for working with local databases, specifically SQLite, and so developers typically don't use JDBC there.
    And when you're working with larger databases making calls from Android applications,
    it's more common to make calls to those databases through web services hosted by middleware servers


    There are other ways of getting to databases without doing direct JDBC programming.
    There are higher-level abstractions that are delivered as part of the large application frameworks.
    For example, the Spring application framework includes something called JDB
    C Template.
    It simplifies the amount of code you have to write, but in the background it's using JDBC to talk to the database.
    There's a similar but perhaps less popular templating library called RIFE, which does basically the same thing.
    And then there are data mapping APIs, the most popular is Hibernate.
    Hibernate is something called an object-relational mapping API.It represents your database structure with Java classes and objects.
    In the background it's still using JDBC to communicate with the database,
    but it simplifies the amount of code you have to write in your own application.
    And there are other mapping libraries, such as iBATIS from Apache, and the Java Persistence API or JPA,
    which is actually a part of the Java EE platform. Again, regardless of whether you use JDBC directly,
    or you use one of these higher-level application frameworks or data mapping APIs in the background, JDBC is at work

 */
}
