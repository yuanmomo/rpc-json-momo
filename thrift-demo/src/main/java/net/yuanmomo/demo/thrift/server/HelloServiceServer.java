package net.yuanmomo.demo.thrift.server;

import net.yuanmomo.demo.thrift.Hello;
import net.yuanmomo.demo.thrift.server.impl.HelloServiceImpl;

import org.apache.thrift.TProcessor;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;

public class HelloServiceServer {
	public static final int SERVER_PORT = 8090;
	
	/** 
     * 启动 Thrift 服务器
     * @param args 
     */ 
    public static void main(String[] args) { 
    	new HelloServiceServer().startServer();
    } 
    public void startServer() {
		try {
			System.out.println("HelloWorld TSimpleServer start ....");

			TProcessor tprocessor = new Hello.Processor<Hello.Iface>(new HelloServiceImpl());
			// HelloWorldService.Processor<HelloWorldService.Iface> tprocessor =
			// new HelloWorldService.Processor<HelloWorldService.Iface>(
			// new HelloWorldImpl());

			// 简单的单线程服务模型，一般用于测试
			TServerSocket serverTransport = new TServerSocket(SERVER_PORT);
			TServer.Args tArgs = new TServer.Args(serverTransport);
			tArgs.processor(tprocessor);
			tArgs.protocolFactory(new TBinaryProtocol.Factory());
			// tArgs.protocolFactory(new TCompactProtocol.Factory());
			// tArgs.protocolFactory(new TJSONProtocol.Factory());
			TServer server = new TSimpleServer(tArgs);
			server.serve();
		} catch (Exception e) {
			System.out.println("Server start error!!!");
			e.printStackTrace();
		}
	}
}
