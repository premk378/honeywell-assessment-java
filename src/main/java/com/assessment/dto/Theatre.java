package com.assessment.dto;

import java.util.List;

public class Theatre {
    private String name;
    private Long theatreId;
    private String location;
    private String description;
    private List<String> slots;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getSlots() {
        return slots;
    }

    public void setSlots(List<String> slots) {
        this.slots = slots;
    }

    public Long getTheatreId() {
        return theatreId;
    }

    public void setTheatreId(Long theatreId) {
        this.theatreId = theatreId;
    }

    public Theatre(String name, Long theatreId, String location, String description, List<String> slots) {
        this.name = name;
        this.theatreId = theatreId;
        this.location = location;
        this.description = description;
        this.slots = slots;
    }
}
