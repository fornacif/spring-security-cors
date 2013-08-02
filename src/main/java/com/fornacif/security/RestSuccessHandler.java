package com.fornacif.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;

public class RestSuccessHandler implements AuthenticationSuccessHandler, LogoutSuccessHandler {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(RestAuthenticationFailureHandler.class);

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
            throws IOException, ServletException {
        LOGGER.info("Logout success {}", authentication.getName());
        response.setStatus(HttpServletResponse.SC_OK);
    }

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException,
            ServletException {
        LOGGER.info("Authentication success {}", authentication.getName());
        response.setStatus(HttpServletResponse.SC_OK);
    }

}
