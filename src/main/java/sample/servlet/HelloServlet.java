package sample.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

/**
 *
 */
public class HelloServlet extends HttpServlet {

    private static final long serialVersionUID = 6569508331779151501L;

    /**
     * {@inheritDoc}
     */
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String message = IOUtils.toString(
                getClass().getResourceAsStream("/hello.txt")).trim();

        response.setContentType("text/plain");
        try (PrintWriter writer = response.getWriter()) {
            writer.write(message);
            writer.flush();
        }
    }
}
