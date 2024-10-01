package com.seven.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MarksheetDto 
{
	private Long Id;

	private String name;

	private String rollno;
	
	private Integer maths;
	
	private Integer science;
	
	private Integer english;

	private LocalDateTime createdDate;

	private LocalDateTime updatedDate;
}
