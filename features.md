# Kravliste

## Funktional

### Must have

| Krav Id | Beskrivelse | Status  | 
| ------------- | ----|------------- |
| K1 | YO Systemet skal opret bruger | ikke begyndt  |
| K2 | Systemet skal vis brugere | ikke begyndt |
| K3 | Systemet skal update bruger | ikke begyndt |
| K4 | Systemet skal slet bruger | ikke begyndt |
| K5 | Systemet skal tildele en kodeord, som genereres automatisk| ikke begyndt |
| K6 | Systemet skal have flere brugertyper | ikke begyndt |
| K7 | Systemet skal persistent data i en tekstfil | ikke begyndt |




:white_check_mark:
### Should have 

| Krav Id | Beskrivelse | Status  | 
| ------------- | ------------- |------------- |
| K21 | Systemet skal persistent data i en database  |not started  |



### Could have
| Krav Id | Beskrivelse | Status  | 
| ------------- | ------------- |------------- |

### Wont have
| Krav Id | Beskrivelse | Status  | 
| ------------- | ------------- |------------- |


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