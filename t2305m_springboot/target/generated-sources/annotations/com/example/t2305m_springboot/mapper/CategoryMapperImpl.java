package com.example.t2305m_springboot.mapper;

import com.example.t2305m_springboot.dto.req.CategoryReq;
import com.example.t2305m_springboot.dto.res.CategoryRes;
import com.example.t2305m_springboot.entity.Category;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-12T09:46:33+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public Category toEntity(CategoryReq categoryReq) {
        if ( categoryReq == null ) {
            return null;
        }

        Category category = new Category();

        category.setId( categoryReq.getId() );
        category.setName( categoryReq.getName() );

        return category;
    }

    @Override
    public CategoryRes toDTO(Category category) {
        if ( category == null ) {
            return null;
        }

        CategoryRes categoryRes = new CategoryRes();

        categoryRes.setId( category.getId() );
        categoryRes.setName( category.getName() );

        return categoryRes;
    }
}
