package com.pokeApiChallenge.demo.services;

import com.pokeApiChallenge.demo.models.views.PokemonDTO;

import java.util.List;

public interface PokemonService {

    List<PokemonDTO> getAllPokemons ();

    PokemonDTO findPokemonByName (String name);
}
