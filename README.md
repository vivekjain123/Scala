# Scala
Install sbt 

Install sbt 
https://www.scala-sbt.org/1.x/docs/Setup.html

create directory structure as below
src\main\scala\basics

Hello.scala in the basics directory using your favorite editor as follows:

package basics


object Hello extends App {
  println("Hello")
}

add below to PROJECT_DIR/project/plugins.sbt (this will enable you to import project to eclipse)
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.4")
source : https://github.com/sbt/sbteclipse

cd to project dir and type sbt, press enter
type eclipse and press enter

Go to eclipse and import existing projects to workspace.

Basics::
Values, Variables and Types.
Expressions and Functions.
Type Ineference.
Recursion.
Call-by-name and call by value.
Default and named arguments.
String operations.

OOP:
Basic structure.
Inheritance
Abstract classes and Traits
Generics
Anonymous Classes
Case classes


