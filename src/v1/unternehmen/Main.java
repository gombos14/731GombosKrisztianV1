package v1.unternehmen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private static List<Kunde> readFile() throws FileNotFoundException {
        List<Kunde> kunden = new ArrayList<>();

        File file = new File("/home/gombos14/IntellijProjects/731GombosKrisztianV1/src/v1/unternehmen/kundendaten.txt");
        Scanner reader = new Scanner(file);
        while (reader.hasNextLine()) {
            String[] data = reader.nextLine().split(",");

            Kunde animal = new Kunde(Integer.parseInt(data[0]), data[1], Unternehmensgrosse.valueOf(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), data[5]);
            kunden.add(animal);
        }
        return kunden;
    }

    private static void writeFile(List<Kunde> kunde, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            kunde.forEach(a -> {
                try {
                    fileWriter.write(a.toString());
                    fileWriter.write('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFiletop(List<Map.Entry<String, Integer>> top, String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            top.forEach(a -> {
                try {
                    fileWriter.write(a.getKey() + ": " + a.getValue());
                    fileWriter.write('\n');
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<Kunde> kunde = readFile();

        List<Kunde> sorted = kunde.stream().sorted((a1, a2) -> a2.getAnzahlMitarbeiter() - a1.getAnzahlMitarbeiter()).toList();
        writeFile(sorted, "kundensortiert.txt");

        Map<String, Integer> topOrte = new HashMap<>();

        for (Kunde k: kunde) {
            if (topOrte.containsKey(k.getOrt())) {
                topOrte.put(k.getOrt(), topOrte.get(k.getOrt()) + k.getEinkommen());
            }
            else topOrte.put(k.getOrt(), k.getEinkommen());
        }

        List<Map.Entry<String, Integer>> top = topOrte.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();
        writeFiletop(top, "statistik.txt");
    }
}
