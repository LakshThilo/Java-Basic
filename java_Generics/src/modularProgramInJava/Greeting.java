package modularProgramInJava;

public class Greeting {

    /**
     * In Java 9, a new module system was introduced. Modularity makes
     * it easier to write well encapsulated code by breaking up large code bases into small sections.
     * So why was a module system introduced? This can be answered by looking at the JDK itself.
     * Before Java 9, the JDK was one huge monolithic structure.Even if you only wanted to write a small application,
     * you still had to have the whole huge JDK on your machine.That was even if you weren't using a lot of it.
     * Another problem was that old unused code or old code with a security vulnerabilities was very difficult to remove.
     * Removing it would lead to backwards compatibility problems.The solution to this problem was to introduce modules.
     * This meant that the JDK could be broken up into small sections.Old legacy code could be removed and so could codes that isn't used often.
     * Anything extra can be added in if needed.If there is a need to make use of lots of the available modules,
     * these can easily be imported into the application.So the module system has been used to break up the JDK itself.
     * But it can also be used for creating Java applications.Existing Java applications can be made modular too.
     * Java is often used for building large applications.And huge code bases are not unusual. Structuring large applications can be very difficult.
     * But modularity is a useful tool for reducing their complexity. So what is a module? A module is a group of related code.
     * So it contains some code and it might contain some other resources too. It also has to have a name.
     * Like packages in Java, module names live in the global namespace and they need to be unique.
     * That means that every single Java module in existence should have a different name. With packages,
     * this is often achieved by using a company domain name, for example, com.mycompany.mypackage.
     * A similar thing can be done with modules. For example, you can call it, com.mycompany.mymodule.
     * A module also contains some information about the module itself. By default, everything in a module is hidden to the outside world.
     * Even if a class is public, it's actually not accessible outside of the module. But each module has a module descriptor.
     * This can be used to specify if code in the module should be accessible to other modules.
     * The descriptor can also be used to state if code from other modules is going to be used.
     * This is a useful way to make sure code is encapsulated. Only the code that is needed can be made visible to the outside world.
     * And it makes structuring large code bases much more manageable.
     */


}
