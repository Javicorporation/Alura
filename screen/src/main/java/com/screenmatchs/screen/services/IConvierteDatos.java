package com.screenmatchs.screen.services;

public interface IConvierteDatos {

    <T> T obtenerDatos(String object, Class<T> clase);
}
