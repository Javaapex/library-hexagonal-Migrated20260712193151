package io.wkrzywiec.hexagonal.library.infrastructure;

import io.wkrzywiec.hexagonal.library.domain.user.core.UserFacade;
import io.wkrzywiec.hexagonal.library.domain.user.core.ports.incoming.AddNewUser;
import io.wkrzywiec.hexagonal.library.domain.user.core.ports.outgoing.UserDatabase;
import io.wkrzywiec.hexagonal.library.domain.user.infrastructure.UserDatabaseAdapter;
import io.wkrzywiec.hexagonal.library.domain.user.infrastructure.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserDomainConfig {

    @Bean
    public UserDatabase userDatabase(UserRepository userRepository){
        return new UserDatabaseAdapter(userRepository);
    }

    @Bean
    public AddNewUser addNewUser(UserDatabase userDatabase){
        return new UserFacade(userDatabase);
    }
}
