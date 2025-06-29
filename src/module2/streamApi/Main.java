package module2.streamApi;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Alexey", List.of(
                        new Book("Java", 2001, 400),
                        new Book("Clean Code", 2008, 500),
                        new Book("Effective Java", 1998, 350),
                        new Book("Spring in Action", 2020, 600),
                        new Book("Hibernate", 2005, 450)
                )),
                new Student("Maria", List.of(
                        new Book("Java", 2001, 400),
                        new Book("Clean Architecture", 2017, 550),
                        new Book("Algorithms", 1995, 700),
                        new Book("Spring Boot", 2021, 300),
                        new Book("Design Patterns", 1994, 395)
                ))
        );

        Optional<Book> optionalBook = students.stream()
                .peek(System.out::println)
                .flatMap(s -> s.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages))
                .distinct()
                .filter(b -> b.getYear() > 2000)
                .limit(3)
                .map(b -> { System.out.println("Year: " + b.getYear()); return b; })
                .findFirst();

        System.out.println(
                optionalBook
                        .map(b -> "Book found: " + b.getTitle() + ", " + b.getYear())
                        .orElse("Book not found")
        );
    }

    static class Book {
        private final String title;
        private final int year;
        private final int pages;

        public Book(String title, int year, int pages) {
            this.title = title;
            this.year = year;
            this.pages = pages;
        }

        public String getTitle() { return title; }
        public int getYear() { return year; }
        public int getPages() { return pages; }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Book book)) return false;
            return year == book.year && pages == book.pages && title.equals(book.title);
        }

        @Override
        public int hashCode() {
            return Objects.hash(title, year, pages);
        }

        @Override
        public String toString() {
            return "\nBook { " + title + ", " + year + ", " + pages + "p }";
        }
    }

    static class Student {
        private final String name;
        private final List<Book> books;

        public Student(String name, List<Book> books) {
            this.name = name;
            this.books = books;
        }

        public List<Book> getBooks() {
            return books;
        }

        @Override
        public String toString() {
            return "Student{" + name + ", books=" + books + "}";
        }
    }
}
