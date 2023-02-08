package br.com.moneyplan.controller

import br.com.moneyplan.model.Plan
import br.com.moneyplan.repository.PlanRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/plan")
@CrossOrigin(origins =["*"], allowedHeaders =["*"])
class PlanController {
    @Autowired
    var repository:PlanRepository? =null

//@GetMapping("/search")
//fun get(@PathVariable plan:String): ResponseEntity<MutableList<Plan>>{
//    return ResponseEntity.ok(repository!!.findAllByPlanContainingIgnoreCase(plan))
//}

@GetMapping
fun getAll(): ResponseEntity<MutableList<Plan>>{
    return ResponseEntity.ok(this.repository!!.findAll())
}

@PostMapping
fun post(@RequestBody plan: Plan): ResponseEntity<Plan> {
    return ResponseEntity.status(HttpStatus.OK).body(repository!!.save(plan))
}
}