package com.sbaldasso.library_store.repository;

import com.sbaldasso.library_store.domain.LoanHistory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LoanHistoryRepository extends JpaRepository<LoanHistory, Long> {
    List<LoanHistory> findByUserId(Long userId);
    List<LoanHistory> findByBookId(Long bookId);

}
