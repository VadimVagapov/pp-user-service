package ru.vagapov.userapi.service.impl;

import ru.vagapov.userapi.entity.UserEntity;
import ru.vagapov.userapi.service.UserService;

import java.time.LocalDate;
import java.util.List;

public class UserServiceImpl implements UserService {

    public void createUsersTable() {

    }

    public void dropUsersTable() {

    }

    public void saveUser(String firstName,
                         String lastName,
                         LocalDate birthDate,
                         String birthPlace,
                         Byte age) {

    }

    public void removeUserById(Long id) {

    }

    public List<UserEntity> getAllUsers() {
        return null;
    }

    public void cleanUsersTable() {

    }
}
