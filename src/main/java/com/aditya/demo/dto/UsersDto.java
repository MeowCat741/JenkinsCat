package com.aditya.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
public class UsersDto {

	
    public UsersDto(List<UserDto> userDtos) {
		super();
		this.userDtos = userDtos;
	}

	List<UserDto> userDtos;
}
