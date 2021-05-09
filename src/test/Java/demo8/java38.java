package demo8;

public class java38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 计算机网络：由两台或更多计算机组成的网络；
		互联网：连接网络的网络；
		IP地址：计算机的网络接口（通常是网卡）在网络中的唯一标识；
		网关：负责连接多个网络，并在多个网络之间转发数据的计算机，通常是路由器或交换机；
		网络协议：互联网使用TCP/IP协议，它泛指互联网协议簇；
		IP协议：一种分组交换传输协议；
		TCP协议：一种面向连接，可靠传输的协议；
		UDP协议：一种无连接，不可靠传输的协议。
		 */
		
		//一个Socket就是由IP地址和端口号（范围是0～65535）组成，可以把Socket简单理解为IP地址加端口号。端口号总是由操作系统分配，
		//它是一个0～65535之间的数字，
		//其中，小于1024的端口属于特权端口，需要管理员权限，大于1024的端口可以由任意用户的应用程序打开。
		
		//使用Socket进行网络编程时，本质上就是两个进程之间的网络通信。其中一个进程必须充当服务器端，它会主动监听某个指定的端口，
		//另一个进程必须充当客户端，它必须主动连接服务器的IP地址和指定端口，
		//如果连接成功，服务器端和客户端就成功地建立了一个TCP连接，双方后续就可以随时发送和接收数据。
		
		//在Java中使用UDP编程，仍然需要使用Socket，因为应用程序在使用UDP时必须指定网络接口（IP）和端口号。
		//注意：UDP端口和TCP端口虽然都使用0~65535，
		//但他们是两套独立的端口，即一个应用程序用TCP占用了端口1234，不影响另一个应用程序用UDP占用端口1234。
		//和TCP编程相比，UDP编程就简单得多，因为UDP没有创建连接，数据包也是一次收发一个，所以没有流的概念。
		
		//TCP UDP都是基于CS，即客户端->服务端
		//HTTP是BS，即网页（Browser）->服务端
		
		//浏览器和网站服务器之间首先建立TCP连接，且服务器总是使用80端口和加密端口443，然后，浏览器向服务器发送一个HTTP请求，
		//服务器收到后，返回一个HTTP响应，并且在响应中包含了HTML的网页内容，
		//这样，浏览器解析HTML后就可以给用户显示网页了。
		
		//Java提供了HttpClient作为新的HTTP客户端编程接口用于取代老的HttpURLConnection接口；
		//HttpClient使用链式调用并通过内置的BodyPublishers和BodyHandlers来更方便地处理数据。
		
		//Java的RMI远程调用是指，一个JVM中的代码可以通过网络实现远程调用另一个JVM的某个方法。RMI是Remote Method Invocation的缩写。
		
		//XML常用于配置文件、网络消息传输等。XML使用嵌套结构的数据表示方式，支持格式验证；
		
		
		//JSON只允许使用UTF-8编码，不存在编码问题；
		//JSON只允许使用双引号作为key，特殊字符用\转义，格式简单；
		//浏览器内置JSON支持，如果把数据用JSON发送给浏览器，可以用JavaScript直接处理。
		/*
		 {
	    "id": 1,
	    "name": "Java核心技术",
	    "author": {
	        "firstName": "Abc",
	        "lastName": "Xyz"
	    	},
	    "isbn": "1234567",
	    "tags": ["Java", "Network"]
		}
		 */
	}

}