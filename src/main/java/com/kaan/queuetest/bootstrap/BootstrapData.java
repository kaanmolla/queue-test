package com.kaan.queuetest.bootstrap;

import com.kaan.queuetest.entity.Content;
import com.kaan.queuetest.entity.User;
import com.kaan.queuetest.repository.ContentRepository;
import com.kaan.queuetest.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

  private final UserRepository userRepository;
  private final ContentRepository contentRepository;

  public BootstrapData(UserRepository userRepository, ContentRepository contentRepository) {
    this.userRepository = userRepository;
    this.contentRepository = contentRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    User user = new User();
    user.setFirstName("Kaan");
    user.setLastName("Molla");
    user.setEmail("kaan@kaan.com");

    Content content = new Content();
    content.setDocumentId("abc");
    content.setOwner(user);

    user.getContents().add(content);

    userRepository.save(user);
    contentRepository.save(content);
  }

}
