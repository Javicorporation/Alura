package com.screenmatchs.screen.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosSerie(

        //@JsonAlias sirve para leer
        @JsonAlias("Title")String titulo,
        @JsonAlias("totalSeasons") Integer totalTemporadas,
        @JsonAlias("imdbRating") String evaluacion){

        //@JsonProperty sirve para leer y escribir
        //@JsonProperty("") String ) {
}
