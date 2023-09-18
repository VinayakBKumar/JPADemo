package com.vidhya.jpademo.jt_models;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.function.Function;

@Repository
public interface JT_MentorRepository extends JpaRepository<JT_Mentor, Long> {
    @Override
    <S extends JT_Mentor> S save(S entity);

    @Override
    <S extends JT_Mentor, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction);
}
