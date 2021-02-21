package exiled.spittr;

import org.apache.commons.lang3.builder.*;

import java.util.Date;

public class Spittle {
    private final Long id;
    private final String message;
    private Date time;
    private Double latitude;
    private Double longitude;
    private Spitter spitter;

    public Spitter getSpitter() {
        return spitter;
    }

    public void setSpitter(Spitter spitter) {
        this.spitter = spitter;
    }

    public Spittle(String message, Date time) {
        this(message, time, null, null);
    }

    public Spittle(
            String message, Date time, Double longitude, Double latitude
    ) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Spittle(
            Long l, String message, Date time, Double longitude, Double latitude
    ) {
        this.id = l;
        this.message = message;
        this.time = time;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Long getId() {
        return id;
    }

    public String getMessage() {
        return message;
    }

    public Date getTime() {
        return time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that, "id", "time");
    }
}
