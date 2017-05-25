package rs.dodalovic.users

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriComponentsBuilder
import rs.dodalovic.users.model.UserDTO
import rs.dodalovic.users.model.toUser
import rs.dodalovic.users.model.toUserDTO
import rs.dodalovic.users.persistence.UserRepository
import java.net.URI

@RestController
class UsersController(val userRepo: UserRepository) {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/{userId}")
    fun getUser(@PathVariable userId: String): UserDTO {
        return userRepo.findOne(userId).toUserDTO()
    }

    @PostMapping("/users")
    fun createUser(@RequestBody userDTO: UserDTO, builder: UriComponentsBuilder): ResponseEntity<Unit> {
        val createdUserURI = builder.path("/{userId}").buildAndExpand(userRepo.save(userDTO.toUser()).id).toUriString()
        return ResponseEntity.created(URI(createdUserURI)).build()
    }
}