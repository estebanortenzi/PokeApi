package com.pokeApiChallenge.demo.services.imp;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.pokeApiChallenge.demo.models.entities.Pokemon;
import com.pokeApiChallenge.demo.models.views.PokemonDTO;
import com.pokeApiChallenge.demo.services.PokemonService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

@Service
public class PokemonServiceImp implements PokemonService {

    @Override
    public List<PokemonDTO> getAllPokemons() {

        List<PokemonDTO> pokemonsDtoList = new ArrayList<>();

        for (int i = 1; i <= 898; i++) {
            HttpRequest request = HttpRequest
                    .newBuilder()
                    .uri(URI.create("https://pokeapi.co/api/v2/pokemon/" + i++))
                    .GET()
                    .build();

            HttpClient client = HttpClient.newHttpClient();
            HttpResponse<String> response = null;

            try {
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();

                GsonBuilder builder = new GsonBuilder();
                Gson gson = builder.create();

                Pokemon pokemon = gson.fromJson(json, Pokemon.class);

                if (pokemon != null)
                    pokemonsDtoList.add(createPokemonDto(pokemon));

            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
        return pokemonsDtoList;
    }

    @Override
    public PokemonDTO findPokemonByName(String name) {

        Pokemon pokemon = null;
        PokemonDTO pokemonDTO = null;

        HttpRequest request = HttpRequest
                .newBuilder()
                .uri(URI.create("https://pokeapi.co/api/v2/pokemon/" + name))
                .GET()
                .build();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = null;

        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String json = response.body();

            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();

            pokemon = gson.fromJson(json, Pokemon.class);

            pokemonDTO = createPokemonDtoComplete(pokemon);

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }

        return pokemonDTO;
    }

    private PokemonDTO createPokemonDto(Pokemon pokemon){
        return PokemonDTO.builder()
                .name(pokemon.getName())
                .sprites(pokemon.getSprites())
                .types(pokemon.getTypes())
                .weight(pokemon.getWeight())
                .abilities(pokemon.getAbilities())
                .build();
    }

    private PokemonDTO createPokemonDtoComplete(Pokemon pokemon){
        return PokemonDTO.builder()
                .name(pokemon.getName())
                .sprites(pokemon.getSprites())
                .types(pokemon.getTypes())
                .weight(pokemon.getWeight())
                .abilities(pokemon.getAbilities())
                .description(pokemon.getDescription())
                .moves(pokemon.getMoves())
                .build();
    }
}
