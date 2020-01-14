package me.dot.sathish.fargatesample.controller;

import me.dot.sathish.fargatesample.data.PhoneBook;
import me.dot.sathish.fargatesample.exception.PhoneBookIdMismatchException;
import me.dot.sathish.fargatesample.exception.PhoneBookEntryNotFoundException;
import me.dot.sathish.fargatesample.repo.PhoneBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/phoneBook")
public class PhoneBookController {
    @Autowired
    private PhoneBookRepository phoneBookRepository;
    @GetMapping
    public Iterable findAll(){
        return phoneBookRepository.findAll();
    }
    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public PhoneBook create(@RequestBody PhoneBook phoneBook) {
        return phoneBookRepository.save(phoneBook);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        phoneBookRepository.findById(id)
                .orElseThrow(PhoneBookEntryNotFoundException::new);
        phoneBookRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public PhoneBook updateBook(@RequestBody PhoneBook phoneBook, @PathVariable Long id) {
        if (phoneBook.getId() != id) {
            throw new PhoneBookIdMismatchException();
        }
        phoneBookRepository.findById(id)
                .orElseThrow(PhoneBookEntryNotFoundException::new);
        return phoneBookRepository.save(phoneBook);
    }

}
