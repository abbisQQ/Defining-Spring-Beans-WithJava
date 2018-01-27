# Defining-Spring-Beans-WithJava
So far you have seen how we configure Spring beans using XML configuration file. If you are comfortable with XML configuration, then it is really not required to learn how to proceed with Java-based configuration as you are going to achieve the same result using either of the configurations available.

Java-based configuration option enables you to write most of your Spring configuration without XML but with the help of few Java-based annotations explained in this chapter.

@Configuration & @Bean Annotations
Annotating a class with the @Configuration indicates that the class can be used by the Spring IoC container as a source of bean definitions. The @Bean annotation tells Spring that a method annotated with @Bean will return an object that should be registered as a bean in the Spring application context. 
