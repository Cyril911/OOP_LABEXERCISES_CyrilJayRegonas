# Library Management System Class Hierarchy

## Class Hierarchy Diagram

```
                    LIBRARY_ITEM
                    ├── ITEM_ID
                    ├── TITLE
                    ├── AUTHOR
                    ├── PUBLICATION_YEAR
                    ├── AVAILABLE
                    └── BORROW_DATE
                            │
                    ┌───────┼───────┐
                    │       │       │
                BOOK    MAGAZINE    DVD
            ├── ISBN    ├── ISSUE   ├── DURATION
            ├── PAGES   ├── VOLUME  ├── GENRE
            └── GENRE   └── PUBLISHER  └── RATING
                    │
            ┌───────┼───────┐
            │       │       │
        FICTION  NON_FICTION  REFERENCE
        ├── SERIES  ├── SUBJECT  ├── EDITION
        └── RATING  └── LEVEL    └── UPDATED
                            │
                    ┌───────┼───────┐
                    │       │       │
                MEMBER    LIBRARIAN    ADMIN
            ├── MEMBER_ID  ├── EMPLOYEE_ID  ├── ADMIN_ID
            ├── NAME       ├── NAME         ├── NAME
            ├── EMAIL      ├── EMAIL        ├── EMAIL
            ├── PHONE      ├── DEPARTMENT   ├── DEPARTMENT
            └── MEMBERSHIP_TYPE  └── SHIFT    └── ACCESS_LEVEL
                    │
            ┌───────┼───────┐
            │       │       │
        STUDENT   FACULTY   GUEST
        ├── STUDENT_ID  ├── EMPLOYEE_ID  ├── GUEST_ID
        ├── COURSE      ├── DEPARTMENT   ├── VISIT_PURPOSE
        └── YEAR_LEVEL  └── POSITION     └── VISIT_DURATION
```

## System Components:
- **Library Items**: Books, Magazines, DVDs with different categories
- **Users**: Members (Students, Faculty, Guests), Librarians, Admins
- **Management**: Borrowing, returning, searching, inventory management
