package ru.netology.manager;

import ru.netology.domain.Issue;
import ru.netology.repository.IssueRepository;

public class IssueManager {

    private IssueRepository repository;

    public IssueManager(IssueRepository repository) {
        this.repository = repository;
    }

    public void save(Issue issue) {
        repository.add(issue);
    }

    public void getAll() {
        repository.findAll();
    }
}
