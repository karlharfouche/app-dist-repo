package com.example.ejb;
import javax.ejb.*;

@Local
public interface HelloWorld {
    public String sayHello();
}
