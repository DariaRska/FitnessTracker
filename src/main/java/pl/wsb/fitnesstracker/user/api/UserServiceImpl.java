package pl.wsb.fitnesstracker.user.api;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.wsb.fitnesstracker.user.internal.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }


    @Override
    public List<SimpleUser> getAllSimpleUsers() {
        return userRepository.findAll().stream()
                .map(user -> new SimpleUser(
                        user.getId(),
                        user.getFirstName(),
                        user.getLastName()
                ))
                .toList();
    }
}

