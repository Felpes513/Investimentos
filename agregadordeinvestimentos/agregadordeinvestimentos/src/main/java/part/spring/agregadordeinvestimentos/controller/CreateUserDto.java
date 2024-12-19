package part.spring.agregadordeinvestimentos.controller;

import org.antlr.v4.runtime.misc.NotNull;

public record CreateUserDto(

        @NotNull
        String username,

        @NotNull
        String email,

        @NotNull
        String password) {
}