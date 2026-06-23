# 🎯 Zahlenratespiel - Schleifen und Verzweigungen

> **Titel:** Zahlenratespiel
> **Zweck:** Verständnis von Schleifen, Verzweigungen und Zufallszahlen in Java vertiefen

---

## 📋 Projektinformationen

| Feld | Inhalt |
|------|-------|
| **Projektname** | Zahlenratespiel |
| **Typ** | Schulprojekt |
| **Klasse** | 1aAPC |
| **Schuljahr** | 2025/26 |
| **Abgabedatum** | 02.06.2026 |
| **Autor** | Rößmann Eva |
| **Lehrer** | G. Jarz |
| **Fach** | Applikationsentwicklung |

---

## 🎯 Projektbeschreibung

Dieses Projekt demonstriert die Verwendung von **while-Schleifen**, **if-Verzweigungen** und der Klasse **Random** in Java.

Das Programm erzeugt zufällig eine Zahl zwischen 1 und 100. Der Benutzer muss versuchen, diese Zahl zu erraten. Nach jedem Tipp erhält er einen Hinweis, ob die gesuchte Zahl größer oder kleiner ist. Das Spiel endet erst, wenn die richtige Zahl gefunden wurde.

---

## 🛠️ Entwicklungsumgebung

### Verwendete Software & Tools

| Tool / Software | Version | Zweck |
|---|---|---|
| **IntelliJ IDEA** | 2025.3.4.1 | Code-Editor & IDE |
| **Java SDK** | 21+ | Programmiersprache |
| **Terminal/Console** | - | Programmausführung |

### 💻 Betriebssystem

- ✅ Windows 11
- ✅ macOS
- ✅ Linux

---

### 📊 Beispiel-Ausführung

```
Zahlenratespiel
Rate eine Zahl zwischen 1 und 100

Dein Tipp: 50
Die Zahl ist größer

Dein Tipp: 75
Die Zahl ist kleiner

Dein Tipp: 62
Die Zahl ist größer

Dein Tipp: 68
Richtig!

Anzahl der Versuche: 4
```

### 📊 Weiteres Beispiel

```
Zahlenratespiel
Rate eine Zahl zwischen 1 und 100

Dein Tipp: 20
Die Zahl ist größer

Dein Tipp: 40
Die Zahl ist größer

Dein Tipp: 60
Die Zahl ist kleiner

Dein Tipp: 55
Richtig!

Anzahl der Versuche: 4
```

---

### 🔍 Detaillierte Code-Analyse

| Code-Element | Erklärung |
|---|---|
| `Scanner sc = new Scanner(System.in);` | Scanner für Benutzereingaben erstellen |
| `Random r = new Random();` | Zufallszahlengenerator erzeugen |
| `r.nextInt(100) + 1` | Zufällige Zahl zwischen 1 und 100 erstellen |
| `int tipp = 0;` | Variable für Benutzertipps |
| `int versuche = 0;` | Zähler für die Anzahl der Versuche |
| `while (tipp != zahl)` | Schleife läuft bis die Zahl erraten wird |
| `tipp = sc.nextInt();` | Benutzereingabe einlesen |
| `versuche = versuche + 1;` | Versuchszähler erhöhen |
| `if (tipp < zahl)` | Hinweis ausgeben, wenn die Zahl größer ist |
| `if (tipp > zahl)` | Hinweis ausgeben, wenn die Zahl kleiner ist |
| `System.out.println("Richtig!");` | Erfolgsnachricht ausgeben |
| `sc.close();` | Scanner schließen |

---

## 📚 Verwendete Java-Konzepte

- while-Schleifen
- if-Verzweigungen
- Zufallszahlen mit `Random`
- Benutzereingaben mit `Scanner`
- Vergleichsoperatoren
- Variablen und Datentypen

---

## 📜 Lizenz

Dieses Projekt wurde im Rahmen des Schulunterrichts erstellt.

```
Copyright © 2026 Rößmann Eva
Schulprojekt - rdata GmbH
Nicht für kommerzielle Nutzung vorgesehen
```

---
