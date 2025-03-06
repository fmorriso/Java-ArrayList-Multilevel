# Java ArrayList Multilevel
An example of a multilevel arraylist using a model of:
* A single State
* multiple school districts (District) within that state
* multiple schools (School) within each school district
* multiple courses (Course) taught at each school
* multiple departments (Department) within each school that teach multiple courses
* multiple teachers (Teacher) at each school teaching multiple courses
* multiple students (Student) at each school taking multiple courses
* A generic person class (Person) to lesson some code needed by teachers and students.

NOTE: <em><b>Not every possible scenario is provided in this example.
You are encouraged to further modify this code to suit your needs</b></em>
<p>
For example, courses can be added to both schools and departments, but you 
may elect to have only the departments keep track of which courses they are
in charge of.  If you decide to keep track of available courses only within departments,
you'll need a way to pull up a unique set of courses taught by the school from all the departments
if multiple departments can teach the same course to avoid the resulting list
containing duplicate courses.

## Tools Used

| Tool     |    Version |
|:---------|-----------:|
| Java     |   23.0.2.0 |
| IntelliJ | 2024.3.4.1 |
| VSCode   |     1.98.0 |

## Change History

| Date       | Description      |
|:-----------|:-----------------|
| 2025-03-06 | Initial creation |

## References
* []()
