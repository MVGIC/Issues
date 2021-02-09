package ru.netology.repository;

import ru.netology.domain.Issue;

import java.util.ArrayList;
import java.util.Collection;

public class IssueRepository {

    private Collection<Issue> issues = new ArrayList<>();

    public boolean add(Issue issue) {
        return issues.add(issue);
    }

    public Collection<Issue> findAll() {
        return issues;
    }
}
