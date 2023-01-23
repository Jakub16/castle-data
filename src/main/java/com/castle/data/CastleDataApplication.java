package com.castle.data;

import com.castle.data.repositories.IDataRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CastleDataApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CastleDataApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
