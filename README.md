# springfoundations
**Spring Framework foundations Learn Path and comments for every commit**

Overview 

1. Adding Spring Dependencies and running Hello World by adding a Bean with just @Bean annotation and Adding Application Context from Spring framework. Futhermore use of @Configuration as Spring will look for this and ask for a class annotated with @configuration for its context.
2. Multiple Beans Injection and Configuration. In order to be flexible and using IOC spring gives us.
3. Encapsulate configurations. In order to secure configurations, consumers not to recreate configurations or application context one can encapsulate configurations.
4. get local Environment varaibles. these are passed to spring on startup. Spring has cascading precedence of environment variables as those on run time environment have higher priority than those are in properties files. Just try adding same property in environment variables in run configuration on IDE and see the change. Database Credentials can be added from runtime .env file on host.
5. Spring Profiles. Alternate Configuration based on envrionment variables. Change in IDE environment variables to see which profile is working.
6. Spring expression Language : creating object with SpEL
7. Bean Scopes Singletons {default, single instance} , Prototype {new instance every time it is referenced}, Session {one instance of bean per session}, Request {on instance per request} 
8. Proxies are aspects. Every Class gets one proxy after spring 4.0. behaviour applied to messaging classes only apply to public methods . Subclasses and private methods not.

Annotation Based Configuration

9. Dependency Injection with Component Scanning using @ComponentScan. Provide basepackages in order to scan for components and add annotations to components like service, Repository
10. Autowiring Beans: Field level private attributes can be autowired, Setter Injection is another possibiility but used for optional dependencies or changing dependencies.Immutable Dependencies could be done by Constructor Injection or required Dependencies too.
11. Lifecycle Methods: Using JSR-250 @PostConstruct - same as IntializingBean Interface, after the properties are set on all beans, the method is called. @PreDestroy  same as DispposableBean Interface is executed when ApplicationContext closes.

XML Based Configuration 

12. overview 2 parts 1. elements used for beans, xml attributes for detaiils of bean. 2. XMl namespaces for simplicity.
13. create application context from xml by adding all components and with help ClassPathXmlApplicationContext.
14. XML Schema Namespaces reduces needs to configure manually. Util Namespace{Collections, Constants, properties} and JEE Namespace {JNDI, EJB} and JDBC for database connections, JMS for communication or TX for Transactions, AOP for aspects.


Bean Lifecycle
