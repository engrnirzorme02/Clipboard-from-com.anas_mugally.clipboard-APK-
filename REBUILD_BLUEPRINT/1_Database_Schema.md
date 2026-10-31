# 1. Database Schema

This document reconstructs the app’s Room persistence layer from the static decompiled code in:
- `DECOMPILED/sources/com/anas_mugally/clipboard/database/AppDatabase.java`
- `DECOMPILED/sources/com/anas_mugally/clipboard/database/AppDatabase_Impl.java`
- DAO interfaces under `DECOMPILED/sources/p215c1/`

Important note: the APK was decompiled using JADX with obfuscated names in many places. The schema below represents the recovered Room schema and the likely domain model names inferred from the generated SQL, DAO signatures, and app usage patterns. It should be treated as a reconstruction, not a guaranteed source-accurate original class list.

## 1.1 Database Summary

The database is named:
- `app_database`

It contains 3 tables:
1. `text_table`
2. `category_table`
3. `temporary_text_table`

Room version migration evidence shows the schema evolved across at least 3 versions, ending at version 5 (`AppDatabase_Impl` reports migration sequence 2 -> 3 -> 4 -> 5). The final schema includes:
- `text_table`
- `category_table`
- `temporary_text_table`

## 1.2 Room Database Contract

### AppDatabase

The generated database implementation exposes the following DAO accessors:
- `InterfaceC2979a mo15144E()`
- `InterfaceC2981c mo15145F()`
- `InterfaceC2983e mo15146G()`

From method names and usage patterns, these are likely:
- `TextDao`
- `CategoryDao`
- `TemporaryTextDao`

The generated SQL confirms the following schema.

---

## 1.3 Table: `text_table`

### Purpose
This is the primary data table for saved clipboard entries / note text records.

### Room schema (reconstructed)

```sql
CREATE TABLE IF NOT EXISTS `text_table` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  `time` INTEGER NOT NULL,
  `textTitle` TEXT,
  `textContent` TEXT NOT NULL,
  `category` TEXT,
  `orderPin` INTEGER NOT NULL,
  `isUploaded` INTEGER NOT NULL,
  FOREIGN KEY(`category`) REFERENCES `category_table`(`categoryName`) ON UPDATE NO ACTION ON DELETE NO ACTION
)
```

### Column definitions

| Column | Type | Nullability | Key | Notes |
|---|---|---:|---|---|
| `id` | `INTEGER` | NOT NULL | PK | Auto-increment primary key |
| `time` | `INTEGER` | NOT NULL | - | Timestamp in epoch milliseconds |
| `textTitle` | `TEXT` | NULL | - | Optional title or summary for note entry |
| `textContent` | `TEXT` | NOT NULL | - | Main note/clipboard content |
| `category` | `TEXT` | NULL | FK | References `category_table.categoryName` |
| `orderPin` | `INTEGER` | NOT NULL | - | Sort/order pin indicator |
| `isUploaded` | `INTEGER` | NOT NULL | - | Upload/sync flag (0/1) |

### Reconstructed entity intent
A likely entity class would look conceptually like:

```kotlin
@Entity(
    tableName = "text_table",
    foreignKeys = [
        ForeignKey(
            entity = Category::class,
            parentColumns = ["categoryName"],
            childColumns = ["category"],
            onDelete = ForeignKey.NO_ACTION,
            onUpdate = ForeignKey.NO_ACTION
        )
    ]
)
data class TextEntry(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val time: Long,
    val textTitle: String?,
    val textContent: String,
    val category: String?,
    val orderPin: Int,
    val isUploaded: Boolean
)
```

### DAO contract (inferred)
From `InterfaceC2979a`:

```java
public interface InterfaceC2979a {
    void mo14841a(C5209a c5209a);     // insert / add single item
    void mo14842b(C5209a c5209a);     // update / save item
    void mo14843c(C5209a c5209a);     // delete / remove item
    void mo14844d(List list);          // bulk insert/update
    List mo14845e();                   // fetch all texts / list all entries
    List mo14846f();                   // fetch filtered or sorted list
}
```

Observed object names in code suggest `C5209a` is a text row model. This strongly indicates the table holds clipboard/note objects with metadata fields like title, content, category, time, and upload status.

---

## 1.4 Table: `category_table`

### Purpose
This table stores note categories / section buckets used by the app’s notes browser and section-based UI.

### Room schema (reconstructed)

```sql
CREATE TABLE IF NOT EXISTS `category_table` (
  `categoryName` TEXT NOT NULL,
  `order` INTEGER NOT NULL,
  `isLocked` INTEGER NOT NULL,
  `pass` TEXT NOT NULL,
  `allowBiometric` INTEGER NOT NULL,
  `name` TEXT NOT NULL
)
```

### Column definitions

| Column | Type | Nullability | Key | Notes |
|---|---|---:|---|---|
| `categoryName` | `TEXT` | NOT NULL | PK | Main category identifier / unique name |
| `order` | `INTEGER` | NOT NULL | - | Display order |
| `isLocked` | `INTEGER` | NOT NULL | - | Whether category is protected |
| `pass` | `TEXT` | NOT NULL | - | Category password / access token (or placeholder) |
| `allowBiometric` | `INTEGER` | NOT NULL | - | Biometric unlock permission |
| `name` | `TEXT` | NOT NULL | - | Human-readable display name |

### Reconstructed entity intent
This looks like a category / folder entity rather than a simple label-only table.

```kotlin
@Entity(tableName = "category_table")
data class Category(
    @PrimaryKey val categoryName: String,
    val order: Int,
    val isLocked: Boolean,
    val pass: String,
    val allowBiometric: Boolean,
    val name: String
)
```

