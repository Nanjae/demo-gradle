package com.example.demo.domain.dto;

import com.example.demo.domain.entity.Posts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PostSaveRequestDto {
	private String title;
	private String content;
	private String author;
	
	public Posts toEntity() {
		return Posts.builder().title(title).content(content).author(author).build();
	}
}
