package notes.ApacheServer;

public class ApacheMySqlPHPIntro {

/**
    how these software products work together to support a web application.
    Web applications are sometimes known as Multi-tier Applications. That's because they're built with multiple software products
    or tiers. There are four major tiers in a web applications.*//*
    1). The Client Tier(Presentation layer) ---> Web Browser,
    2). The Web Tier    ---> HTTP Server((Apache, Microsoft Internet Information Services (IIS)),
    3). The Business Tier (Application tier, Business Logic, Logic tier, Middle Tier) ---> Application Server(PHP. ASP.NET, Java EE)
    4). The Data Tier ---> Database Server(Oracle, SQL Server, MySQL).*//**

    --- The Client Tier---

    The client tier is a web browser. The browser software is installed on the users computer,
    whether that's a desktop or a laptop computer or a mobile device, such as a smart-phone or a tablet.
    The job of the browser is to send requests to the server and then receive and render HTML, images,
    cascading style sheets and other web assets. All modern web browsers can also execute client side code,
    such as HTML markup and Java script and in many cases, they can run plugins, such as Flash Player, Silverlight or Java.

    *//**--- Server Stack*//*[Web Tire, Business Tier, Data Tier] ---*//**

    All of the other tiers of the web application are in the server environment and taken together
    they're known as the Server Stack. There are three server tiers that work together.
    *//*The Web Tier is the HTTP server(Apache, Microsoft Internet Information Services (IIS)*//**.
    It receives requests from the client and returns responses.*/  /*The HTTP server dispatches requests to the Business Tier,
    also known sometimes as an Application Server(PHP. ASP.NET, Java EE).*//**
    And the Application Server interacts with the */ /* the Data Tier or the Database Server(Oracle, SQL Server, MySQL).*//**

    --- Apache, MySQL and PHP, known sometimes as AMP ---*/
 /* In the world of Apache, MySQL and PHP, known sometimes as AMP, these roles are filled by Apache in the web tier,
    PHP in the business tier and MySQL in the data tier.*//**

    Here's how the four components work together.*/
/*  An internet request is made by the browser. It's received by the HTTP server, which then dispatches the request to PHP.
    If data is needed to satisfy the request, PHP communicates with the database server, which in the AMP environment is typically
    MySQL. The database then returns data to PHP, which forms an HTML response and sends that back to Apache,
    which sends that back to the browser.*//**

    In a multi-tier environment, most of these components don't know about each others existence.
    The browser, for example, doesn't know about PHP. It only knows that it's made a request for HTML content and
    that's what it receives. And Apache doesn't know about the database server. So, if you need to replace the database
    server with another component, such as SQL server or Oracle, only one other component needs to be affected.

    In a production environment, the database server is frequently installed on a separate server than the system
    that hosts Apache and PHP. But when you're developing locally, all of these components,
    typically are installed on your own machine and that's what this course will focus on.
    Local installations of various components of the AMP software stack.


     *//*-- phpMyAdmin --*//**
     phpMyAdmin is a free web application that provides a convenient GUI for working with the MySQL database management system.
     It is the most popular MySQL administration tool


    What is WAMP (Beginners Friendly Guide)

    WAMP is an acronym that stands for Windows, Apache, MySQL, and PHP. It’s a software stack which means installing
    WAMP installs Apache, MySQL, and PHP on your operating system (Windows in the case of WAMP).
    Even though you can install them separately, they are usually bundled up, and for a good reason too.

    What’s good to know is that WAMP derives from LAMP (the L stands for Linux).
    The only difference between these two is that WAMP is used for Windows, while LAMP – for Linux based operating systems.*/

/*   Let’s quickly go over what each letter represents:

        1). “W” stands for Windows, there’s also LAMP (for Linux) and MAMP (for Mac).

        2). “A” stands for Apache. Apache is the server software that is responsible for serving web pages.
            When you request a page to be seen by you, Apache grants your request over HTTP and shows you the site.

        3). “M” stands for MySQL. MySQL’s job is to be the database management system for your server.
            It stores all of the relevant information like your site’s content, user profiles, etc.

        4). “P” stands for PHP. It’s the programming language that was used to write WordPress.
            It acts like glue for this whole software stack. PHP is running in conjunction with Apache and communicating with MySQL.*/

/**    Instead of installing and testing WordPress on your hosting account, you can do it on your personal computer (localhost).

    WAMP acts like a virtual server on your computer. It allows you to test all WordPress features without any consequences since
    it’s localized on your machine and is not connected to the web.

 */
}
