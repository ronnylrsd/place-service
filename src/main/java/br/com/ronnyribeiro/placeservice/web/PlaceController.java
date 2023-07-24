package br.com.ronnyribeiro.placeservice.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ronnyribeiro.placeservice.api.PlaceRequest;
import br.com.ronnyribeiro.placeservice.api.PlaceResponse;
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
  public ResponseEntity<Mono<PlaceResponse>> create(@RequestBody PlaceRequest request){
    var placeResponse = placeservice.create(request).map(PlaceMapper::fromPlaceToResponse);
    return ResponseEntity.status(HttpStatus.CREATED).body(placeResponse);
  }
}
