
import jdk.jshell.execution.Util;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    private static int port = 8883;
    private static Socket accept;
    private static ServerSocket socket;
    private static BufferedWriter bw;
    public static void main(String[] args) throws Exception {
        socket = new ServerSocket(port);
        System.out.println("服务器开启，等待连接....");
        while (true){
            accept = socket.accept();
            InputStreamReader r = new InputStreamReader(accept.getInputStream());//字节到字符的转换读取流
            System.out.println("浏览器请求成功!");
            BufferedReader br = new BufferedReader(r);//字符缓冲输入接收到的
            String readLine = br.readLine();
            System.out.println("---------------------");
            //打印请求消息
            System.out.println(readLine);
            String respondingPath = Utils.getResource(lines[1])
            String resource = handleString(readLine);//跳转到handleString
            // 获取位置处理请求头
            String respondingPath = Utils.getResource(resource);
            //获取在配置文件中的路径

            StringBuffer responseMsg = new StringBuffer();
            //发送响应
            responseMsg = response(resource);
            send(responseMsg, socket);
            System.out.println("----------------------");
            //发送响应请求
//            System.out.println(filePath);
//            writeHtml(filePath);

        }

    }
    public static String handleString(String requestHead) {
        String[] res = requestHead.split(" ");
        @SuppressWarnings("unused")
        String method = res[0];// 请求方法
        String resource = "";// 请求资源名
        if (res[1].contains("/")) {
            String[] s = res[1].split("/");

            resource = s[s.length - 1];
			System.out.println(resource);
        }

        return resource;
    }
    public static void send(StringBuffer msg, ServerSocket socket) throws IOException {

        OutputStream os = accept.getOutputStream();
        os.write(msg.toString().getBytes());
        os.close();
    }

    public static StringBuffer response(String resource) throws IOException {
        StringBuffer msg = new StringBuffer();

        if("unKnown".equals(respondingPath))
            {

                test1 a = new test1();
                test1.test1(msg);
            }
        }
        else if(resource.equals("test2")){
            test2 b = new test2();
            test2.test2(msg);

        }
        else{
            err404 c = new err404();
            err404.err404(msg);
        }
        return msg;

    }

}

