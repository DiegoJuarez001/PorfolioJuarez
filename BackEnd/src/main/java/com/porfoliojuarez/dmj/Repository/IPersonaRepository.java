package com.porfoliojuarez.dmj.Repository;

import com.porfoliojuarez.dmj.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>  {
    
}
