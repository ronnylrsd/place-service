package br.com.ronnyribeiro.placeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.ronnyribeiro.placeservice.domain.PlaceRepository;
import br.com.ronnyribeiro.placeservice.domain.PlaceService;

@Configuration
public class PlaceConfig {
  
  @Bean
  PlaceService placeService(PlaceRepository placeRepository){
    return new PlaceService(placeRepository);
  }
}
