package com.example.biblioteca.controller;

import com.example.biblioteca.model.Book;
import com.example.biblioteca.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/livros")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    // GET /livros
    @GetMapping
    public List<Book> listarLivros() {
        return bookRepository.findAll();
    }

    // GET /livros/{id}
    @GetMapping("/{id}")
    public Optional<Book> buscarLivro(@PathVariable Long id) {
        return bookRepository.findById(id);
    }

    // POST /livros
    @PostMapping
    public Book adicionarLivro(@RequestBody Book livro) {
        return bookRepository.save(livro);
    }

    // PUT /livros/{id}
    @PutMapping("/{id}")
    public Book atualizarLivro(@PathVariable Long id, @RequestBody Book livro) {
        livro.setId(id);
        return bookRepository.save(livro);
    }

    // DELETE /livros/{id}
    @DeleteMapping("/{id}")
    public void deletarLivro(@PathVariable Long id) {
        bookRepository.deleteById(id);
    }
}
