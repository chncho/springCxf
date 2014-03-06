package testMain;


import java.net.SocketTimeoutException;

import javax.xml.ws.WebServiceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cxf.service.IReaderService;

public class test {
    public static void main(String[] args) {
        System.out.println("Server is starting...");
//        调用WebService
//        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
//        factory.getInInterceptors().add(new LoggingInInterceptor());
//        factory.getOutInterceptors().add(new LoggingOutInterceptor());
//        factory.setAddress("http://172.17.2.104:8081/javaee/webservice/readerService2?wsdl");
//        IReaderService service = (IReaderService) factory.create(IReaderService.class);
        try{
            //加载客户端spring WebService配置
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-client.xml");
        IReaderService client = (IReaderService) ctx.getBean("client");
        System.out.println("返回字符串"+client.getStr());
        System.out.println("返回PO"+client.getReader("ddd", "222").getName());
        System.out.println("返回list"+client.getReaders().size());
//        Assert.assertEquals(10,client.getStr());
        }catch(Exception e){
            if (e instanceof WebServiceException
                    && e.getCause() instanceof SocketTimeoutException) {
                System.err.println("This is timeout exception.");
            } else {
                System.out.println(e.getMessage());
            }

        }
        System.out.println("Server is started...");
    }
}
