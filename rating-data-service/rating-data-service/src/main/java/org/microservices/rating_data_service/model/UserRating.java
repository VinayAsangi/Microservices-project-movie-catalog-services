package org.microservices.rating_data_service.model;

import java.util.List;

public class UserRating {

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    private List<Rating> userRating;

}
