package service.impl;

import com.github.pagehelper.PageHelper;
import dao.IOrdersDao;
import domain.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.IOrdersService;

import java.util.List;

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private IOrdersDao ordersDao;

    @Override
    public List<Orders> findAll(int page, int size) throws Exception {
        //参数pageNum 是页码值   参数pageSize 代表是每页显示条数
        PageHelper.startPage(page, size);
        List<Orders> list = ordersDao.findAll();
        //System.out.println(list.get(0));
        return list;
    }

    @Override
    public Orders findById(Integer ordersId) throws Exception {
        return ordersDao.findById(ordersId);
    }
}