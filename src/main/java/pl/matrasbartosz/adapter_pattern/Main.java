package pl.matrasbartosz.adapter_pattern;

import pl.matrasbartosz.adapter_pattern.api.LibraryAPIv2;
import pl.matrasbartosz.adapter_pattern.api.LibraryAPIv2Impl;

class Main {

    public static void main(String[] args) {
        User user = new User("Bartosz", "Matras", "1111111111");
        LibraryAPIv2 libraryAPIv2 = new LibraryAPIv2Impl();
        APIAdapter apiAdapter = new APIAdapter(libraryAPIv2, user);
        BookConnector bookConnector = new BookConnector(user, apiAdapter);
        bookConnector.checkAvailability("Harry Potter");
    }
}
