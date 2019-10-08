# Testing in Scala

The purpose of this exercise is to work with:
* [Scalatest](http://www.scalatest.org)
* [Mockito for Scala](https://github.com/mockito/mockito-scala) 
* [Scalacheck](https://www.scalacheck.org)

# How to install
The project uses SBT, simple run the following command to setup your env.
``` sbt test``` and here you go.

# The goal
You are working a remote control system.
The plan of command is an ORDERED sequence of individual steps.
Each step must connect to a given host and execute some commands on it.

For efficiency and safety of execution, you need to make as few connection as possible.

Write an algorithm to optimize a list of steps.