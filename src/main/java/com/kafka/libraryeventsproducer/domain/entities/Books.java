package com.kafka.libraryeventsproducer.domain.entities;

public record Books(
        Integer bookId,
        String bookName,
        String bookAuthor
) {
}
