# Reflection – AI Number Program Lab

##  Student Name:
Hayden Bourgeois

##  GitHub Repository Link:
https://github.com/ApertureAce/cmsc115_unit8_lab2

## Iteration 1

What the AI code does:
- The AI code does absolutely nothing except return 0 in the findResult() method.

Tests passed/failed:
- testBasicArray()
- testEmptyArray()
- testSingleValue()
- testNegativeNumbers()

What surprised you:
- I was not surprised by all the tests failing. The program has no functionality at this moment.

Commit message:
- Iteration 1: AI-generated implementation

---

## Iteration 2

What changed:
- New int variable, 'largest' which initializes with the value at values[0]
- A for loop iterates through the array and assigns 'largest' with iterated value if it's larger than the previous.
- A return statement for 'largest'

What improved:
- There's an actual program here now, all the contents inside findResult() changed.

What still failed and why:
- testEmptyArray() failed because the method, findResult() has no safeguards for null parameters.

Commit message:
- Iteration 2: largest value implementation

---

## Iteration 3

Final behavior:
- Program firsts checks if values.length == 0, if so, it returns Java's default MIN_VALUE final int.

What was fixed:
- The program can now evaluate an empty array without exceptions/errors.

What you learned:
- Given accurate and precisely worded, prompts Generative AIs can quickly generate code for tasks that are tedious and menial. 

Commit message:
- Iteration 3: final version passing all tests

---

## Final Reflection

- How did AI responses change across prompts?

The AI wasn't entirely sure what connection was being made between the first and second iterations. The AI created a new method altogether on Iteration 2 called, 'findLargest' because the prompt didn't specify was changes were being made. On iteration 3, I specified the current working code, which the AI had no issues with filling generating code for the rest of the program's requirements.
- How did testing affect your changes?

Testing affected my changes because I was also confused about what was expected of the program. After inspecting the test file, I realized that findResult was the only method being tested, so I deduced that 'findLargest()' was actually supposed to be part of 'findResult()'. With that in mind, I made the appropriate changes.
- What did version control help you understand?

Version control gave me a better understanding of the workflow for commit and push. It also gave me a better understanding of the difference between a "commit" and a "push." Now, I think I have a better understanding of how Version Control works as a concept.