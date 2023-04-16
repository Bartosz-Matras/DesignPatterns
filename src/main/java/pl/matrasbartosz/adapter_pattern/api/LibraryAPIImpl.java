package pl.matrasbartosz.adapter_pattern.api;

import java.time.LocalDate;

public class LibraryAPIImpl implements LibraryAPI {

    @Override
    public boolean isAvailable(String bookTitle) {
        System.out.println("Checking availability: " + bookTitle);
        return true;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        System.out.println("Checking date to return: " + bookTitle);
        return LocalDate.now();
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        System.out.println("Reserve: " + bookTitle);
        return true;
    }
}
