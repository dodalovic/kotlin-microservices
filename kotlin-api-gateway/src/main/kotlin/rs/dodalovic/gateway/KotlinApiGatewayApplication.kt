package rs.dodalovic.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
class KotlinApiGatewayApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinApiGatewayApplication::class.java, *args)
}
