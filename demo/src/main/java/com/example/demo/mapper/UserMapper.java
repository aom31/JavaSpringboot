package com.example.demo.mapper;

import com.example.demo.entity.User;
import com.example.demo.model.MRegisterResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = "spring")
public interface UserMapper {

    MRegisterResponse toRegisterResponse(User user);
}
