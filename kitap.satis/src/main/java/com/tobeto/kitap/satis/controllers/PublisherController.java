package com.tobeto.kitap.satis.controllers;

import com.tobeto.kitap.satis.entities.Publisher;
import com.tobeto.kitap.satis.repositories.PublisherRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/publisher")
public class PublisherController
{
    private PublisherRepository publisherRepository;

    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }

    @GetMapping
    public List<Publisher> getAll(){
        return publisherRepository.findAll();
    }

    @PostMapping
    public String add(@RequestBody Publisher publisher)
    {
        publisherRepository.save(publisher);
        return "Başarıyla eklendi";
    }

    @PutMapping
    public String update(@RequestBody Publisher publisher)
    {
        publisherRepository.save(publisher);
        return "Başarıyla Güncellendi";

    }

    @DeleteMapping
    public String delete(@RequestParam int id)
    {
        Publisher category = publisherRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Böyle bir kategori bulunamadı."));
        // ex fırladığında bu satıra geçilmez.
        publisherRepository.delete(category);

        return "Başarıyla silindi";
    }
}


