package back.practise.practise0816.course_network;

import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import sun.plugin2.message.Message;
import sun.rmi.transport.Transport;

import java.util.Properties;
import javax.activation.*;

/**
 * 发送邮件：尚未导入所需Jar包和相关环境变量配置，暂不能正常运行
 */
public class SendEmail {

    public static void main(String[] args) {
        String to="belief168@163.com";
        String from="776303560@qq.com";

        // 指定发送邮件的主机为 localhost
        String host="localhost";
        // 获取系统属性
        Properties properties=System.getProperties();
        // 设置邮件服务器
        properties.setProperty("mail.smtp.host", host);
        // 获取默认session对象
//        Session session = Session.getDefaultInstance(properties);
//        try{
//            // 创建默认的 MimeMessage 对象
//            MimeMessage message = new MimeMessage(session);
//            // Set From: 头部头字段
//            message.setFrom(new InternetAddress(from));
//            // Set To: 头部头字段
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
//            // Set Subject: 头部头字段
//            message.setSubject("This is the Subject Line!");
//            // 设置消息体
//            message.setText("This is actual message");
//            // 发送消息
//            Transport.send(message);
//            System.out.println("Sent message successfully....");
//        }catch (MessagingException mex) {
//            mex.printStackTrace();
//        }

    }
}
