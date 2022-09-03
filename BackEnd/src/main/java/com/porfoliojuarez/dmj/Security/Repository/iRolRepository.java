/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.porfoliojuarez.dmj.Security.Repository;

import com.porfoliojuarez.dmj.Security.Entity.Rol;
import com.porfoliojuarez.dmj.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByNombre(RolNombre rolNombre);
    
}
