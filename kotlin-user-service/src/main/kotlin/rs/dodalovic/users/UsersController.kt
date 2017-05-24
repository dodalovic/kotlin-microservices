package rs.dodalovic.users

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import rs.dodalovic.users.model.UserDTO
import rs.dodalovic.users.model.toUser
import rs.dodalovic.users.model.toUserDTO
import rs.dodalovic.users.persistence.UserRepository

@RestController
class UsersController(val userRepo: UserRepository) {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/users/{userId}")
    fun getUser(@PathVariable userId: String) : UserDTO {
        return userRepo.findOne(userId).toUserDTO()
    }

    @ResponseStatus(HttpStatus.CREATED)
    @GetMapping("/users")
    fun createUser(@RequestBody userDTO: UserDTO) : ResponseEntity {
        return userRepo.save(userDTO.toUser()).toUserDTO()
    }
}