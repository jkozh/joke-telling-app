package com.example.julia.myapplication.backend;

import com.example.JokesFactory;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.julia.example.com",
                ownerName = "backend.myapplication.julia.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getRandomJoke")
    public MyBean getRandomJoke() {
        MyBean response = new MyBean();
        response.setData(JokesFactory.getRandomJoke());

        return response;
    }

}
