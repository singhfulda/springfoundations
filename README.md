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

15. Bean definition loaded {no real beans loaded, from java, xml, autoconfigure}. 
16. Postprocessor work on entire BeanFactory, modify or transform bean prior to instantiation as PropertySourcesPlaceholderConfigurer. Create own by extending Interface. At end BeanFactory is loaded with references and all beans are configured. System Level work is done.
17. Bean Instiantiation: dependencies first. Beans instiantiated Eagerly by default. Lazy loaded only when no dependency. At end Bean Pointer to each BeanFactory, Objects constructed but not available for use yet.
18  Instiantiation: Setters. Spring modifies with setter elements for each class. Autowiring occurs here other than constructor based which is in phase before.At end Beans fully Intialized, all dependcy added. but still not ready.
19. Bean Post Processing: preinit, intializer, postinit. Initializer here will @PostConstruct will be added here. At end beans instianted and intialized and dependcies adedd and ready to use.
20. Use Phase: ApplicationContext serves proxies to original class and maintains handle to each bean(singleton).
21. Destruction : begins with close @PreDestroy is called. Beans not destroyed and allow it for garbage collector to destroy. context cannot be reused.

Aspect Oriented Programming

22. Aspects: are reusable blocks of code that are injected into application at runtime. See for every or always in requirements or requirements that apply to multiple business requirements(Cross-cutting concerns which can be solved by Aspects). Spring uses AspectJ. Parts: Join Point- is where to execution of a Aspect is targeted. Pointcut- is expression used to locate Join Point. Advice- is code going to run/routine. Aspect is Module which contains all Pointcuts and advices that will be injected at runtime of application.
23. Pointcut: designator("r p.c.m(arg)). Execution Designator-expression for matching and excute advice. Within- matching within certain types. Target- matching specific type. @Annotation- expression for matching a annotation.  
24. Create Aspect Loggable and its Pointcut and applied to CustomerService
