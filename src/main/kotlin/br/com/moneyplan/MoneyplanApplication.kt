package br.com.moneyplan

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MoneyplanApplication

fun main(args: Array<String>) {
	runApplication<MoneyplanApplication>(*args)
}
