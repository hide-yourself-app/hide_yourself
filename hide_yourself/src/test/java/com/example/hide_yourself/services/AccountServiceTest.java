package com.example.hide_yourself.services;

import com.example.hide_yourself.models.AccountModel;
import com.example.hide_yourself.repositories.AccountRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {
    @InjectMocks
    AccountService accountService;

    @Mock
    AccountRepository accountRepository;

    @Nested
    @DisplayName("getAccountModelById")
    class GetAccountModelByIdTests {

        @Test
        @DisplayName("When works fine")
        void when_works_fine() {
            AccountModel accountModel = AccountModel.builder().build();
            when(accountRepository.findById(anyLong())).thenReturn(Mono.just(accountModel));

            final var result = accountService.getAccountModelById(1L);
            StepVerifier.create(result).expectNextMatches(accountModel::equals).expectComplete();
        }
    }
}