package com.example.hide_yourself.repositories;

import com.example.hide_yourself.models.AccountModel;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends ReactiveCrudRepository<AccountModel, Long> {
}
