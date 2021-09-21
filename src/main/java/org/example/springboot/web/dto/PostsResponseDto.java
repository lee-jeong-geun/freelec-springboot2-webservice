package org.example.springboot.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springboot.domain.posts.Posts;

@Getter
@NoArgsConstructor
public class PostsResponseDto {
    public Long id;
    public String title;
    public String content;
    public String author;

    public PostsResponseDto(Posts entity) {
        id = entity.getId();
        title = entity.getTitle();
        content = entity.getContent();
        author = entity.getAuthor();
    }
}
