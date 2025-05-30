# Java Programs – Anudip Course Collection

This repository contains Java programs developed as part of the Advanced Java course at Anudip Foundation.

## 📂 Folder Structure

- `javabasics/`: Contains fundamental Java programs covering basic concepts.
- `Multi_File_Programs/`: Includes Java programs that span multiple files, demonstrating more complex structures.

#!/bin/bash

# Check if directory argument is provided
if [ -z "$1" ]; then
  echo "Usage: $0 <directory>"
  exit 1
fi

DIR="$1"

# Check if 'tree' command exists
if ! command -v tree &> /dev/null; then
  echo "'tree' command not found. Please install it."
  exit 1
fi

# Generate the directory tree and format
tree -tf --noreport -I '*~' --charset ascii "$DIR" | \
sed -e 's/| \+/  /g' -e 's/[|`]-\+/ */g' -e "s:\(* \)\(\(.*/\)\([^/]\+\)\):\1[\4](\2):g" | \
awk '
BEGIN { print "# Project Tree\n" }
{ print }
'
## 🚀 How to Download and Run

### 1. Clone the Repository

Use Git to clone the repository:

```bash
git clone https://github.com/ambujpandey123/Java-Programs.git
```
### 2. Navigate to the Desired Directory

```bash
cd Java-Programs/javabasics
```

### 2. Run The Program

```bash
java ProgramName.java
```

Ensure you omit the .java extension when running the program.

✅ Requirements
Java Development Kit (JDK) 8 or higher

A text editor or IDE (e.g., VS Code, IntelliJ IDEA, Eclipse)



