package rs.dodalovic.users.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "users")
class User(@Id val id: String? = null,
           val email: String = "",
           val name: String = "",
           val lastname: String = "")

fun User.toUserDTO(): UserDTO = UserDTO(this.email, this.name, this.lastname)
