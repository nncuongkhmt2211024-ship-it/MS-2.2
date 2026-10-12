package cuong.com.bai_1.controller;

import cuong.com.bai_1.dto.ProductResponseDTO;
import cuong.com.bai_1.entity.ProductEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @GetMapping("/{id}")
    public ProductResponseDTO getProductInfo(@PathVariable Long id) {
        // Giả lập Entity lấy lên từ Database chứa thông tin nhạy cảm
        ProductEntity entity = new ProductEntity(id, "Laptop Dell XPS", "DELL-XPS-15", 15000.0, 25000.0, 100);

        // Map sang DTO chỉ với 1 dòng code nhờ hàm tĩnh đã viết sẵn
        return ProductResponseDTO.fromEntity(entity);
    }
}