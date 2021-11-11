package com.example.app;

import com.example.app.jooq.model.tables.Game;
import org.jooq.DSLContext;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication(exclude = R2dbcAutoConfiguration.class)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ApplicationRunner runner(DSLContext create) {
        return args -> {
            Game table = Game.GAME;
            create
                    .insertInto(table)
                    .set(table.ID, UUID.randomUUID())
                    .set(table.TITLE, "Warcraft 3")
                    .execute();
        };
    }
}
