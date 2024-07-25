package com.tati.classes_platform.infrastructure.abstract_services;

import com.tati.classes_platform.api.dto.request.StudentRequest;
import com.tati.classes_platform.api.dto.response.StudentResponseDetails;
import com.tati.classes_platform.api.dto.response.responseBasic.StudentResponse;
import com.tati.classes_platform.infrastructure.interfaces.Create;
import com.tati.classes_platform.infrastructure.interfaces.FindAllByName;

public interface IStudentService
    extends FindAllByName<StudentResponseDetails>, Create<StudentRequest, StudentResponse> {

}
