package example.demo.service.topic;

import example.demo.model.Topic;

import java.util.List;
import java.util.Optional;

public interface TopicService {
    Topic save(Topic topic);

    Optional<Topic> getTopicById(int id);

    void delete(int id);

    List<Topic> getTopics();
}
