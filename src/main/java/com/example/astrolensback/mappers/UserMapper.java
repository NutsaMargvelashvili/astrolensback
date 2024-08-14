package com.example.astrolensback.mappers;
import com.example.astrolensback.dto.SignUpDto;
import com.example.astrolensback.dto.UserDto;
import com.example.astrolensback.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);

}