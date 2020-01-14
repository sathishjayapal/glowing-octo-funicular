package me.dot.sathish.fargatesample.repo;

import me.dot.sathish.fargatesample.data.PhoneBook;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhoneBookRepository extends CrudRepository<PhoneBook, Long> {
    List<PhoneBook> findByFullName(String title);
}
