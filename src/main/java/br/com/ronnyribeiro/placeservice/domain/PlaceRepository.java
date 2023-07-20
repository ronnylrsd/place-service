package br.com.ronnyribeiro.placeservice.domain;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface PlaceRepository extends ReactiveCrudRepository<Place, Long>{
    
}
