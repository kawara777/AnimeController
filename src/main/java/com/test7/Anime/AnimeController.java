package com.test7.Anime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class AnimeController {

    @GetMapping("/anime")
    public Anime getAnime(@RequestParam int id) {
        return new Anime(1,"鬼滅の刃",24);
    }

    @PostMapping("/anime")
    public ResponseEntity<String> create(@RequestBody AnimeCreateForm form) {
        URI url = UriComponentsBuilder.fromUriString("http://localhost:8080")
                .path("/anime/id")
                .build()
                .toUri();
        return ResponseEntity.created(url).body("name successfully created");
    }

    @PatchMapping("/anime/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id, @RequestBody AnimeUpdateForm form) {

        return ResponseEntity.ok(Map.of("message", "name successfully updated"));
    }

    @DeleteMapping("/anime/{id}")
    public ResponseEntity<Map<String, String>> update(@PathVariable("id") int id) {

        return ResponseEntity.ok(Map.of("message", "name successfully delete"));
    }
}
