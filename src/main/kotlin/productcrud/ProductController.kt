package productcrud

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(val service: ProductService) {

    @GetMapping
    fun getAll(): List<Product> {
        return service.getAll()
    }

    @GetMapping("/{productId}")
    fun getById(@PathVariable productId: Long): Product {
        return service.getById(productId)
    }

    @PostMapping
    fun create(@RequestBody product: Product): Product {
        return service.create(product)
    }

    @DeleteMapping("/{productId}")
    fun deleteById(@PathVariable productId: Long) {
        service.deleteById(productId)
    }
}