package com.github.microcatalog.domain.custom.impact.analysis;

import com.github.microcatalog.service.dto.custom.MicroserviceDto;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Result {
    private Instant createdOn;
    private List<Group> groups = new ArrayList<>();
    private MicroserviceDto target;

    public Instant getCreatedOn() {
        return createdOn;
    }

    public Result createdOn(Instant createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    public void setCreatedOn(Instant createdOn) {
        this.createdOn = createdOn;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public Result groups(List<Group> releaseGroups) {
        this.groups = releaseGroups;
        return this;
    }

    public void addGroup(final Group group) {
        if (group == null) {
            return;
        }

        this.groups.add(group);
    }

    public void setGroups(List<Group> releaseGroups) {
        this.groups = releaseGroups;
    }

    public MicroserviceDto getTarget() {
        return target;
    }

    public Result target(MicroserviceDto microservice) {
        this.target = microservice;
        return this;
    }

    public void setTarget(MicroserviceDto microservice) {
        this.target = microservice;
    }
}
