package com.lak.qaNotes;

public class SoftwareTester {


//                ============================ Introduction =======================

//      what is Quality Assurance(QA) -->
/**  *          The role of QA exists to prevent problems in an application so that users don't encounter bugs and crashes.

                Quality Assurance referred to simply as QA,
                                     -->  is a systematic process used to determine whether a product meets specifications.*/

/*                An individual in this role can have many titles including
                                                             1.  QA,
                                                             2.  QA engineer or QA analyst,
                                                             3.  Software engineer in test, or Tester.

                An individual in the QA role constantly questions parts of the software development process to ensure
                the team is building the right product and building it correctly. A QA's primary goal should be to help
                their team move quickly with confidence. They establish and maintain standards for how to best test
                a software product.*/


 //      How to ensure quality --->
/*                          1. Clear specifications
                            2. Code implemented
                            3. Code Tested
                            4. Code Released

              * Good quality results in a software product that is built correctly, as specified, and works reliably.
                Quality can be ensured across the code and influenced by process. It can be measured in various ways.
                Perhaps by customer happiness, annual revenue, or how well the application functions over time.
                Every quality software product has a team behind it that's responsible for its success.

             * The team is composed of multiple roles. It is up to all of them to work together to produce high-quality software.
               It starts by having clear specifications. Then the specifications can be implemented in code, and the code is tested
               thoroughly to ensure the application works as intended. After the code is released, users will start to use
               the application and provide feedback. */



//     ================================== ~~ Roles and responsibilities ~~ ==============================  >


/*              QA roles and responsibilities depends on team and what needs to get done.
                It helps to have skills cross functionally, and apply certain skills when needed.

                These skills should include technical
                                    -- aptitude,
                                    -- business knowledge,
                                    -- DevOps principles,
                                    -- and process and release expertise.
                Technical aptitude is needed for both manual and automated testing. While most QAs focus on higher level automated testing,
                this can also include lower level testing like unit and integration */

/**                Technical Aptitude -->
                           * Manual testing
                           * Automation testing
                           * Programming
                           * Scripting

                Business knowledge is necessary for activities including feature scoping, test planning, test case management and bug management.
                This requires having an understanding of how the product functions and what's important to the business

                    Business Knowledge ->
                           * Feature scoping
                           * Test Planning
                           * Test case management
                           * Bug Management

                Here a QA can wear different hats such as
                                    1. business analyst,
                                    2. data analyst,
                                    3. product owner or product manager.

                The DevOps principles needed will include being able to
                                    * configure tooling,
                                    * set up continuous integration(CI),
                                    * set up test environments
                                    * and automate processes like running tests, or deploying the application. */
/*
                Here a QA wears the hat of an infrastructure or platform engineer. Process and release expertise includes defining
                and improving practices for testing throughout development, as well as a process for releasing new version of the software.
* */

/**
            The Software Development Life Cycle, referred to as the SDLC, is process tha produce high quality software in a shortest amount of time. */

/*          The SDLC includes detailed steps for how to effectively develop, change, and maintain a software system,
            and is typically broken down into six parts: --->
                                                          * 1. Plan
                                                          * 2. Define
                                                          * 3. Design
                                                          * 4. Build
                                                          * 5. Test
                                                          * 6. Deploy

            The steps are linear and, do go in a sequential order, but what's more important to understand is
            that it's a cycle that each feature should iterate through. Traditionally, a QA has only gotten involved
            during the testing phase,but it's proven really useful for a tester to get involved as early and as often
            as they can to ensure quality throughout the entire development process. */

/**            In the Plan phase--> */
/*              *  can help to identify the risk
                *  Identify use cases of the feature. */

/**            In the Define phase-->  */
/*              *  QA can help write specifications or acceptance criteria
                *  and help decide whats in scope and what out of scope
                *  At this phase QA can also begin to write a test strategy and test scenarios
                *  And also here the team can define when the product will be released and what metrics can be used to measure success. */

/**            In the Design and Build phases,-->   */
/*              *   a QA can solidify test scenarios and
                *   get feedback on them from the team.
                *   They can begin to manually test the scenarios defined and script automated test as well */

/**            In the Test phase, --> */
/*              *   manual and automated tests are completed.
                *   This usually happens with the help and collaboration of developers.
                *   A QA can also work with a business team member to determine if the functionality will be accepted into the release. */

/**            When it's time to do the Deploy of the product, ---> */
/*              *   a QA is usually involved in the release process(Validate functionality)
                *   and helps to validate the release build.(Release)
                *   After the release, a QA will verify the functionality in production is still working as expected.(Test in productions) */

/*            Ones the SDLC is complete for on feature or one development sprint, the same cycle start all over again in another iteration.
 * */

/**         The team works together throughout the SDLC to deliver a quality product.
            This is how roles get involved in different phases
                -- Plan (QA, biz, dev, design)
                -- Define (QA, biz, dev, design)
                -- Design (QA, biz, dev, design)
                -- Build (dev, QA, design)
                -- Test (dev, QA, design)
                -- Deploy (dev, QA, biz)

        **  A Business Team member can also work with QA to provide sign off on stories and get feedback about test scenarios and what to automate.
        **  When working with design, a QA provides feedback on mocks, prototypes, or the product itself after it has been deployed.
        **  Developers and QAs pair together to write test and validate functionality.*/




