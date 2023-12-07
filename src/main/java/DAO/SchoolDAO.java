package DAO;

import bean.School;

public interface SchoolDAO {
    School findSchoolById(int id);

    School createSchool(School school);

    School updateSchool(School school);

    void removeSchool(int id);
    void close();
}
