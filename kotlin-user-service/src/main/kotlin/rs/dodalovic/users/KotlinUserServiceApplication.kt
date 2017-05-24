package rs.dodalovic.users

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinUserServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinUserServiceApplication::class.java, *args)
}
