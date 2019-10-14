public class test2 {
    public static void test2(StringBuffer msg) {
        msg.append("HTTP/1.1 200 OK\n\r");
        msg.append("Content-type:text/html\n\n");
        String data = "";
        data = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n" +
                "<title>JAVA WEB2</title>\r\n" +
                "</head>\r\n" + "<body>\r\n" +
                "The second page\r\n" +
                "<button>完成</button>\n" +
                "</body>\r\n" +
                "</html>";
        msg.append(data);
    }
}
