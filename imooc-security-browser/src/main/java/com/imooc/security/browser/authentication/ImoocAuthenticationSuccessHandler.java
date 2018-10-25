package com.imooc.security.browser.authentication;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class ImoocAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    private Logger logger = LoggerFactory.getLogger(ImoocAuthenticationSuccessHandler.class);

    //对象转json类,springmvc自动为我们提供的类
    private ObjectMapper objectMapper;


    @Override
    public void onAuthenticationSuccess(HttpServletRequest req,
                                        HttpServletResponse rsp,
                                        Authentication authentication) throws IOException, ServletException {
        logger.info("登陆成功");

        rsp.setContentType("application/json;charset=utf-8");
        rsp.getWriter().write(objectMapper.writeValueAsString(authentication));
    }
}
