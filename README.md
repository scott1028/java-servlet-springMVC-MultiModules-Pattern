# How to Start

    mvn clean install
    mvn test tomcat7:run

# Add Servlet Scan Component
    
    in myweb-servlet.xml.xml
    <context:component-scan base-package="my.groupid.home" />
    <context:component-scan base-package="my.groupid.home2" />
    <context:component-scan base-package="my.groupid.home3" />
        ...

# web.xml

    <?xml version="1.0" encoding="UTF-8"?>
    <web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"
        version="3.0">
        <!-- Map all errors to Spring MVC handler method. See CustomErrorController.generalError() -->
        <error-page>
            <location>/generalError</location>
        </error-page>

        <!-- 宣告 servlet Configure, 將自動尋找 $name-servlet.xml 檔案 -->
        <servlet>
            <servlet-name>myweb</servlet-name>
            <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
            <load-on-startup>1</load-on-startup>
        </servlet>

        <!-- 定義 servlet 所使用的 URI -->
        <servlet-mapping>
            <servlet-name>myweb</servlet-name>
            <url-pattern>/</url-pattern>
        </servlet-mapping>
    </web-app>

# myweb-servlet.xml
    
    <beans xmlns="http://www.springframework.org/schema/beans"
        xmlns:context="http://www.springframework.org/schema/context"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:p="http://www.springframework.org/schema/p"
        xmlns:tx="http://www.springframework.org/schema/tx"
        xsi:schemaLocation="
             http://www.springframework.org/schema/beans
             http://www.springframework.org/schema/beans/spring-beans-4.0.xsd
             http://www.springframework.org/schema/context
             http://www.springframework.org/schema/context/spring-context-4.0.xsd
             http://www.springframework.org/schema/tx
             http://www.springframework.org/schema/tx/spring-tx-4.0.xsd
             http://www.springframework.org/schema/aop
             http://www.springframework.org/schema/aop/spring-aop-4.0.xsd">
     
        <context:component-scan base-package="my.groupid.home" />
     
    <!-- Configuration defining views files -->
     
    </beans>
