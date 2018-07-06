initial-state

# Exercise > Initial State

- We start from where we ended in the `Lightbend Scala Language - Professional`
  course.

- Use the `test` command which should produce similar output to what is shown
  below. All tests should pass.

```scala
man [e] > scalatrain > initial-state > test
[info] Updating {file:/Users/ericloots/Trainingen/LightbendTraining/LSL-P-lightbend-scala-language-professional/}exercise_000_initial_state...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Compiling 3 Scala sources to /Users/ericloots/Trainingen/LightbendTraining/LSL-P-lightbend-scala-language-professional/exercise_000_initial_state/target/scala-2.11/classes...
[info] Compiling 4 Scala sources to /Users/ericloots/Trainingen/LightbendTraining/LSL-P-lightbend-scala-language-professional/exercise_000_initial_state/target/scala-2.11/test-classes...
[info] TimeSpec:
[info] Calling fromJson
[info] - should return None for an invalid json
[info] - should return Some wrapping a properly initialized Time for a valid JsonOject
[info] Calling fromJson after toJson
[info] - should return Some wrapping the original Time
[info] Creating a Time
[info] - should throw an IllegalArgumentException for hours not within 0 and 23
[info] - should throw an IllegalArgumentException for minutes not within 0 and 59
[info] The default arguments for hours and minutes
[info] - should be equal to 0
[info] asMinutes
[info] - should be initialized correctly
[info] Calling minus or -
[info] - should return the correct difference in minutes
[info] Calling toString
[info] - should return a properly formatted string representation
[info] Calling Ordered operators
[info] - should work as expected
[info] TrainSpec:
[info] Train ice724
[info] - should stop in Nurember
[info] - should not stop in Essen
[info] Train ice726
[info] - should stop in Munich
[info] - should not stop in Cologne
[info] Creating a Train
[info] - should throw an IllegalArgumentException for a schedule with 0 or 1 elements
[info] stations
[info] - should be initialized correctly
[info] JourneyPlannerSpec:
[info] stations
[info] - should be initialized correctly
[info] Calling trainsAt
[info] - should return the correct trains
[info] Calling stopsAt
[info] - should return the correct stops
[info] Calling isShortTrip
[info] - should return false for more than one station in between
[info] - should return true for zero or one stations in between
[info] Run completed in 849 milliseconds.
[info] Total number of tests run: 21
[info] Suites: completed 3, aborted 0
[info] Tests: succeeded 21, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 8 s, completed Jul 13, 2017 5:52:53 PM
```

- Use the `nextExercise` command to move to the next exercise.
