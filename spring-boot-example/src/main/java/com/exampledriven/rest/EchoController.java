package com.exampledriven.rest;

import com.exampledriven.domain.Host;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

@RestController()
public class EchoController {

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public Host getCustomer(HttpServletRequest request) {
        return new Host(request.getLocalAddr(), request.getLocalPort(), getHostName());
    }

    private String getHostName() {
        InetAddress addr;
        try {
            addr = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        }
        return addr.getHostName();
    }

}