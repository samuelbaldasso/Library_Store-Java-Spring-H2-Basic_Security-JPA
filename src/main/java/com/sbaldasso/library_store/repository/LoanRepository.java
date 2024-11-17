package com.sbaldasso.library_store.repository;

import com.sbaldasso.library_store.domain.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {

}
