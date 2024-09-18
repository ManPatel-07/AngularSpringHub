package com.mm.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MarksheetDTO 
{
	private Long id;
	
	private String name;
	
	private String rollno;
	
	private Integer maths;
	
	private Integer science;
	
	private Integer english;
}
