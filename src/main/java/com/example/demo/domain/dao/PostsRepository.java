package com.example.demo.domain.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.domain.entity.Posts;

public interface PostsRepository extends JpaRepository<Posts, Long>{

}
