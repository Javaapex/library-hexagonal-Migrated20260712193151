package io.wkrzywiec.hexagonal.library.infrastructure;

import io.wkrzywiec.hexagonal.library.domain.inventory.core.InventoryFacade;
import io.wkrzywiec.hexagonal.library.domain.inventory.core.ports.incoming.AddNewBook;
import io.wkrzywiec.hexagonal.library.domain.inventory.infrastructure.BookRepository;
import io.wkrzywiec.hexagonal.library.domain.inventory.infrastructure.GoogleBooksAdapter;
import io.wkrzywiec.hexagonal.library.domain.inventory.infrastructure.InventoryDatabaseAdapter;
import io.wkrzywiec.hexagonal.library.domain.inventory.infrastructure.SpringInventoryEventPublisherAdapter;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class InventoryDomainConfig {

    @Bean
    SpringInventoryEventPublisherAdapter springInventoryEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        return new SpringInventoryEventPublisherAdapter(applicationEventPublisher);
    }

    @Bean
    AddNewBook addNewBook(BookRepository repository, RestTemplate restTemplate, ApplicationEventPublisher applicationEventPublisher){
        return new InventoryFacade(
                new InventoryDatabaseAdapter(repository),
                new GoogleBooksAdapter(restTemplate),
                springInventoryEventPublisher(applicationEventPublisher));
    }
}
