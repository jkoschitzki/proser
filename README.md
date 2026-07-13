# Proser / Prose-Builder

Kurz: Proser (a.k.a. Prose-Builder) ist ein kleines Open-Source-Tool, das einfache Prosa generiert, aufgebaut aus importierten Sätzen.

Dieses Repository enthält ein kleines Maven-Java-Projekt (`my-prose-app`), das als Beispielimplementierung dient.

Inhalt
- Beschreibung
- Schnellstart (Build & Run)
- Beispiele
- Mitwirken
- Lizenz

## Beschreibung

Proser ist ein einfaches Experiment: es nimmt Sätze (z. B. aus Abhängigkeiten oder Konfigurationsdateien) und baut daraus kurze Prosa-Abschnitte. Ziel ist ein übersichtliches, erweiterbares Grundgerüst zum Experimentieren mit textgenerierenden Bausteinen.

## Projektstruktur

- `my-prose-app/` – Maven-Subprojekt mit der Beispielanwendung
  - `src/main/java/de/htw_berlin/fb4/jkos/proser/` – Quellcode
  - `src/test/java/...` – Tests
  - `pom.xml` – Maven-Buildfile

## Schnellstart

Voraussetzung: Java (z. B. JDK 11+) und Maven sind installiert.

Build und Tests ausführen:

```bash
mvn -f my-prose-app clean package
mvn -f my-prose-app test
```

Die Beispielanwendung starten:

```bash
java -cp my-prose-app/target/classes de.htw_berlin.fb4.jkos.proser.App
```

Hinweis: Je nach Implementierung kann die Anwendung auch Eingabeparameter erwarten oder über Maven-Plugins gestartet werden. Nutze oben stehenden `java -cp`-Aufruf, wenn keine weiteren CLI-Instruktionen vorhanden sind.

## Beispielausgabe

Die Anwendung erzeugt kurze Sätze/Abschnitte aus den vorhandenen Satzbausteinen. Ausgabeformat und Inhalt hängen von der implementierten Logik ab.

## Mitwirken

Beiträge sind willkommen. Vorschläge:

- Fehlerberichte und Feature-Requests als Issues
- Kleine Pull-Requests für: Tests, Dokumentation, neue Textbausteine oder Regeln

Bitte achte beim Einreichen von Änderungen auf konsistente Formatierung und Unit-Tests, wenn sinnvoll.

## Lizenz

Dieses Projekt ist lizenziert unter der Apache License, Version 2.0. Siehe die Datei `LICENSE` im Projekt-Root für den vollständigen Lizenztext.

---

## Kurz (English)

Proser (Prose-Builder) is a small Java/Maven example project that generates simple prose from sentence building blocks. Build with Maven and run the example App class located under `de.htw_berlin.fb4.jkos.proser`.

If you want, I can extend the README with concrete CLI options, example outputs, a LICENSE file (MIT) or contribution guidelines. Tell me which additions you prefer.


