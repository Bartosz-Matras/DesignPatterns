package pl.matrasbartosz.adapter_pattern.api;

import java.time.LocalDate;

public class LibraryAPIv2Impl implements LibraryAPIv2 {


    @Override
    public int numberOfAvailableCopies(String bookTitle) {
        System.out.println("Checking availability: " + bookTitle);
        return 3;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Checking date to return: " + bookTitle);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String bookTitle, String firstName, String lastName, LocalDate dateOfBirth) {
        System.out.println("Reserve: " + bookTitle);
        return true;
    }
}
