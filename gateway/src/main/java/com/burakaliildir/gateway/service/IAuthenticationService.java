package com.burakaliildir.gateway.service;

import com.burakaliildir.gateway.model.User;

public interface IAuthenticationService {
    String signInAndReturnJWT(User request);
}
