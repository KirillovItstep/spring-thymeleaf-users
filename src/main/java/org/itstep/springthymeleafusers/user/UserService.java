package org.itstep.springthymeleafusers.user;

import org.itstep.springthymeleafusers.MyUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {
        @Autowired
        private UserRepository userRepository;

        public List<User> findAll() {
            return userRepository.findAll();
        }

        public User save(User user) {
            return userRepository.save(user);
        }

        public User findById(Long id) {
            return userRepository.findById(id).get();
        }

        public void deleteById(Long id) {
            userRepository.deleteById(id);
        }

        public User getUserByUsername(String name){
            return userRepository.getUserByUsername(name);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.getUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
        return new MyUserDetails(user);
    }
}

