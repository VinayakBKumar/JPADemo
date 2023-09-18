package com.vidhya.jpademo.ms_models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MS_MentorRepository extends JpaRepository<MS_Mentor, Long> {
    @Override
    <S extends MS_Mentor> S save(S entity);
}
