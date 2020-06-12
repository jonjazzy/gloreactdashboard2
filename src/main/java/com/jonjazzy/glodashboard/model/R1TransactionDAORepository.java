package com.jonjazzy.glodashboard.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface R1TransactionDAORepository extends JpaRepository<R1TransactionDAO, Integer>
{
    List<R1TransactionDAO> findAllById(String id);
    Optional<R1TransactionDAO> findByR1ref(String requestreference);
}
