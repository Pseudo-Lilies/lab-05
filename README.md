# CMPUT 301 : Lab 5 Participation Exercise

## Student Details

- **Full Name:** `Kady Chan`
- **CCID:** `calvin9`

## Notes
Original code provided in lab slides, most noticeably in updateCity, but also in addCity is seemingly bugged.
Specifically, it uses city.name in place of an ID. This leads to an updated city with a new name being inaccessible except through a proxy city i.e.  
`Add Edmonto, Update Edmonto to Edmnton, Update Edmnton to Edmonton -> 2 Documents (Edmonto with a city name of Edmnton & Edmnton with a city name of Edmonton)`  
Deleting Edmnton would instead delete the document Edmnton here, i.e. the city displayed as Edmonton

This branch largely fixes this bug by messing with an ID. Notably however, updating a city and new adding a new city with the old name will still instead update the first city to its original name. Some null checks have also been lost, though as far as I can tell isn't affecting anything.

## References and Resources

List any resources used here, or simply put `N/A` if not applicable.
`N/A`

## Verbal Collaboration

| Student Name | CCID      |
| ------------ | --------- |
| `student`    | `student` |
| `<Add more>` | `<CCID>`  |
