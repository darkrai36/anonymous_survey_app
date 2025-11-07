package main.java.com.myapp.survey.domain;

import java.time.ZonedDateTime;

public class Survey {
    private Long id;
    private String title;
    private String description;
    private boolean isActive;
    private ZonedDateTime createdAt;
    private ZonedDateTime updatedAt;

    public Survey(Long id, String title, String description, boolean isActive, ZonedDateTime createdAt, ZonedDateTime updatedAt) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return isActive;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
