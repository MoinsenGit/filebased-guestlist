package de.neuefische;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

// Test 1
//--Schreibe einen Test shouldBeEmptyInitially, der
//--eine Instanz von der Klasse GuestList erzeugt
//--darauf die Methode setGuests mit einer leeren Liste aufruft
//--dann getGuests aufruft (Ergebnis soll eine Liste von Strings sein)
//--und prüft, dass dieses Ergebnis eine leere Liste ist

class GuestListTest {
    @Test
    void shouldBeEmptyInitially(){
        //GIVEN
        GuestList guestList = new GuestList(); // Instanz erzeugen und "in (Variablen)Box packen": hier: guestlist
        // gleich: für Methodenaufruf ohne Variablenerstellung
        // new GuestList().setGuests();

        List<String> emptyList = new ArrayList<>();

        guestList.setGuests(emptyList); // Aufruf der Methode für diese Instanz mit leerer List

        //WHEN
        List<String> guestOnList = guestList.getGuests(); // Liste muss mit Rückgabewert der Methode übereinstimmen

        //THEN
        Assertions.assertEquals(emptyList, guestOnList);
    }

    //Test 2
    //--Schreibe einen Test shouldReadSameGuestsAsWrittenBefore, der
    //--eine Instanz von der Klasse GuestList erzeugt
    //--darauf die Methode setGuests mit Karl und Ute aufruft
    //--dann getGuests aufruft (Ergebnis soll eine Liste von Strings sein)
    //und prüft, dass dieses Ergebnis Karl und Ute enthält

    @Test
    void shouldReadSameGuestsAsWrittenBefore() {
        // GIVEN
        GuestList guestlist = new GuestList();

        List<String> karlUte = new ArrayList<>();
        karlUte.add("Karl");
        karlUte.add("Ute");

        // WHEN
        guestlist.setGuests(karlUte);

        List<String> listKarlUte = guestlist.getGuests();

        // THEN
        Assertions.assertEquals(karlUte, listKarlUte);

    }

}