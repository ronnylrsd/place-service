package br.com.ronnyribeiro.placeservice.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ronnyribeiro.placeservice.domain.Place;
import br.com.ronnyribeiro.placeservice.domain.PlaceService;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/places")
public class PlaceController {
  private PlaceService placeservice;

  public PlaceController(PlaceService placeservice) {
    this.placeservice = placeservice;
  }

  @PostMapping
  public ResponseEntity<Mono<Place>> create(Place place){
    var createdPlace = placeservice.create(place);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdPlace);
  }
}
