Summary
=======

Approvals tests are useful when

1. You don't know what you want to test for, but you'll know it when you see it.
2. You do know what you want to test for, but it's complicated.
3. Retrofitting tests to existing code.

Steps

1. Find a form of test result that is stable and easily compared.
2. Eyeball it and decide when it's right.
3. When it is, make it approved in the test or a file and have future test runs
   compare their results against the approved version.
4. If the results differ, use a differ.

Resources

- @duncanmcg
- [Llewellyn Falco](http://approvaltests.sourceforge.net/)
- [Okey-doke](http://github.com/dmcg/okeydoke)
- [Fakir](http://github.com/dmcg/fakir)