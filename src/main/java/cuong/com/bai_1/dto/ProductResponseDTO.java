package cuong.com.bai_1.dto;

import cuong.com.bai_1.entity.ProductEntity;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponseDTO {
    private Long id;
    private String name;
    private Double sellPrice;

    // Hàm tiện ích hỗ trợ chuyển đổi trực tiếp từ Entity sang DTO
    public static ProductResponseDTO fromEntity(ProductEntity entity) {
        return ProductResponseDTO.builder()
                .id(entity.getId())
                .name(entity.getName())
                .sellPrice(entity.getSellPrice())
                .build();
    }
}