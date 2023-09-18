package com.vidhya.jpademo.st_models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ST_MentorRepository extends JpaRepository<ST_Mentor, Long> {
    @Override
    <S extends ST_Mentor> S save(S entity);
}
