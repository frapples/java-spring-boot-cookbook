package io.github.frapples.javademoandcookbook.springboot.hello.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import io.github.frapples.javademoandcookbook.springboot.hello.entity.dto.PersonOutputDTO;
import io.github.frapples.javademoandcookbook.springboot.common.utils.CollectionUtils;
import io.github.frapples.javademoandcookbook.springboot.hello.persistence.HelloWorldMapper;
import io.github.frapples.javademoandcookbook.springboot.hello.entity.dao.PersonDO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    @Autowired
    private HelloWorldMapper helloWorldMapper;

    public List<PersonOutputDTO> hello() {
        List<PersonDO> persons = this.helloWorldMapper.selectList(new EntityWrapper<PersonDO>().
            eq("id", 1));

        return CollectionUtils.map(persons, PersonOutputDTO::convertFromDO);
    }

}