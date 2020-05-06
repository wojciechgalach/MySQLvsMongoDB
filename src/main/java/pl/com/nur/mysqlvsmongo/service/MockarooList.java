package pl.com.nur.mysqlvsmongo.service;

import org.springframework.stereotype.Service;
import pl.com.nur.mysqlvsmongo.model.Mockaroo;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

@Service
public class MockarooList {

    private List<Mockaroo> mockarooList;

    public List<Mockaroo> getMockarooList() {
        return mockarooList;
    }

    public void setMockarooList(List<Mockaroo> mockarooList) {
        this.mockarooList = mockarooList;
    }

    public MockarooList() throws IOException {
        mockarooList = new ArrayList<>();
        wczytaj(mockarooList);
    }

    private void wczytaj(List<Mockaroo> mockarooList) throws IOException {
        String sciezka = "MOCK_DATA.csv";
        FileReader in = new FileReader(sciezka);

        try {
            BufferedReader wczytaj = new BufferedReader(in);
            String linia = "";
            while ((linia = wczytaj.readLine()) != null) {
                String[] liniaDaneString = linia.split(",");
                Mockaroo linijka = new Mockaroo();
                linijka.setFirst_name(liniaDaneString[0]);
                linijka.setLast_name(liniaDaneString[1]);
                linijka.setEmail(liniaDaneString[2]);
                linijka.setGender(liniaDaneString[3]);
                linijka.setIp_address(liniaDaneString[4]);
                linijka.setCountry(liniaDaneString[5]);
                linijka.setNumber(Integer.parseInt(liniaDaneString[6]));
                mockarooList.add(linijka);
            }
            wczytaj.close();
        } catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        in.close();
    }
}
