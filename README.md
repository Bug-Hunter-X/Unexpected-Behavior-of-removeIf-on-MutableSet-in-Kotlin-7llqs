# Unexpected Behavior of removeIf on MutableSet in Kotlin

This repository demonstrates an unexpected behavior of the `removeIf` function when used with `MutableSet` in Kotlin.  The `removeIf` function works as expected with `MutableList`, but its behavior differs significantly with `MutableSet`.

## Bug
The `removeIf` function on a `MutableSet` does not remove all the elements that satisfy the predicate.  It may remove elements inconsistently. This can be a subtle and difficult to debug issue.

## Solution
The solution involves using an iterator to iterate through the set and remove elements explicitly.  This ensures that all elements satisfying the predicate are removed reliably.
