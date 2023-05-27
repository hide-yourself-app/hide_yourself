package com.example.hide_yourself.services;

import com.example.hide_yourself.models.AccountModel;
import com.example.hide_yourself.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@Slf4j
@RequiredArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;

    public Mono<AccountModel> getAccountModelById(Long accountId) {
        return accountRepository.findById(accountId);
    }
}
