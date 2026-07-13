# Contributing

Danke, dass du beitragen möchtest! Diese Datei beschreibt kurz, wie Beiträge (Bugs, Features, PRs) sauber eingereicht werden.

Kurzer Plan
- Issue erstellen, wenn nötig
- Branch vom `main` anlegen
- Änderungen lokal bauen & Tests ausführen
- PR öffnen mit Beschreibung und Referenzen

Kurze Checkliste (bevor du einen PR öffnest)

- [ ] Repo aktuell: `git fetch origin` und `git switch main && git pull`
- [ ] Neuer Branch: `git switch -c <dein-feature-branch>`
- [ ] Lokale Tests: `cd my-prose-app && mvn test`
- [ ] Keine IDE-/Build-Artefakte committet (siehe `.gitignore`)

1) Issues
- Bitte beschreibe Fehler mit reproduzierbaren Schritten, erwartetes und aktuelles Verhalten sowie relevante Log-Auszüge.

2) Lokale Entwicklung
- Projekt-Root enthält das Modul `my-prose-app`.
- Vor Änderungen: Java 21 installieren (oder die Version verwenden, die im Workflow konfiguriert ist).
- Häufige Befehle:

```bash
# Im Projekt-Root
git fetch origin
git switch -c feature/mein-feature

# In das Modul wechseln und Tests ausführen
cd my-prose-app
mvn test
```

3) Branching & PRs
- Branch-Namen: `feature/<kurz-beschreibung>`, `fix/<kurz-beschreibung>` oder `chore/<kurz>`.
- Rebase auf `main` empfohlen, damit die Historie sauber bleibt:

```bash
git fetch origin
git rebase origin/main
# Bei Konflikten: Dateien bearbeiten, dann
git add <gelöste-dateien>
git rebase --continue
git push --force-with-lease
```

- Alternativ kannst du `git merge origin/main` verwenden, wenn du Rewrites vermeiden willst.
- Öffne einen Pull Request vom Branch in dieses Repository. Beschreibe kurz Zweck, Änderungen und ggf. Backwards-Inkompatibilitäten.

4) Commit-Nachrichten
- Kurzzeile (max. 50 Zeichen), Leerzeile, längere Beschreibung falls nötig.
- Beispiel: `feat: add opening sentence generator`

5) Tests & CI
- Unsere GitHub Actions führen Tests für `my-prose-app` aus. Lokale Tests sollten vor dem Pushen grün sein.
- Wenn die CI fehlschlägt, prüfe die Logs in der Actions-Seite; oft handelt es sich um fehlende Secrets oder Auth-Probleme bei privaten Packages.

6) Style und Formatierung
- Java-Code: bitte vorhandenen Stil beibehalten. Formatiere mit deiner IDE (IntelliJ) entsprechend der Projektkonventionen.

7) Sonstiges
- Wenn du Großes änderst (API-Änderungen, Abhängigkeits-Updates), vermerke dies im PR und tagge Reviewer.
- Bei Fragen: öffne ein Issue oder schreibe einen Kommentar im PR.

Vielen Dank für deinen Beitrag!

