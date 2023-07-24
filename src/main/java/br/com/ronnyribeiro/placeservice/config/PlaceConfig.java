package br.com.ronnyribeiro.placeservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.EnableR2dbcAuditing;

import br.com.ronnyribeiro.placeservice.domain.PlaceRepository;
import br.com.ronnyribeiro.placeservice.domain.PlaceService;

@Configuration
@EnableR2dbcAuditing
public class PlaceConfig {
  
  @Bean
  PlaceService placeService(PlaceRepository placeRepository){
    return new PlaceService(placeRepository);
  }
}
