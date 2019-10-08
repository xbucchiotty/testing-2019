package fr.umontpellier.polytech.tdd


case class Host(value: String) {

  def connect(): Unit = println(s"Connecting to $value")

  def execute(command: String): Unit = println(s"Executing :$command")

  def disconnect(): Unit = println(s"Disconnecting from $value")

}