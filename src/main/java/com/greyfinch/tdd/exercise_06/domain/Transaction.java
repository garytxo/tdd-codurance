package com.greyfinch.tdd.exercise_06.domain;

import java.time.LocalDate;
import java.util.Objects;

public final class Transaction {

    private final int amount;
    private final LocalDate created;
    private final Type type;

    public Transaction(LocalDate created, int amount, Type type) {
        this.amount = amount;
        this.type = type;
        this.created = created;
    }

    public int getAmount() {
        return amount;
    }

    public LocalDate getCreated() {
        return created;
    }

    public Type getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction)) return false;
        Transaction that = (Transaction) o;
        return amount == that.amount &&
                Objects.equals(created, that.created) &&
                type == that.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(amount, created, type);
    }

    public enum Type {
        DEPOSIT, WITHDRAWAL
    }
}
