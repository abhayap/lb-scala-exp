/*
 * Copyright © 2012 - 2017 Lightbend, Inc. All rights reserved.
 */

package com.lightbend.training.scalatrain

import TestData._
import java.lang.{ IllegalArgumentException => IAE }
import org.scalatest.{ Matchers, WordSpec }

class TrainSpec extends WordSpec with Matchers {

  "Train 'green'" should {
    "stop in Nuremberg" in {
      green.timeAt(stuttgart) shouldEqual Some(greenStuttgartTime)
    }
    "not stop in Essen" in {
      green.timeAt(essen) shouldEqual None
    }
  }

  "Train 'red'" should {
    "stop in Munich" in {
      red.timeAt(munich) shouldEqual Some(redMunichTime)
    }
    "not stop in Stuttgart" in {
      red.timeAt(stuttgart) shouldEqual None
    }
  }

  "Creating a Train" should {
    "throw an IllegalArgumentException for a schedule with 0 or 1 elements" in {
      an[IAE] should be thrownBy Train(InterCityExpress(724), Vector())
      an[IAE] should be thrownBy Train(InterCityExpress(724), Vector(greenMunichTime -> munich))
    }
  }

  "stations" should {
    "be initialized correctly" in {
      green.stations shouldEqual Vector(frankfurt, bonn, stuttgart, munich)
    }
  }
}
