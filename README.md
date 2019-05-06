# kotlin-redundant-suspend-bug
The Kotlin compiler emits a warning when a function passed to a suspending inline function is marked with the suspend keyword. In certain circumstances, removing that suspend keyword from the parameter causes compile errors at the call site. This project highlights one such case.
