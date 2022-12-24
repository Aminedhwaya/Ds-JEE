package de.tekup.studentsabsence.services;

import de.tekup.studentsabsence.entities.Group;
import de.tekup.studentsabsence.entities.GroupSubject;
import de.tekup.studentsabsence.entities.Subject;

import java.util.List;

public interface GroupSubjectService {
    void addSubjectToGroup(Group group, Subject subject, float hours);
    List<GroupSubject> getSubjectsByGroupId(Long id);
    void deleteSubjectFromGroup(Long gid, Long sid);

    Subject getMaxAbsenceSubject(List<GroupSubject> groupSubjects);
    Subject getMinAbsenceSubject(List<GroupSubject> groupSubjects);

    List<GroupSubject> getSubjectsGroupBySubjectId(Long sid);

    GroupSubject getSubjectsGroupBySubjectIdAndGroupId(Long sid,Long gid);
}
