# DSA-Java

A personal, real-time learning log of Data Structures & Algorithms implemented in Java — including LeetCode problem solutions, notes, and small experiments.  
Repo: [iamtahasc/DSA-Java](https://github.com/iamtahasc/DSA-Java)

This repository is how I learn and practice DSA — I solve problems, write clean Java implementations, add short notes about approach and complexity, and update the repo as I make progress. Everything here is a work in progress and reflects my current learning journey.

---

## What this repo is for (my goals)

- Learn and implement core data structures (arrays, linked lists, stacks, queues, trees, graphs, heaps, tries, hash maps).
- Practice problem solving with LeetCode-style problems and similar interview questions.
- Track progress in real time — each commit represents something I learned or fixed.
- Keep solutions readable, documented, and reusable.

---

## How I use this repo (real-time workflow)

1. Pick a problem (LeetCode, interview question, or a concept to implement).
2. Create a new Java file in the appropriate folder (e.g., `arrays/`, `trees/`, `dynamic-programming/`).
3. Add a short header comment: problem name/link, difficulty, date, time & space complexity.
4. Add unit tests or a `main` demo if helpful.
5. Commit with a clear message like: `feat: add LeetCode 2 Add Two Numbers (linkedlist) — 2025-06-01`.
6. If it's a harder topic, add notes (approach, edge-cases) in the same file or in `notes/`.
7. Open an issue if I want to revisit an optimization later or track follow-ups.

Example daily routine:
- Solve 1–3 problems a day (read, plan, implement, test).
- Push solutions and short notes.
- Update progress tracker (see "Progress" below).

---

## Repository layout (convention)

- /arrays
- /linkedlists
- /stacks-queues
- /trees
- /graphs
- /dynamic-programming
- /sorting
- /math
- /utils
- /notes — short writeups, complexity analyses, and todo items
- README.md (you are here)

File naming convention:
- LeetCode solutions: LeetCode{ID}_{ProblemName}.java  
  Example: `LeetCode2_AddTwoNumbers.java`
- Self-contained structure implementations: `LinkedList_Singly.java`, `Trie.java`
- Tests (if present): `tests/` or `src/test/java/`

Top of each Java file (recommended header):
```java
/**
 * Problem: Add Two Numbers
 * Source: LeetCode 2 (https://leetcode.com/problems/add-two-numbers/)
 * Difficulty: Medium
 * Date: 2025-06-01
 * Time: O(max(n, m))
 * Space: O(max(n, m))
 */
```

---

## How to compile & run (quick)

If files are plain Java with packages:

- Compile a single file:
  javac -d out src/your/package/LeetCode2_AddTwoNumbers.java

- Compile whole project (simple):
  find . -name "*.java" > sources.txt
  javac -d out @sources.txt

- Run a class with main:
  java -cp out your.package.LeetCode2_AddTwoNumbers

(If you add Maven/Gradle later, update this README with commands like `mvn test` or `./gradlew run`.)

---

## Progress tracking (real-time)

I keep progress visible so I can see how I'm improving:
- Commit history — each solved problem is a small milestone.
- Issues — I create issues for topics to study more or refactors I want to do.
- Optional: If I add a `PROGRESS.md` or GitHub Project board, I track weekly goals and solved counts.

Suggested short progress table (can put in PROGRESS.md):

| Date       | Problem (link)                       | Difficulty | Notes / Status |
|------------|---------------------------------------|------------|----------------|
| 2025-06-01 | LeetCode 2 — Add Two Numbers          | Medium     | Implemented; needs edge-case tests |
| 2025-06-02 | Binary Tree Inorder Traversal         | Easy       | Done; iterative and recursive |

---

## Learning notes & best practices I follow

- Write a short plan before coding (approach & complexity).
- Start with a correct, readable solution. Optimize only when necessary.
- Add tests for edge cases (empty inputs, single node, duplicates).
- Keep code modular and small. Extract helper methods when needed.
- When stuck, write pseudo-code or draw the structure.

---

## Contributing / Collaborating

This is primarily my learning repo, but contributions and suggestions are welcome.

If you want to contribute:
1. Fork the repo.
2. Create a branch: `feat/<topic>-<short-desc>`
3. Add your solution and tests.
4. Follow naming and header conventions.
5. Open a PR with a clear description.

Please be respectful — explain design choices and include complexity notes.

---

## Roadmap / TODO

- Add JUnit tests and a simple build (`pom.xml` or `build.gradle`).
- Add `PROGRESS.md` that automatically lists solved problems (manual for now).
- Implement more graph algorithms and dynamic programming examples.
- Add example interview-style README with common patterns and tips.

---

## License & Contact

- This repo is my personal study project.
- Maintainer: iamtahasc — https://github.com/iamtahasc