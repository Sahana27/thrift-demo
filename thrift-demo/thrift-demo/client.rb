$:<< "."
require 'thrift'
require 'calculate'
require 'calculator_constants'
require 'calculator_types'

begin
	transport = Thrift::BufferedTransport.new(Thrift::Socket.new('localhost',28192))
	protocol = Thrift::BinaryProtocol.new(transport)
	client = Calculate::Client.new(protocol)
	transport.open()
	print "#{client.div(2,1)}"
rescue Exception => e
	e.message
end