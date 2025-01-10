package com.account.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.account.dashboard.domain.FileData;

@Repository
public interface FileDataRepository extends JpaRepository<FileData, Long> {

}
