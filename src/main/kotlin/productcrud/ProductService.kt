package productcrud

import org.springframework.stereotype.Service

@Service
class ProductService(val repository: ProductRepository) {

    fun create(product: Product): Product {
        return repository.save(product)
    }

    fun getById(productId: Long): Product {
        return repository.findById(productId).orElseThrow { CustomException("Product not found!") }
    }

    fun getAll(): List<Product> {
        return repository.findAll()
    }

    fun deleteById(productId: Long) {
        if (repository.existsById(productId)) {
            throw CustomException("Product not found!")
        }
        repository.deleteById(productId)
    }
}