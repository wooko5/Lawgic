package com.asiana.lawgic.lawgic.service;

import com.asiana.lawgic.lawgic.dto.ConsultDTO;
import com.asiana.lawgic.lawgic.entity.Consult;

public interface ConsultService {
    void insertConsult(ConsultDTO consultDTO) throws Exception;
}
