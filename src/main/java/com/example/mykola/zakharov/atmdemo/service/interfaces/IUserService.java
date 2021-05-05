package com.example.mykola.zakharov.atmdemo.service.interfaces;

import com.example.mykola.zakharov.atmdemo.model.ResponseModel;

public interface IUserService {

    ResponseModel findUserById(Long id);

}
