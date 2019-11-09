package com.sookiwi.kotlinplayground.leet359

import io.kotlintest.shouldBe
import io.kotlintest.specs.StringSpec

private val logger: Logger = Logger()

class LoggerTest: StringSpec({
    "test" {
        logger.shouldPrintMessage(1, "foo") shouldBe true
        logger.shouldPrintMessage(2,"bar") shouldBe true
        logger.shouldPrintMessage(3,"foo") shouldBe false
        logger.shouldPrintMessage(8,"bar") shouldBe false
        logger.shouldPrintMessage(10,"foo") shouldBe false
        logger.shouldPrintMessage(11,"foo") shouldBe true
    }
})
