package net.yuanmomo.demo.thrift.client;

import net.yuanmomo.thrift.demo.Hello;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

public class HelloServiceClient { 
/** 
    * 调用 Hello 服务
    * @param args 
    */ 
   public static void main(String[] args) { 
       try { 
           // 设置调用的服务地址为本地，端口为 8090 
           TTransport transport = new TSocket("localhost", 8090); 
           transport.open(); 
           // 设置传输协议为 TBinaryProtocol 
//           TProtocol protocol = new TBinaryProtocol(transport); 
           TProtocol protocol = new TJSONProtocol(transport); 
//           TProtocol protocol = new TSimpleJSONProtocol (transport); 
           Hello.Client client = new Hello.Client(protocol); 
           // 调用服务的 helloVoid 方法
           client.helloString("我的年龄", 20, true);
           
           transport.close(); 
       } catch (TTransportException e) { 
           e.printStackTrace(); 
       } catch (TException e) { 
           e.printStackTrace(); 
       } 
   } 
}