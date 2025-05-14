package com.launchcode.personal_finance_tracker.model;

import jakarta.persistence.Entity;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

    @Entity
    public class User extends AbstractEntity {

        @NotNull
        private String username;

        @NotNull
        private String pwHash;

        private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        public User() {}

        public User(String username, String password) {
            this.username = username;
            this.pwHash = password;
        }

        public boolean isMatchingPassword(String password) {
            return encoder.matches(password, pwHash);
        }

        public String getUsername() {
            return username;
        }

    }

