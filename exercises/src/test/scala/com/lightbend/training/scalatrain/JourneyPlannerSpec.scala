/*
 * Copyright © 2012 - 2017 Lightbend, Inc. All rights reserved.
 */

package com.lightbend.training.scalatrain

import TestData._
import java.lang.{ IllegalArgumentException => IAE }
import org.scalatest.{ Matchers, WordSpec }

class JourneyPlannerSpec extends WordSpec with Matchers {

  "stations" should {
    "be initialized correctly" in {
      planner.stations shouldEqual Set(munich, dusseldorf, frankfurt, stuttgart, essen, bonn)
    }
  }

  "Calling trainsAt" should {
    "return the correct trains" in {
      planner.trainsAt(munich) shouldEqual Set(green, red, orange)
      planner.trainsAt(stuttgart) shouldEqual Set(green, orange)
    }
  }

  "Calling stopsAt" should {
    "return the correct stops" in {
      planner.stopsAt(munich) shouldEqual Set(greenMunichTime -> green, redMunichTime -> red, orangeMunichTime -> orange)
    }
  }

  "Calling isShortTrip" should {
    "return false for more than one station in between" in {
      planner.isShortTrip(essen, frankfurt) shouldBe false
      planner.isShortTrip(dusseldorf, stuttgart) shouldBe false
    }
    "return true for zero or one stations in between" in {
      planner.isShortTrip(frankfurt, munich) shouldBe true
      planner.isShortTrip(stuttgart, frankfurt) shouldBe true
      planner.isShortTrip(dusseldorf, frankfurt) shouldBe true
      planner.isShortTrip(dusseldorf, essen) shouldBe true
    }
  }
}
