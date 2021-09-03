import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TServer.Args;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TSSLTransportFactory;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TServerTransport;
import org.apache.thrift.transport.TSSLTransportFactory.TSSLTransportParameters;

import calculator.*;

public class Server{

	public static void main(String args []){

		try{
			TServerTransport transport = new TServerSocket(28192);
			CalculatorHandler handler =  new CalculatorHandler();
			Calculate.Processor processor = new Calculate.Processor(handler);
			TServer server = new TSimpleServer(new Args(transport).processor(processor));

			System.out.println("server started....");
			server.serve();
		}
		catch(Exception e){
			e.printStackTrace();
		}

	}

}