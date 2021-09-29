package com.sbrf.reboot.atm.cassettes;

import java.util.ArrayList;

public class Cassette<Banknote> {
    private final ArrayList<Banknote> banknotes;

    public Cassette(ArrayList<Banknote> banknotes) {
        this.banknotes = banknotes;
    }

    public int getCountBanknotes() {
        return banknotes.size();
    }
}
