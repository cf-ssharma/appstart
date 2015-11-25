Appstart
========

Appstart is a Java boilerplate template for rapid development of multi-module [Google App Engine][1] applications based on [Google Guice][2], a lightweight dependency injection framework. 
Appstart uses the [App Engine Maven plugin][4], it has a parent pom and 3 maven projects. 2 of the projects (appstart-front and appstart-backend) are App Engine modules. <b>appstart-frontend</b> is configured to use a frontend instance and <b>appstart-backend</b> is configured to use a backend instance. The third project <b>appstart-common</b> is a common code project shared between the <b>appstart-frontend</b> and <b>appstart-backend</b> modules.

Appstart encourages the [Single Page Application (SPA)][13] pattern by providing backend services as APIs that can be invoked from any frontend, be it Web or Mobile. The philosophy of Appstart is to enable you to spend less or no time writing boilerplate code and more time focusing on your business logic.

## Demo ##

A live demo is available [here][16].

## Key Technologies/Libraries

The following key technologies/libraries are used by Appstart. You can either use some or all of these technologies depending on your needs:

### Backend
- <b>[Google Guice][2]</b>: App Engine friendly, lightweight dependency injection framework. 
- <b>[Objectify][6]</b>: Convenient data access API for the App Engine datastore.
- <b>[Cloud Endpoints][3]</b>: App Engine REST/RPC API to simplify clients (Android, iOS, etc..) access.
- <b>[Jersey & Jersey Guice integration][7]</b>: Jersey framework is an implementation of the JAX-RS (JSR 311 & JSR 339) to provide RESTful Web services in Java. 
- <b>[Lombok][8]</b>: A framework for boilerplate code generation such as getter, setter, constructors, equalTo, hashCode, etc... Saving you time to focus on your business logic.
- <b>[Google Guava][9], [Google Gson][11] and [Apache Commons Lang][10]</b>: Useful Java libraries that plays well with App Engine.
- <b>[App Engine Unit Testing Libraries][14] & [jMockit][15]</b>: Creating unit tests using the App Engine local unit testing libraries. Mocking is achieved using the jMockit mocking library
 
### Frontend
- <b>[AngularJS TodoMVC][12]</b>: Frontend page uses the TodoMVC AngularJS as an example. You can integrate your own frontend technology with Appstart.

## Usage:
You need to change the following values with your own:

- App Engine app-id (`<appengine.app.name>appstart-demo</appengine.app.name>`) in appstart/pom.xml 
- For [Google Cloud Endpoints][3] Update the values in (`appstart/appstart-frontend/src/main/java/uk/co/inetria/appstart/Constants.java`) to reflect the respective client IDs you have registered in the [APIs Console][5].

To run or deploy the application:
```bash
    git clone https://github.com/omerio/appstart.git
    cd appstart
    mvn install
    cd appstart-ear
    #to test it locally:
    mvn appengine:devserver
    #or to deploy it:
    mvn appengine:update
```    

## Local URLs:
- Homepage (frontend module): [http://localhost:8888/home](http://localhost:8888/home)
- API Explorer: [http://localhost:8888/_ah/api/explorer](http://localhost:8888/_ah/api/explorer)
- Backend module (port number might be different, check you dev server output): [http://localhost:54423](http://localhost:54423)

## TODO ##
* Create documentations.
* Add sample unit tests that uses the App Engine local unit testing libraries.
* Create Cloud Endpoints frontend code to authenticate a user and refresh the OAuth token once it expires.
* Provide an option on the frontend to use either the JAX-RS REST or Cloud Endpoints
* Create a Maven archetype to easily scaffold projects.


[1]: https://developers.google.com/appengine
[2]: https://github.com/google/guice/wiki/GoogleAppEngine
[3]: https://developers.google.com/appengine/docs/java/endpoints/
[4]: https://developers.google.com/appengine/docs/java/tools/maven
[5]: https://console.developers.google.com/
[6]: https://code.google.com/p/objectify-appengine/
[7]: https://jersey.java.net/
[8]: http://projectlombok.org/
[9]: https://code.google.com/p/guava-libraries/
[10]: http://commons.apache.org/proper/commons-lang/
[11]:https://code.google.com/p/google-gson/
[12]: http://todomvc.com/examples/angularjs/#/
[13]: http://omerio.com/2014/03/23/single-page-apps-a-bleeding-edge-new-concept-or-a-revived-old-one/
[14]: https://cloud.google.com/appengine/docs/java/tools/localunittesting
[15]: http://jmockit.org/
[16]: http://appstart-demo.appspot.com/index.html#/
