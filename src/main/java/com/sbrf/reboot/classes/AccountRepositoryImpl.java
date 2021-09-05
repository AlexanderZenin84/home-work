package com.sbrf.reboot.classes;

import com.sbrf.reboot.repository.AccountRepository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class AccountRepositoryImpl implements AccountRepository {

    private final String path;

    public AccountRepositoryImpl(String path) {
        this.path = path;
    }

    @Override
    public Set<Account> getAllAccountsByClientId(long l) throws FileNotFoundException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(path));
        } catch (IOException e) {
            throw new FileNotFoundException("Путь не найден");
        }

        Set<Account> accounts = new HashSet<>();
        String numberFromFile;
        long clientIdFromFile = 0;
        String currentLine = null;

        try {
            currentLine = reader.readLine();

            String s[] = null;
            while (currentLine != null) {
                if (currentLine.contains("clientId")) {
                    s = currentLine.split(":");
                    if (s.length == 2) {
                        clientIdFromFile = Long.parseLong(s[1].replaceAll(",", "").trim());
                        currentLine = reader.readLine();
                        if (clientIdFromFile == l) {
                            s = currentLine.split(":");
                            if (s.length == 2) {
                                accounts.add(new Account(s[1].replaceAll("\"", "").trim()));
                            }
                        }
                    }
                }
                currentLine = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return accounts;
    }
}
