package com.sunny.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

// JpaRepository<Entity Class, PK type>을 상속하기.
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
