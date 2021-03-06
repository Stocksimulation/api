package com.brownbag_api.security.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brownbag_api.model.ERole;
import com.brownbag_api.model.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {
	Role findByName(String strRole);

	boolean existsByName(String strRole);
}
