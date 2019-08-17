package com.wootube.ioi.web.session;

import com.wootube.ioi.domain.model.User;

import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class UserSessionManager extends SessionManagerGenerator {

    public UserSessionManager(HttpServletRequest request) {
        super(request);
    }

    public UserSession getUser() {
        return (UserSession) super.get("user");
    }

    public void setUser(User user) {
        super.set("user", new UserSession(user.getId(), user.getName(), user.getEmail()));
    }

    public void removeUser() {
        super.remove("user");
    }
}