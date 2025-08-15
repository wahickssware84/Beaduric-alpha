# Project Architecture
---
## **Technologies Used**
- **Programming Language**: Java (OpenJDK 24.0.1)
- **Database**: None (utilizes '.csv' files and enums under 'src/resources' for data)
- **Build Tool**: Maven
- **Version Control**: Git (GitHub repository)
- **Testing**: JUnit
- **Deployment**: Java executable '.jar' (to be run locally)
---
## **Project Structure**
```text
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
│ ├──Battle.java
│ ├──BeaduricAlpha.java
│ ├──Culture.java
│ ├──Enemy.java
│ ├──Faction.java
│ ├──Kingdom.java
│ ├──Player.java
│ ├──Settlement.java
├── test/
│ ├──BattleTest.java
│ ├──CultureTest.java
│ ├──EnemyTest.java
│ ├──FactionTest.java
│ ├──KingdomTest.java
│ ├──PlayerTest.java
│ ├──SettlementTest.java
├──README.md
├──LICENSE
├──.gitignore
```
---
## **System Architecture**
This project follows a **three (3)-tier architecture**:
1. **Presentation Layer** - Command-line interface (CLI) that user interacts with during runtime. 
2. **Game Logic Layer** - Initializes and adjusts essential backend gameplay functionality (e.g., combat mechanics, faction relations) and simulation logic.
3. **Data Access Layer** – Loads data from enums (.java) and `.csv` files under `src/resources/`; acts as a pseudo-database.
---
## **Data Flow Diagram**
```plaintext
[User Input]
     ↓
[Presentation Layer (CLI)]
     ↓
[Game Logic Layer (Combat, Faction, etc.)]
     ↓
[Data Access Layer (Enum + CSV Data)]
     ↓
[Console Output]
```
