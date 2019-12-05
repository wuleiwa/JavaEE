public class err404 {
    public static void err404(StringBuffer msg) {
        msg.append("HTTP/1.1 200 OK\n\r");
        msg.append("Content-Type:text/html\n\n");
        String data = "";
        data = "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<head>\r\n" + "<meta charset=\"UTF-8\">\r\n" +
                "<title>JAVA WEB</title>\r\n" +
                "</head>\r\n" + "<body>\r\n" +
                "Error:Don't found your page 404\r\n" +
                " <button >完成</button>\n" +
                "</body>\r\n"
                + "</html>";
        msg.append(data);
    }
}
