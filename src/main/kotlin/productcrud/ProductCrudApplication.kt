package productcrud

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProductCrudApplication

fun main(args: Array<String>) {
    runApplication<ProductCrudApplication>(*args)
}
