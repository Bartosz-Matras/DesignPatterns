package pl.matrasbartosz.adapter_pattern;

import pl.matrasbartosz.adapter_pattern.api.LibraryAPI;
import pl.matrasbartosz.adapter_pattern.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    private User user;
    private LibraryAPIv2 libraryAPIv2;


    public APIAdapter(LibraryAPIv2 libraryAPIv2, User user) {
        this.libraryAPIv2 = libraryAPIv2;
        this.user = user;
    }

    @Override
    public boolean isAvailable(String bookTitle) {
        return this.libraryAPIv2.numberOfAvailableCopies(bookTitle) > 0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return this.libraryAPIv2.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return this.libraryAPIv2.reserve(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }
}
