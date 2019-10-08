package fr.umontpellier.polytech.tdd

import cats.data.NonEmptyList

case class Step(host: Host, commands: NonEmptyList[String]) {

  final def execute(): Unit = {
    host.connect()

    commands.toList.foreach(command => host.execute(command))

    host.disconnect()
  }

}

object Step {

  def optimize(steps: NonEmptyList[Step]): NonEmptyList[Step] = {
    // TODO do a proper implementation
    steps
  }

  def apply(host: Host, instruction: String): Step = Step(host, NonEmptyList.of(instruction))

}