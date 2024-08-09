package com.trek.enumerations;

public enum TourType {

    //@formatter:off
    SAHYADRI_TREKS_PUNE(1, "Sahyadri Treks Pune"),
    SAHYADRI_TREKS_MUBMBAI(2, "Sahyadri Treks Mumbai"),
    HIMALAYAN_TREKS(3, "Himalayan Treks"),
    KOKAN_SEA_BACKPACKING_TOURS(4, "Kokan Beaches Explore");

    //@formatter:on
    private long id;
    private String value;

    TourType(long id, String value) {
        this.id = id;
        this.value = value;
    }
}
