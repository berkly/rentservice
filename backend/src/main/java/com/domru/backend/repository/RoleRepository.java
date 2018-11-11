package com.domru.backend.repository;

import com.domru.backend.domain.Role;
import com.domru.backend.domain.RoleName;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleRepository extends CrudRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
