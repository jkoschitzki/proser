
# Sicherheitsrichtlinie

Danke, dass du dich für die Sicherheit dieses Projekts interessierst. In diesem Dokument steht, wie Sicherheitslücken gemeldet werden sollen und was du erwarten kannst.

## Kontakt / Melden

Bevorzuge bitte eine vertrauliche Meldung an das Projektteam über eine der folgenden Optionen:

- GitHub Security Advisories (empfohlen): Öffne eine private Sicherheitsmeldung über die GitHub-UI -> "Security" -> "Advisories".
- Alternativ: Eröffne ein Issue mit dem Label `security` und markiere es als vertraulich (private Issue) — oder kontaktiere die Maintainer direkt per E‑Mail: jana.koschitzki@student.htw-berlin.de (ersetze durch die echte Kontaktadresse).

Wichtig: Veröffentliche keine Exploits oder ausführliche technische Details in öffentlichen Issues, bevor das Problem behoben wurde.

## Informationen, die du mitschicken solltest

Bitte liefere möglichst viele der folgenden Informationen (sofern bekannt):

- Kurze Beschreibung des Problems
- Reproduktionsschritte (schrittweise, minimale Beispiele bevorzugt)
- Erwartetes vs. tatsächliches Verhalten
- Betroffene Version(en) (z. B. `v1.0.0`)
- Prüfsummen/Hashes oder POC-Code (als verschlossene/privat übermittelte Datei)
- Kontaktmöglichkeit für Rückfragen (E‑Mail, GitHub-Handle)

Wenn du Testcode mitsendest, füge eine kurze Anweisung bei, wie wir ihn lokal reproduzieren können.

## Antwortzeit & Ablauf

Wir versuchen, innerhalb von 72 Stunden zu bestätigen, dass wir die Meldung erhalten haben. Der weitere Ablauf ist typischerweise:

1. Empfangsbestätigung (innerhalb von 72 Stunden)
2. Erste Einschätzung & Priorisierung
3. Behebung oder Workaround (je nach Schwere) oder koordinierte Veröffentlichung
4. Offenlegung nach gemeinsamer Absprache (koordiniertes Disclosure)

Wenn du eine kritische Sicherheitslücke meldest (RCE, Datenleck etc.), gib dies bitte in der Meldung deutlich an.

## Unterstützte Versionen

Wir behandeln Sicherheitsmeldungen für aktive Releases. Bitte gib die betroffenen Versionen an. Wenn du dir unsicher bist, nenne die genaue Commit/Tag-Referenz.

## Responsible Disclosure / Koordinierte Offenlegung

Bitte veröffentliche Details zur Sicherheitslücke nicht öffentlich, bevor:

- eine Sicherheitsfix-Version verfügbar ist, oder
- wir einer verantwortlichen Offenlegung explizit zugestimmt haben.

Wir bemühen uns um eine geregelte und faire Offenlegung zusammen mit Finder:innen.

## Hinweise für Maintainer — schnelle Prüf- und Abhilfeschritte

- Lokale Analyse der Abhängigkeiten:

```bash
cd my-prose-app
# Abhängigkeitsbaum
mvn dependency:tree

# Verfügbare Updates für Abhängigkeiten anzeigen
mvn versions:display-dependency-updates
```

- GitHub-Sicherheitsfunktionen nutzen: Dependabot alerts & auto-updates, Security Advisories
- Bei Release: CVE-Vergabe (falls erforderlich) und Changelog-Eintrag

## Offenlegung von PGP/Schlüsseln

Falls du sensible Patches symmetrisch signieren möchtest, hinterlege hier einen PGP-Fingerprint oder ein sicheres Kommunikationsmittel. (Aktuell kein Schlüssel hinterlegt.)

## Danke

Vielen Dank an alle, die helfen, dieses Projekt sicher zu machen. Wir schätzen verantwortungsbewusste Meldungen und kooperatives Verhalten.

