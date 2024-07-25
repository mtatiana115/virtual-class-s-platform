package com.tati.classes_platform.infrastructure.abstract_services;

import com.tati.classes_platform.api.dto.response.StudentResponseDetails;
import com.tati.classes_platform.infrastructure.interfaces.FindAllByName;

public interface IStudentService extends FindAllByName<StudentResponseDetails> {

}
