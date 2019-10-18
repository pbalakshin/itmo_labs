package main.java.com.kupp.progLab2;

import main.java.com.kupp.progLab2.pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Lab2Battleground
{
    public static void main(String[] args) {
        Battle battleground = new Battle();

        battleground.addAlly(new Shuckle("Положить болт на либу", 42));
        battleground.addAlly(new Diggersby("Прокрастинировать", 60));
        battleground.addAlly(new Marill("Молится солиду", 87));

        battleground.addFoe(new Bunnelby("Юзать солид", 47));
        battleground.addFoe(new Azurill("Сделать норм либу", 87));
        battleground.addFoe(new Azumarill("Мы молодцы", 21));

        battleground.go();
    }
}
