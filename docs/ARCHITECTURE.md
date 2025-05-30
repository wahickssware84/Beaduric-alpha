# Project Architecture
---
## ** Technologies Used **
- **Programming Language**: Java (OpenJDK 24.0.1)
- **Database**: None (utilizes .csv files and enums under 'src/resources' for data)
- **Build Tool**: Maven
- **Version Control**: Git (GitHub repository)
- **Testing**: JUnit
- **Deployment**: Java executable '.jar' (to be run locally)
---
## **Project Structure**
(root)/
├── docs/
│ ├──ARCHITECTURE.md
│ ├──CHANGELOG.md
│ ├──CLASS_OVERVIEW.md
│ ├──CONTRIBUTING.md
│ ├──FAQ.md
│ ├──SECURITY.md
├── src/
│ ├── resources/
│   ├──Brythonic.java
│   ├──Germanic.java
│   ├──Goidelic.java
│   ├──kingdoms.csv
│   ├──logo.png
│   ├──settlements.csv
│ ├──Beaduric.java
│ ├──Combat.java
│ ├──Culture.java
│ ├──Enemy.java
│ ├──Faction.java
│ ├──Kingdom.java
│ ├──Player.java
│ ├──Settlement.java
├── test/
│ ├──CombatTest.java
│ ├──CultureTest.java
│ ├──EnemyTest.java
│ ├──FactionTest.java
│ ├──KingdomTest.java
│ ├──PlayerTest.java
│ ├──SettlementTest.java
├──README.md
├──LICENSE
├──.gitignore
---
## **System Architecture**
This project follows a **two-tier architecture**:
1. **Presentation Layer** - Command-line interface (CLI) that user interacts with during runtime. 
2. **Game Logic Layer** - Initializes and adjusts essential backend gameplay functionality (e.g., combat mechanics, faction relations) and simulation logic.
--
## **Data Flow Diagram**
'''plaintext
[ INPUT (User) ] -> [ CLI (Presentation Layer)] -> [Game Logic (Combat, Player, Faction, etc.)] -> [Data Access Layer (files under '/src/resources/')] -> [ OUTPUT (Console) ]