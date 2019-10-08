package fr.umontpellier.polytech.tdd

import cats.data.NonEmptyList
import org.mockito.IdiomaticMockito
import org.scalacheck._
import org.scalatest.{FunSpec, Matchers}
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks

class StepSpec extends FunSpec with Matchers with ScalaCheckDrivenPropertyChecks with IdiomaticMockito {

  describe("A step") {
    it("should in order connect to the host, execute steps and disconnect from host") {
      pending
      // TODO https://github.com/mockito/mockito-scala#idiomatic-mockito
    }
  }

  describe("Step optimization phase") {

    it("should not do anything on a single simple step") {
      val singleStep = NonEmptyList.of(Step(host = Host("a"), "ls -al"))

      val optimizedStep = Step.optimize(singleStep)

      optimizedStep shouldBe singleStep
    }

    // TODO find a proper name for the test
    it("???") {
      pending
    }

    // TODO find a proper name for the test
    it("should enforce invariants ???") {
      pending

      // TODO create a random generator of steps for checking general rule
      // http://www.scalatest.org/user_guide/generator_driven_property_checks
      // https://github.com/typelevel/scalacheck/blob/master/doc/UserGuide.md#generating-case-classes
      def stepGenerator(hostGenerator: Gen[Host]): Gen[Step] = ???

      implicit val arbitraryStep: Arbitrary[List[Step]] = Arbitrary(Gen.listOf(stepGenerator(Gen.alphaLowerStr.map(Host.apply))))

      forAll { steps: List[Step] =>

        // TODO find a proper assertion to check general rule about your algorithm
        // what could be always true ?
      }
    }
  }

  override implicit val generatorDrivenConfig: PropertyCheckConfiguration = PropertyCheckConfig(minSize = 1, maxSize = 10, minSuccessful = 1000)

}
