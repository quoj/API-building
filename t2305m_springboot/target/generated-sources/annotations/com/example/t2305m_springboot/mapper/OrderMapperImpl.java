package com.example.t2305m_springboot.mapper;

import com.example.t2305m_springboot.dto.req.OrderItemReq;
import com.example.t2305m_springboot.dto.req.OrderReq;
import com.example.t2305m_springboot.dto.res.OrderRes;
import com.example.t2305m_springboot.entity.Order;
import com.example.t2305m_springboot.entity.OrderItem;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-12-19T10:51:34+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class OrderMapperImpl implements OrderMapper {

    @Override
    public Order toEntity(OrderReq orderReq) {
        if ( orderReq == null ) {
            return null;
        }

        Order order = new Order();

        order.setShippingAddress( orderReq.getShippingAddress() );
        order.setTelephone( orderReq.getTelephone() );
        order.setItems( orderItemReqListToOrderItemList( orderReq.getItems() ) );

        return order;
    }

    @Override
    public OrderRes toDTO(Order order) {
        if ( order == null ) {
            return null;
        }

        OrderRes orderRes = new OrderRes();

        orderRes.setItems( orderItemListToOrderItemReqList( order.getItems() ) );
        orderRes.setShippingAddress( order.getShippingAddress() );
        orderRes.setTelephone( order.getTelephone() );

        return orderRes;
    }

    protected OrderItem orderItemReqToOrderItem(OrderItemReq orderItemReq) {
        if ( orderItemReq == null ) {
            return null;
        }

        OrderItem orderItem = new OrderItem();

        orderItem.setQty( orderItemReq.getQty() );
        orderItem.setProductId( orderItemReq.getProductId() );

        return orderItem;
    }

    protected List<OrderItem> orderItemReqListToOrderItemList(List<OrderItemReq> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItem> list1 = new ArrayList<OrderItem>( list.size() );
        for ( OrderItemReq orderItemReq : list ) {
            list1.add( orderItemReqToOrderItem( orderItemReq ) );
        }

        return list1;
    }

    protected OrderItemReq orderItemToOrderItemReq(OrderItem orderItem) {
        if ( orderItem == null ) {
            return null;
        }

        OrderItemReq orderItemReq = new OrderItemReq();

        orderItemReq.setProductId( orderItem.getProductId() );
        orderItemReq.setQty( orderItem.getQty() );

        return orderItemReq;
    }

    protected List<OrderItemReq> orderItemListToOrderItemReqList(List<OrderItem> list) {
        if ( list == null ) {
            return null;
        }

        List<OrderItemReq> list1 = new ArrayList<OrderItemReq>( list.size() );
        for ( OrderItem orderItem : list ) {
            list1.add( orderItemToOrderItemReq( orderItem ) );
        }

        return list1;
    }
}
