package com.pokeApiChallenge.demo.controllers;

import com.pokeApiChallenge.demo.models.views.PokemonDTO;
import com.pokeApiChallenge.demo.services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(value = "/api/pokemon")
@RestController
public class PokemonController {

    @Autowired
    private PokemonService pokemonService;

    @GetMapping(value = "/pokemonList")
    public ResponseEntity<List<PokemonDTO>> getPokemonsList() {
        return new ResponseEntity<>(pokemonService.getAllPokemons(), HttpStatus.OK);
    }

    @GetMapping(value = "/{name}")
    public ResponseEntity<PokemonDTO> getPokemon(@PathVariable String name) {
        return new ResponseEntity<>(pokemonService.findPokemonByName(name), HttpStatus.OK);
    }

}
