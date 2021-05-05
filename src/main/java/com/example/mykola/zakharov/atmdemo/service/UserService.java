package com.example.mykola.zakharov.atmdemo.service;

import com.example.mykola.zakharov.atmdemo.dao.UserHibernateDAO;
import com.example.mykola.zakharov.atmdemo.entity.User;
import com.example.mykola.zakharov.atmdemo.model.ResponseModel;
import com.example.mykola.zakharov.atmdemo.model.UserModel;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {

    final UserHibernateDAO userDao;

    public UserService(UserHibernateDAO userDao) {
        this.userDao = userDao;
    }

    public ResponseModel getUserBalance(Long id) {
        User user = userDao.findUserById(id);
        if (user != null){
            UserModel userModel =
                    UserModel.builder()
                            .id(user.getId())
                            .balance(user.getBalance())
                            .build();
            return ResponseModel.builder()
                    .status(ResponseModel.SUCCESS_STATUS)
                    .data(userModel)
                    .build();
        } else {
            return ResponseModel.builder()
                    .status(ResponseModel.FAIL_STATUS)
                    .message(String.format("User #%s Not Found", id))
                    .build();
        }
    }

}
