package com.example.profiles.profiles;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
@PropertySource(value={"classpath:myproperties.properties"})
public class MyProperties {
    String projectname;
    String version;
    String launch;
    Boolean messagingused;

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getLaunch() {
        return launch;
    }

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public Boolean getMessagingused() {
        return messagingused;
    }

    public void setMessagingused(Boolean messagingused) {
        this.messagingused = messagingused;
    }
}
