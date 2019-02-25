# Kravliste

## Funktional

### Must have

| Krav Id | Beskrivelse | Status  | 
| ------------- | ----|------------- |
| K1 | Systemet skal opret bruger | :white_check_mark:  |
| K2 | Systemet skal vis brugere | :white_check_mark: |
| K3 | Systemet skal update bruger | :white_check_mark: |
| K4 | Systemet skal slet bruger | :white_check_mark: |
| K5 | Systemet skal tildele en kodeord, som genereres automatisk| :white_check_mark: |
| K6 | Systemet skal have flere brugertyper | :white_check_mark: |


### Should have 

| Krav Id | Beskrivelse | Status  | 
| ------------- | ------------- |------------- |
| K21 | Systemet skal persistent data i en database  |:white_check_mark: |

### Wont have
| Krav Id | Beskrivelse | Status  | 
| ------------- | ------------- |------------- |
| K7 | Systemet skal persistent data i en tekstfil | ikke begyndt |


## Supplerende specifikationer

### User interface

### Hardware
* Systemet skal kunne køres på maskinerne i DTU’s databarer

### Software 
* Systemet skal implementes på Java version 8

### Implementation constrains
* UserDTO til at persistere brugerdata med
* DAO-klasse indeholder metoder til at tilgå data
* Benyt interfaces til afkobling af de enkelte lag
* Indlæg passende testdata, som initialiseres når programmet starter, f.eks. data for 3 brugere
