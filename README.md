# CMPUT 301 : Lab 5 Participation Exercise

## Student Details

- **Full Name:** `Kady Chan`
- **CCID:** `calvin9`

## Notes
Original code provided in lab slides, most noticeably in updateCity, but also in addCity is seemingly bugged.
Specifically, it uses city.name in place of an ID. This leads to an updated city with a new name being inaccessible except through a proxy city i.e.  
`Add Edmonto, Update Edmonto to Edmnton, Update Edmnton to Edmonton -> 2 Documents (Edmonto with a city name of Edmnton & Edmnton with a city name of Edmonton)`  
Deleting Edmnton would instead delete the document Edmnton here, i.e. the city displayed as Edmonton

This bug is part of the lab code and fixing it would require simple but noticeable edits to code outside of the scope of my assignment
It would also result in the firebase data being different from expected for any graders
Seeing as this is a course that emphasizes groupwork, encapsulation, etc, I believe it is more in line with this assignment to not alter the code of others.  
**A branch has been added with most of the bug fixed. Delete works with no bugs on the branch**

## References and Resources

List any resources used here, or simply put `N/A` if not applicable.
`N/A`

## Verbal Collaboration

| Student Name | CCID      |
| ------------ | --------- |
| `student`    | `student` |
| `<Add more>` | `<CCID>`  |
