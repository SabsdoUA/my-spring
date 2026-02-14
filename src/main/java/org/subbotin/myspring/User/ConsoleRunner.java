package org.subbotin.myspring.User;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ConsoleRunner implements CommandLineRunner {

    private UserRepository userRepository;

    public ConsoleRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Zadajte svoje meno:");
            String name = scanner.nextLine().trim();

            System.out.print("Koľko máš rokov?:");
            int age = Integer.parseInt(scanner.nextLine().trim());

            userRepository.save(new User(name, age));
        }
    }
}