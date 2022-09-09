package com.example.onlinebookrental.dto.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserResponseDTO {
	private long id;

	private String firstName;

	private String lastName;

	private String email;

	private Date birthDate;


}
