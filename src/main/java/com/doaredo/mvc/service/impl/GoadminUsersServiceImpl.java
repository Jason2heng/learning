package com.doaredo.mvc.service.impl;

import com.doaredo.mvc.core.AbstractService;
import com.doaredo.mvc.dao.GoadminUsersMapper;
import com.doaredo.mvc.model.GoadminUsers;
import com.doaredo.mvc.service.GoadminUsersService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/05/27.
 */
@Service
@Transactional
public class GoadminUsersServiceImpl extends AbstractService<GoadminUsers> implements GoadminUsersService {
    @Resource
    private GoadminUsersMapper goadminUsersMapper;

}
