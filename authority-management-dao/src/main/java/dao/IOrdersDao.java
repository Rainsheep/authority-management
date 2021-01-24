package dao;

import domain.Member;
import domain.Orders;
import domain.Product;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface IOrdersDao {

    @Select("select * from orders")
    @Results({
            @Result(property = "product", column = "productId", javaType = Product.class, one = @One(select = "dao.IProductDao.findById")),
    })
    public List<Orders> findAll() throws Exception;

    //多表操作
    @Select("select * from orders where id=#{ordersId}")
    @Results({
            @Result(property = "product", column = "productId", javaType = Product.class, one = @One(select = "dao.IProductDao.findById")),
            @Result(property = "member", column = "memberId", javaType = Member.class, one = @One(select = "dao.IMemberDao.findById")),
            @Result(property = "travellers", column = "id", javaType = java.util.List.class, many = @Many(select = "dao.ITravellerDao.findByOrdersId"))
    })
    public Orders findById(Integer ordersId) throws Exception;
}