### DAO contract (inferred)
From `InterfaceC2981c`:

```java
public interface InterfaceC2981c {
    void mo14852a(List list);             // insert/update category list
    void mo14853b();                      // delete all / clear categories
    void mo14854c(long j7, long j8);      // maybe sort or update order window
    List mo14855d(Integer num, String str, int i7); // query categories by state/filters
    void mo14856e(C5210b c5210b);         // insert/update single category
}
```

### Observed migration evidence
The migration file shows later schema evolution:
- `ALTER TABLE category_table ADD COLUMN allowBiometric INTEGER NOT NULL DEFAULT 0`

This strongly indicates support for a secure category configuration with a biometric unlock pattern.

---

## 1.5 Table: `temporary_text_table`

### Purpose
This table stores ephemeral temporary notes or transient text snippets, likely short-lived clipboard or scratch content.

### Room schema (reconstructed)

```sql
CREATE TABLE IF NOT EXISTS `temporary_text_table` (
  `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
  `time` INTEGER NOT NULL,
  `text` TEXT NOT NULL
)
```

### Column definitions

| Column | Type | Nullability | Key | Notes |
|---|---|---:|---|---|
| `id` | `INTEGER` | NOT NULL | PK | Auto-increment primary key |
| `time` | `INTEGER` | NOT NULL | - | Timestamp for temporary note creation |
| `text` | `TEXT` | NOT NULL | - | Stored temporary string payload |

### Reconstructed entity intent
```kotlin
@Entity(tableName = "temporary_text_table")
data class TemporaryText(
    @PrimaryKey(autoGenerate = true) val id: Long = 0,
    val time: Long,
    val text: String
)
```

### DAO contract (inferred)
From `InterfaceC2983e`:

```java
public interface InterfaceC2983e {
    void mo14860a(List list);               // bulk insert temporary items
    void mo14861b(C5211c c5211c);           // insert/update a temporary text item
    List mo14862c(String str, List list);   // query by pattern / filters
    List mo14863d(String str, long j7, long j8); // query date-range by text value
    List mo14864e(long j7);                 // fetch by id/time
    List mo14865f(String str);              // search by text content
    List mo14866g();                        // all temporary texts
    List mo14867h(String str, String str2, long j7, long j8); // filtered search by text+category+time
    List mo14868i(int i7);                  // fetch by index / count / page
    List mo14869j(String str, long j7);     // query by title / text + timestamp
    void mo14870k(String str);              // delete by identifier or text
    List mo14871l(List list);                // maybe bulk delete or query by list ids
    List mo14872m(String str, long j7);      // query by text + time
    void mo14873n(C5211c c5211c);            // delete/update a temporary text item
    List mo14874o(String str, long j7, long j8); // range query by content + time
    List mo14875p(long j7, long j8, List list); // complex filtered query
    List mo14876q(long j7);                  // fetch by time bucket
    List mo14877r(String str, long j7, long j8, List list); // search with time/date filters
    void mo14878s(C5211c c5211c);           // delete a record
    List mo14879t(long j7);                  // fetch by id
    List mo14880u(long j7, long j8);         // date range query
    List mo14881v(String str, String str2);  // search by two strings
    long mo14882w(String str);               // count by string or key
    void mo14883x(List list);                // bulk insert/replace items
    List mo14884y(String str, long j7);      // query by text + time
}
```

This DAO is richer than a simple temporary notes list and strongly suggests a history / search / filtering model.

---

## 1.6 Relationship Model

### Relationship summary

```text
category_table (1) ----< (many) text_table
```

- `text_table.category` references `category_table.categoryName`
- This is a logical association used by the notes browser and section-based organization
- There is no explicit many-to-many structure in the schema; the relationship is a normal one-to-many between categories and note rows

### Notes
- `categoryName` appears to be the natural primary key for categories
- `text_table.category` is a nullable foreign key, so notes may exist without assigned category
- The `temporary_text_table` is independent and not linked to `text_table`

---

## 1.7 Database Evolution and Migration Notes

From `AppDatabase.java`, the schema was migrated between versions:

- version 2 -> 3: category table migration
- version 3 -> 4: category table add `allowBiometric`
- version 4 -> 5: create `temporary_text_table`

This indicates the app has already had a history of product changes and schema growth.

The generated schema identity is:
- `acf5c44ce1544d4d9382645eedf9ef3e`

This can be used as a reference fingerprint when rebuilding a compatible schema.

---

## 1.8 Recommended Rebuild Schema

For a clean-room app, the safest model is to use these three tables with the following semantics:

### `notes`
- `id: Long` PK auto-increment
- `time: Long`
- `title: String?`
- `content: String`
- `category: String?` FK to categories table
- `orderPin: Int`
- `isUploaded: Boolean`

### `categories`
- `categoryName: String` PK
- `order: Int`
- `isLocked: Boolean`
- `pass: String`
- `allowBiometric: Boolean`
- `name: String`

### `temporary_notes`
- `id: Long` PK auto-increment
- `time: Long`
- `text: String`

This preserves the app’s observed data model while giving a clean, maintainable design for a custom rebuild.

---

## 1.9 Evidence References

From the decompiled code:
- `AppDatabase.java`: table initialization and migration logic
- `AppDatabase_Impl.java`: exact SQL schema definitions and foreign key
- DAO interface files in `DECOMPILED/sources/p215c1/`: method names revealing database operations

These are the reconstruction anchors for the rest of the reverse-engineering blueprint.

---

## 1.10 File status

This file is intentionally limited to the database blueprint only.

Next file to generate after confirmation:
- `REBUILD_BLUEPRINT/2_Service_and_Intent_Contracts.md`

When you are ready, confirm and I will create the next document in the same directory.
