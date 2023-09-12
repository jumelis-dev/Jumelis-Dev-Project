package jumelis.dev.proyectbackend.domain.ports.in;

import jumelis.dev.proyectbackend.domain.models.Article;

// CreateArticleUseCase is a port that is used by the application layer to create an article.
public interface CreateArticleUseCase {
    Article create(Article article);
}
