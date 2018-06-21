六月 13, 2018 3:07:34 下午 org.springframework.web.context.support.XmlWebApplicationContext prepareRefresh  
信息: Refreshing WebApplicationContext for namespace 'springMvc-servlet': startup date [Wed Jun 13 15:07:34 CST 2018]; root of context hierarchy  
六月 13, 2018 3:07:34 下午 org.springframework.beans.factory.xml.XmlBeanDefinitionReader loadBeanDefinitions  
信息: Loading XML bean definitions from ServletContext resource [/WEB-INF/springMvc-config.xml]  
六月 13, 2018 3:07:34 下午 org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping registerHandler  
信息: Mapped URL path [/register] onto handler 'userController'  
六月 13, 2018 3:07:34 下午 org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping registerHandler  
信息: Mapped URL path [/register.*] onto handler 'userController'  
六月 13, 2018 3:07:34 下午 org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping registerHandler  
信息: Mapped URL path [/register/] onto handler 'userController'  
六月 13, 2018 3:07:34 下午  org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping registerHandler  
信息: Mapped URL path [/{formName}] onto handler 'userController'  
六月 13, 2018 3:07:34 下午 org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping registerHandler  
信息: Mapped URL path [/{formName}.*] onto handler 'userController'  
六月 13, 2018 3:07:34 下午 org.springframework.web.servlet.mvc.annotation.DefaultAnnotationHandlerMapping registerHandler  
信息: Mapped URL path [/{formName}/] onto handler 'userController'  
六月 13, 2018 3:07:35 下午 org.springframework.web.servlet.DispatcherServlet initServletBean  
信息: FrameworkServlet 'springMvc': initialization completed in 914 ms  
六月 13, 2018 3:07:44 下午 org.springframework.web.servlet.mvc.support.DefaultHandlerExceptionResolver logException  
警告: Handler execution resulted in exception:   org.springframework.validation.BeanPropertyBindingResult: 1 errors  
Field error in object 'user' on field 'birthday': rejected value [22]; codes [typeMismatch.user.birthday,typeMismatch.birthday,typeMismatch.java.sql.Date,typeMismatch]; arguments [org.springframework.context.support.DefaultMessageSourceResolvable: codes [user.birthday,birthday]; arguments []; default message [birthday]]; default message [Failed to convert property value of type 'java.lang.String' to required type 'java.sql.Date' for property 'birthday'; nested exception is java.lang.IllegalStateException: Cannot convert value of type [java.lang.String] to required type [java.sql.Date] for property 'birthday': no matching editors or conversion strategy found]  
