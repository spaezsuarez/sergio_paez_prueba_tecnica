package com.puntored.movie_store_api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FilmDto {

    private String title;
    private String description;
    private Integer year;
    private Integer rentalDuration;
    private Double rating;
    private Integer duration;
    private Double rentalPrice;

}
