package com.sena.app.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.app.Entity.View;
@Repository
public interface IViewRepository extends JpaRepository<View, Long>{
}
