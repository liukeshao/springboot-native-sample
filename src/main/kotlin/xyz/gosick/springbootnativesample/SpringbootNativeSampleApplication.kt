package xyz.gosick.springbootnativesample

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootNativeSampleApplication

fun main(args: Array<String>) {
	runApplication<SpringbootNativeSampleApplication>(*args)
}
