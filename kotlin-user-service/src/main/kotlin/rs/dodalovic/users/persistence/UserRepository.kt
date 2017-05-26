package rs.dodalovic.users.persistence

import org.springframework.data.repository.CrudRepository
import rs.dodalovic.users.model.User

interface UserRepository : CrudRepository<User, String>