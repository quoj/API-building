package com.example.t2305m_springboot.mapper;

import com.example.t2305m_springboot.dto.req.ProductReq;
import com.example.t2305m_springboot.dto.res.ProductRes;
import com.example.t2305m_springboot.entity.Product;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-19T09:46:30+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public Product toEntity(ProductReq productReq) {
        if ( productReq == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productReq.getId() );
        product.setName( productReq.getName() );
        product.setPrice( productReq.getPrice() );
        product.setQty( productReq.getQty() );
        product.setDescription( productReq.getDescription() );
        product.setCategory( productReq.getCategory() );

        return product;
    }

    @Override
    public ProductRes toDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductRes productRes = new ProductRes();

        productRes.setId( product.getId() );
        productRes.setName( product.getName() );
        productRes.setPrice( product.getPrice() );
        productRes.setQty( product.getQty() );
        productRes.setDescription( product.getDescription() );
        productRes.setCategory( product.getCategory() );

        return productRes;
    }
}
