package com.zsp.service.impl;

import com.zsp.entity.Person;
import com.zsp.mapper.PersonMapper;
import com.zsp.service.PersonService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zsp
 * @since 2021-05-01
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements PersonService {

}
