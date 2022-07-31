package com.demo.junitmockitodemospringboot.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;

public class RequestFilter implements Filter {


    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        String path = req.getRequestURI();
        writeToLog(path);
        filterChain.doFilter(servletRequest, servletResponse);
    }

    public void writeToLog(String data)  {

        String time = String.valueOf(new Timestamp(System.currentTimeMillis()));
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Log", true));
            writer.append("\n");
            writer.append(time + " :::: " + data);
            writer.close();
        }catch(IOException ex){
            System.out.println("Exception caught::: "+ex.getMessage());
        }
    }
}
