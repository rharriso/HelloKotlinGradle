/**
 * Created by rharriso on 7/2/16.
 */

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper


data class User(val email : String, val name : String)
data class Annotation(val url : String)

val mapper = jacksonObjectMapper()


fun main(args: Array<String>) {
    var u = mapper.readValue("""{
        "email": "rtharrison86@gmail.com",
        "name": "Ross Harrison"
    }""", User::class.java)
    var a : Annotation = Annotation("nytimes.com")
    println(u)
    println(a)

    println(mapper.writeValueAsString(u))
    println(mapper.writeValueAsString(a))
}
