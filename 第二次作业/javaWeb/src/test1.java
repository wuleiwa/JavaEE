public class test1 {


    public static void test1(StringBuffer msg) {
        msg.append("HTTP/1.1 200 OK\n\r");
        msg.append("Content-Type:text/html\n\n");
        String data = "";
        data = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n" +
                "<title>JAVA WEB</title>\r\n" +
                "</head>\r\n" + "<body>\r\n" +
                "	JAVA第二次作业\r\n" +
                " <button >完成</button>\n" +
                "</body>\r\n"
                + "</html>";
        msg.append(data);
        System.out.println("ok");
    }
}
