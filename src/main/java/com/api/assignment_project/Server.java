package com.api.assignment_project;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("servers")
public class Server {
    @Id
    private String id;

    private String name;
    private String language;
    private String framework;

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", language='" + getLanguage() + "'" +
            ", framework='" + getFramework() + "'" +
            "}";
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFramework() {
        return this.framework;
    }

    public void setFramework(String framework) {
        this.framework = framework;
    }
    public Server(String id, String name, String language, String framework) {
        super();
        this.id = id;
        this.name = name;
        this.language = language;
        this.framework = framework;
    }
}
