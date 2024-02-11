package com.kafka.libraryeventsproducer.domain;

import com.kafka.libraryeventsproducer.domain.entities.Books;
import com.kafka.libraryeventsproducer.domain.enums.LibraryEventType;

public record LibraryEvent(
        Integer libraryEventId,
        LibraryEventType libraryEventType,
        Books book
) {
}
