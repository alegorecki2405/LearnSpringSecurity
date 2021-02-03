package olek.gorecki.sec.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static olek.gorecki.sec.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ,
            COURSE_WRITE,
            STUDENT_READ,
            STUDENT_WRITE));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permission) {
        this.permissions = permission;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
