package sample;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

/**
 * @author t.endo
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        // ServletContextHandler context = new ServletContextHandler(
        // ServletContextHandler.SESSIONS);
        // context.setContextPath("/");

        WebAppContext context = new WebAppContext();
        context.setServer(server);
        context.setContextPath("/gradle-sample");
        context.setResourceBase("src/main/webapp");
        context.setClassLoader(Main.class.getClassLoader());
        server.setHandler(context);

        System.out.println("server starting...");
        server.start();
        server.join();
    }
}
