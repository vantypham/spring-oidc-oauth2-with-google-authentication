package com.van.oidcdemo;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.net.http.HttpRequest;
import java.util.Collections;
import java.util.Map;

@RestController
public class UserController {

    @GetMapping("/user/profile")
    public Map<String, Object> getUserProfile(HttpServletRequest request, @AuthenticationPrincipal OidcUser principal) {
        request.getUserPrincipal();
        return Collections.singletonMap("profile", principal.getClaims());
    }
}