                        //  =======================   Test Planning  ================================

//      ~~~ Create a Test Strategy ~~~~>

/*          - QA engineer will create a test strategy, which describes how a product will be tested. A test strategy is useful so that anyone can read and understand the scope of testing clearly.
            - It's  a documentation.
            - Test strategy means “How you are going to test the application?” You need to mention the exact process/strategy that you are going to follow when you will get the application for testing.*/

/**            *** First up is the Introduction. --> */
/*                                      - The introduction is a high-level summary of the project.
                                        - An example introduction can be, this strategy outlines what quality provides to the project,
                                          what type of testing is done, and how testing is carried out.
                                        - The aim is to ensure quality in all phases of the development lifecycle to deliver a great experience for our users. */

/**            *** Next up are References. --->  */
/*                                  - This will include any relevant links for their project,
                                       including their project's repository and tools used in the tech stack. */

/**            *** Next up is QA deliverable. --->   */
/*                                  This is what a QA engineer will provide to the team.
                                    The first deliverable is this Quality Strategy,
                                                                    --> the high-level guide of how quality will be maintained on our project.

                                    Next there are Test Plans for each Feature which lists test scenarios.
                                                                    --> Then there are issues reported. Examples of issues reported include bugs, enhancements, and usability improvements.

                                    Another deliverable is a Release Process Document.
                                                                    --> This describes the steps to do a release to production */

/**          *** Moving along in the test strategy, there is the Test Management section*/
/*                                    --> to describe what resources are needed to carry out testing.

                     * First up is Tooling.
                                  --> An example of tooling is, Jenkins is used to build test versions of the application and virtual machines are used to test the application in Windows.

                    * Then there are Test Environments
                                  --> which describe what environments are needed for exploratory and manual testing.
                                  --> An example of test environments is that manual testing will be done in environments created on-demand.
                                  --> Automation testing is run against a dedicated machine and across Mac and Windows using Chrome.

                    * Then, there are Supported Platforms and Versions.
                                   --> For example, Mac and Windows are the supported platforms and each major browser is tested against them

                    * Lastly in this section is Test Data.
                                   --> A simple example of test data that will be needed is test accounts to access the application.
                                      Here it can be helpful to create a table of accounts so that they can be referenced later when testing.*/


/**            *** Scope of Testing  --->   */
/*                       This describes what types of tests exist for this project.
                            --> Examples of test include
                               *  unit,
                               *  integration,
                               *  functional,
                               *  regression, and so on.
                        For each test type use, specify how many there are or how much of the code they cover. Also identify which tools are used to write each type and who owns them.*/


//          ~~~ Make a test plan ~~~>

/**                The test planning document is a combination of strategy plugged with an overall project plan.
                   According to IEEE Standard 829-2008, the Strategy plan is a sub-item of a test plan.
                        (these are table rows)
                        --> First there is the SCENARIO,
                                                    --> which explains the steps or action that will be executed.

                        --> Then there is the EXPECTED RESULT ,
                                                    --> which describes what the outcome will be for a given action.

                        --> Next there is the LATEST RESULT,
                                                    --> which will either pass or fail

                        --> and last, there is a field for whether or not the scenario will be AUTOMATED.
                                                    --> This will either be true or false

                        --> There is one unique scenario per row. */


/*              Let's go through an example now. Say I'm working on a new feature for user management.
                This feature provides the ability to add and delete users, or edit a user's profile. If I focus on each of these user management areas,
                I can brainstorm a long list of scenarios. I'll first dive into defining scenarios for adding a user.
                Say I want to click a button to add a new user. Once I click, the expected result will be that the create user modal opens and
                has two required fields for username and email. There is a create user button that becomes enabled once the fields are populated.
                After the feature is implemented, I'll check if this passes or fails based on the expected result. It's likely that each scenario
                will be checked multiple times or by different individuals. So every time the check is done, the latest result can be updated.
                The last part of the scenario is whether it should be automated. Adding a new user sounds like an important feature, and likely
            something we're going to want to know always works. Therefore, this is a good candidate for automation.*/


//          ~~~~~ Test Strategy Vs. Test Plan  ~~~~~
/**
                Every organization has its own standards and processes to maintain these documents.
                Some organizations include strategy details in the test plan itself (here is a good example of this).
                Some organizations list strategy as a subsection in a testing plan but details are separated out in different test strategy documents.

                Project scope and test focus are defined in the test plan. Basically, it deals with test coverage,
                features to be tested, features not to be tested, estimation, scheduling and resource management.

                Whereas the test strategy defines guidelines for test approach to be followed in order to achieve
                the test objectives and execution of test types defined in the testing plan. It deals with test objectives,
                approach, test environment, automation strategy and tools, and risk analysis with a contingency plan.*/


//    ~~~ Write acceptance criteria ~~~>
/**
            In Agile, acceptance criteria refers to a set of predefined requirements that must be met in order to mark a user story complete.
            Acceptance criteria are also sometimes called the “definition of done” because they determine the scope and requirements
            that must be executed by developers to consider the user story finished.

            Acceptance criteria which specify what work is included as part of that particular slice of the feature.
            Acceptance criteria or AC for short are conditions that a software product must satisfy to be accepted by a stakeholder.
            Acceptance criteria clearly define how each feature should look and function in detail.

                    An acceptance criteria allow
                        -- a developer to know what to implement code for,
                        -- a business analyst to know what scope the story covers and
                        -- a QA to know which scenarios to test. */

/*    Acceptance criteria follow a specific format.
                                    ** They always start with a given.
                                                        --> This is a precondition or beginning state
                                    ** Next is the when.
                                                        --> This describes the input or action of the scenario.
                                    ** The final part is the then.
                                                        --> This describes the expected outcome of the scenario.

        Let's look at an example of a user story which will provide the functionality to add an item to a shopping cart.
        One scenario of acceptance criteria might be given I am viewing an item, when I press the Add to Cart button,
        then the item is added to the cart. Other acceptance criteria might define an error scenario.
        Let's take a for example adding an item to a cart that is sold out. Given I am viewing an item that is sold out,
        when I press the Add to Cart button, then the item is not added to the cart. And I see a message that the item is out of stock.
        In this acceptance criteria I also add an and statement to describe an additional expected outcome for this scenario.
        This can be done for any part of the acceptance criteria.*/

//    Acceptance criteria types and structures

/**    AC can be written in different formats. There are two most common ones, and the third option is to devise your own format:

        1. Scenario-Oriented acceptance criteria (Given/When/Then)
            Scenario-oriented format of writing AC is known as the Given/When/Then (GWT) type.
                * Given some precondition
                * When I do some action
                * Then I expect some result

        Each acceptance criteria written in this format has the following statements:*/
/*
                    1. Scenario – the name for the behavior that will be described
                    2. Given – the beginning state of the scenario
                    3. When – specific action that the user makes
                    4. Then – the outcome of the action in “When”
                    5. And – used to continue any of three previous statements */

/* Example 1 --::*/
/**            User story: As a user, I want to be able to recover the password to my account, so that I will be able to access my account in case I forgot the password.*/
/*              - Scenario: Forgot password
                - Given: The user has navigated to the login page
                - When: The user selected forgot password option
                - And: Entered a valid email to receive a link for password recovery
                - Then: The system sent the link to the entered email
                - Given: The user received the link via the email
                - When: The user navigated through the link received in the email
                - Then: The system enables the user to set a new password

     Example 2 --:*/
/**              User story: As a user, I want to be able to request the cash from my account in ATM so that I will be able to receive the money from my account quickly and in different places.*/
/*
        Acceptance criteria 1:
                            Given: that the account is creditworthy
                            And: the card is valid
                            And: the dispenser contains cash
                            When: the customer requests the cash
                            Then: ensure the account is debited
                            And: ensure cash is dispensed
                            And: ensure the card is returned

        Acceptance criteria 2:
                           Given: that the account is overdrawn
                           And: the card is valid
                           When: the customer requests the cash
                           Then: ensure the rejection message is displayed
                           And: ensure cash isn’t dispensed */



/**        2. Rule-oriented acceptance criteria format (checklist)
                In some cases, it’s difficult to fit acceptance criteria into the Given/When/Then structure.For instance, GWT would hardly be useful for the following cases:
                           - You’re working with user stories that describe the system level functionality that needs other methods of quality assurance.
                           - The target audience for acceptance criteria doesn’t need precise details of the test scenarios.
                           - GWT scenarios don’t fit to describing design and user experience constraints of a feature. Developers may miss a number of critical details.

                You can address these cases with the rule-oriented AC format.

                The rule-oriented form entails that there is a set of rules that describe the behavior of a system. Based on these rules, you can draw specific scenarios.

                Usually, criteria composed using this form look like a simple bullet list. Let’s have a look at an example.*/

/*   Example ---::

            User story: As a user, I want to use a search field to type a city, name, or street, so that I could find matching hotel options.

            Basic search interface acceptance criteria ~~
                    - The search field is placed on the top bar
                    - Search starts once the user clicks “Search”
                    - The field contains a placeholder with a grey-colored text: “Where are you going?”
                    - The placeholder disappears once the user starts typing
                    - Search is performed if a user types in a city, hotel name, street, or all combined
                    - Search is in English, French, German, and Ukrainian
                    - The user can’t type more than 200 symbols
                    - The search doesn’t support special symbols (characters). If the user has typed a special symbol, show the warning message: “Search input cannot contain  special symbols.”

*/


// ==============================  Types of Testing QA Focus On  ===================================================================================

//   1.  <-------------------- Box testing -------------------->
/*
        One way to model testing is to think about it in terms of a box. that can be performed so that there is a holistic approach to testing an application. */

/**   1. First, there is black box testing, */
/*                 ----  which means that the box is completely concealed and it is not possible to see inside of it.
                       * Each test scenario here examines the product from the outside.
                       * It allows input to the box and gets output from the box.
                            --> This means that there is no knowledge needed about the internals of the application,
                                such as what the source code is doing or how the system is working.
                       * The focus with black box testing is to perform an action in the user interface and expect a certain result from that action.
                       * Black box tests include manual testing and UI automation testing, both of which will help uncover issues with functionality and usability.
                       * QA engineers are responsible for this level of testing.*/

/**     2. Next up is gray box testing. */
/*                  ----  Here the box is semi-transparent. Test scenarios here examine the interaction between the outside and inside of the box.
                        *   It requires QA engineers to have a deeper understanding of the application.
                        *   Gray box tests include integration testing, which examines how components of the application work together.
                        *   They can trigger some action in the UI and see how the code responds.
                        *   Typically QA engineers and developers are responsible for these level of test.*/


/**    3. And lastly, there is white box testing. */
/*                ---  Here the box is completely transparent and focuses on the internals of the application and what is happening at the code or system level.
                    *   It tests specific functionalities in the code and verifies the result.
                    *   White box testing includes Unit and System testing.
                    *   Developers are responsible for these type of tests and write them alongside development. */


/*      Take for example a shopping cart on an e-commerce web application, items can be added and removed from the shopping cart
        and a total is displayed based on the quantity of items in the cart. For this feature You'll want to think about the type of
        testing that can be done to ensure quality and confidence that the application works as expected. */

/**  ** At the white box level of testing */
/*                --->> I'm starting from inside the box.
                    -->> Examples of test scenarios here that can be executed at this level are that the quantity can be increased
                         and decreased successfully, and the calculation of items is performed correctly.
                         These tests are written by calling functions in the code that can increase, decrease and calculate the total.
                         Different values are provided to the functions and expect an exact result to be returned.*/

/**    ** At the gray box level of testing i'm looking at inside and outside the box */
/*                ---->> I care about the user action happening and the results a server or database returned.
                    -->> I want to know that the box as a whole works well rather than one specific component.
                       * A test at this level I might write would be to add an item to the cart and confirm form the API response
                         that the item was added and the cart price was updated.
                       * Tests here start from the client, which sends a request to the server, and the server responds with details which I can verify.*/

/**    ** For black box testing
                ---->>  in this example I'm focusing on what input I provide to the box and what output I receive.
                    -->> An example of a test here is to add an item to the cart using the UI and see the cart quantity and price update.
                          To write this level of test I manipulate web elements in a browser to click and add items to the cart and navigate to the cart.
                          I can also get the value of web elements and confirm the output is what I expect. and confirm the output is what I expect.*/


//   2.  <------------------- Manual testing ------------------------->
/*
       - Manual testing follows the steps as a user performing workflow in the application.
              - The goal is to uncover any issues in the functionality and usability.
              - Before performing manual testing know what scenarios you want to cover.
              - You will have to understand your customers and identify both their typical and nontypical use cases.
              - Testing at this level is done in the test phase Manual testing is a type of black box testing.

        Let's look at an example for an airline site where customers search and buy flights or check their flight status.
            I will focus specifically on the feature for searching for flights.
            First, I'll take some time to brainstorm scenarios that an user can perform while searching for flights.
            All the scenarios I brainstorm will be added to a test plan for this feature.

            -- I'll think about the Happy Path Scenarios
                    -> which are scenarios that have successful results.
                        - This includes searching for valid one-way flights and round-trip flights and getting a list of flights available.

            -- Then I'll think about Sad Path Scenarios
                    -> which are scenarios that return errors or do not have results.
                        - This includes scenarios such as searching for the same city and destination,
                        - searching for invalid routes,
                        - and searching for routes that do not operate on certain days.

        Then I'll write down scenarios into a test plan spreadsheet specifying the scenario and expected result.
        Here I can even get down to a more granular level for the scenario by specifying the origin airport, destination airport,
        departure date, and return date. I can use this test data to execute the test scenarios.

*/

//   3.  <------------------------  UI Automation Testing  ------------------------------>
/**
   -- UI automation is like manual testing but uses a script to automate test scenarios.*/
/*    - The benefit of UI automation is that scenarios can be executed repeatedly by running a test script.
      - This will help catch regressions and other oddities much quicker than when done manually.
      - Another benefit is that the scripts can be run on any platform or browser, which is great because
      - it will emulate the interactions of users and their platforms and browser combinations.
      - UI automation tests can be started in the Build phase of the SDLC and then completed after the functionality has been developed during the test phase.
      - It is a type of black box testing because it provides input to the UI of an application and expects particular data returned as a result.


    Example test script scenario for search flights and each scenario will be one test->

        test script 1. --> test "search for one-way flight" do
                            end
        test script 2. --> test "search for round-trip flight" do
                            end
        test script 3. --> test "search for same origin and destination" do
                            end

    And in each test I will write code to drive action in my browser by simulating entering flight data including origin, destination and flight date.

        code for test script 1.*/
 /**                            -->  test "search for one-way flight" do
                                        fill_in "Origin", with : "SFO"
                                        fill_in "Destination", with: "LAX"
                                        fill_in "Departure Date", with: "2019-01-10"
                                        click_on "Search flights"
                                     assert_test "10 flights found"
*/

//     4. <------------------------------- Integration testing ------------------------------------>
/*
        - With the surface level of the application tested by manual and UI automation, a QA engineer might want to move on to test the application from another perspective. */
/**          Integration testing focuses on the interaction between components at lower layers of the application. */
/*          This level of testing covers similar scenarios as we've seen with manual and UI automation testing,
            but doesn't look at what's happening at the UI level as a result. Instead, integration tests see how the system reacts to certain actions.
            Integration tests have some knowledge of how the system works internally, and because of that they are a type of gray box testing.
            QAs or developers usually write these tests during the build and test phase.

    Take for example the scenario of searching for a one way flight. */
/**            test "search for one way flight" do
                post "/flights",
                params: {  origin: "SFO",
                          destination: "LAX",
                          depat_date: "2019-01-10"
                       }

                assert_response :  redirect
                assert_select "url", "Flights"
*/
/*
        Here we can send a request to search for a flight providing the flight parameters to the server directly instead of performing the action from the UI.
        We'll then wait for the server to send a response to the request and can confirm that the API returns information we expect,
        such as a successful response status code "200" and some flights returns. */
/**                assert_response :  redirect
                   assert_select "url", "Flights"           */
/*
        This type of integration tests the interaction between the application and the server to confirm that the right information is sent and received.
        If the request returns the wrong status code, or other incorrect flight data, we know that there is a problem with the flight search feature.
        The benefits are it can catch issues with functionality and can be run in a matter of seconds, meaning we can write more integration tests than UI automation.
*/

//     5. <--------------------------  Performance testing  ---------------------------------->
/**
        - Performance testing is done to benchmark how a system performs under load.*/
/*          It will help ensure that an application can scale over time and use. because we test how the system operates under certain stress
            but don't have visibility into what's going on inside the system. While manual, UI automation, and integration testing are the
            most common for software projects, performance testing is also very valuable.
            There are a few different types of performance testing,

                                * - Load Testing checks the application's ability to perform under anticipated user loads.
                                    The objective is to identify the maximum operating capacity of an application by observing when bottlenecks occur. */
/**                                     If I focus on the Search Flights feature, this sends a request to look for flights and returns all results found.
                                        I'll want to set up a test to simulate many users simultaneously searching for flights.
                                        I can use software that generates thousands of different sessions of flight searches.
                                        While the system is under load, I'll want to monitor how long the requests take to complete,
                                        and identify when spikes or points of long load time, start to occur in the application */

/*                              * - There is also Endurance Testing. Endurance testing, sometimes referred to as soak testing, is done to make sure the application
                                    can handle the expected load over a long period of time. */
/**                                     This involves simulating many flight search requests and monitoring the system to see if performance degrades.
                                        The goal of endurance testing is to check for system problems such as memory leaks.
                                        It is similar to load testing but lasts much longer and monitors unusual behavior that can occur in the application or database.*/
/*

                                * - And then there is Stress Testing. Stress testing involves testing an application under extreme workloads, and seeing how it handles data processing.
                                    The objective is to identify the breaking point of an application. I can use software to introduce stress into a system,
                                    which first sends flight search requests to the application.
                                    I can then introduce factors such as
                                        - slow internet,
                                        - internet service interruption,
                                        - or shut services down to see how the application responds in different situations. */

/**                                 The Goal of stress testing is to measure software stability at what time software fail and how does the software recover from the failure */
/*                                  From this you can understand In general, common performance problems include, long load time, poor response time, limited scalability, and bottlenecking in the system.*/


//   <------------------------------  Security testing  --------------------------------------->
/*
            Security testing is performed to reveal flaws or vulnerabilities that can be exposed by users.
            Manual UI automation, an integration test, focus more on functionality and confirming it works as expected. */
/**         Security testing instead looks to expose problems in the application that can either cause it to behave in unexpected ways or stop it from working.
            Potential problems can include
                            - loss of customer data and trust,
                            - decline in revenue,
                            - and website downtime.*/
/*          There are so many different ways to approach security testing because they are so many ways someone could try to hack an application.
*               1. - SQL Injection is one of the most common types of attacks used by hackers to insert SQL database statements into any text field.*/
 /**                   SQL Injections -: Sql injection is used to insert database statement into text fields and expose application information
                                        empl: search=keyword 'and' 1% '='1     */
/*
                            This can expose critical information and allow the system to be manipulated. Thinking about the search flight feature,
                            I could use SQL Injection on different fields in the search flight page and try to inject data that will manipulate flight data.
                            I'll want to test where SQL can be injected I'll validate the values received before passing the query to the database.

                2. - Another common and harmful type of attack Denial of Service or DoS attack */
/**                      Denial of Service (DoS) -: is attack where hackers try to take down an application's server or network */
/*
            This type of attack tries to take down making it inaccessible to users. In terms of flight search, it can be possible to
            use bots to flood the server with traffic, searching for a large number of flights, or try to send information that will crash a server.
            To stop a DoS attack, tools can be used to identify requests that are likely coming from bots and eliminate that traffic.
            It can also be helpful to use backup servers to manage traffic if needed, so that the application stays up.

            3. Vulnerabilities in dependencies can cause massive problems in an application when undetected. Luckily,
                I can use software to scan my code to look for vulnerabilities. GitHub has a feature which will automatically
                scan dependencies in a project and alert when there is a known security vulnerability.
                This makes it quick to spot vulnerabilities and provides an easy way to update the harmful dependencies.
*/




























}
