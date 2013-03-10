package sample.junit.rules;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.bio.SocketConnector;
import org.eclipse.jetty.webapp.WebAppContext;
import org.junit.rules.ExternalResource;

/**
 * Jetty アプリケーションを起動・停止する Rule。
 */
public class JettyApplicationServer extends ExternalResource {

    private Server server;

    /**
     * テスト実行前に Jetty を起動する
     */
    @Override
    protected void before() throws Exception {
        server = new Server();

        SocketConnector connector = new SocketConnector();
        connector.setMaxIdleTime(1000 * 60 * 60);
        connector.setSoLingerTime(-1);
        connector.setPort(18080);
        server.setConnectors(new Connector[] { connector });

        WebAppContext context = new WebAppContext();
        context.setServer(server);
        context.setContextPath("/gradle-sample");
        context.setResourceBase("src/main/webapp");
        context.setClassLoader(getClass().getClassLoader());
        server.setHandler(context);

        // build した war を使いたければ↓でもOK!
        // context.setWar("build/libs/gradle-sample-1.0.war");

        server.start();
        System.out.println("server started.");
        // System.in.read();
    }

    /**
     * テストが終わったら Jetty を停止する
     */
    @Override
    protected void after() {
        try {
            server.stop();
            server.join();
            System.out.print("server stopped.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
