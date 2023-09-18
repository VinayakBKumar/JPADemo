package com.vidhya.jpademo.tc_models;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TC_MentorRepository extends JpaRepository<TC_Mentor,Long> {
    @Override
    <S extends TC_Mentor> S save(S entity);
}
