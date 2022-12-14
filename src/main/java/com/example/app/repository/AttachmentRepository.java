package com.example.app.repository;

import com.example.app.model.Attachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface AttachmentRepository extends JpaRepository<Attachment,Integer> {
    Long countById(Integer id);
}
