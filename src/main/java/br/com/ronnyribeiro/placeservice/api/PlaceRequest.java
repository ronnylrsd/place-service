package br.com.ronnyribeiro.placeservice.api;

public record PlaceRequest(
    String name, String state) {
}