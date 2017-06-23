/**
 * FileName      : $Id: NbnAssembler.java $
 *
 * Copyright Notice: ©2004 Singapore Telecom Pte Ltd -- Confidential and Proprietary
 *
 * All rights reserved.
 * This software is the confidential and proprietary information of SingTel Pte Ltd
 * ("Confidential Information"). You shall not disclose such Confidential Information
 * and shall use it only in accordance with the terms of the license agreement you
 * entered into with SingTel.
 */
package au.com.optus.mcas.sdp.infraservice.nbnapp.service.assembler;

import au.com.optus.mcas.sdp.nbnapp.model.CheckAvailableAppointmentNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CheckAvailableAppointmentNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateAppointmentNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateAppointmentNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateServiceOrderNotificationRequestModel;
import au.com.optus.mcas.sdp.nbnapp.model.CreateServiceOrderNotificationResponseModel;
import au.com.optus.mcas.sdp.nbnapp.model.Resource;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CheckAvailableAppointmentNotificationRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CheckAvailableAppointmentNotificationResponse;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CreateAppointmentNotificationRequest;
import au.com.singtel.group.appointmentservice.v2_0.appointmentservice.CreateAppointmentNotificationResponse;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CreateServiceOrderNotificationRequest;
import au.com.singtel.group.serviceorderservice.v2_0.serviceorderservice.CreateServiceOrderNotificationResponse;
import org.dozer.DozerBeanMapperSingletonWrapper;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


/**
 * @author optus
 *
 */

@Component
public final class NbnAppAssembler {

    protected static final Logger LOGGER = LoggerFactory.getLogger(NbnAppAssembler.class);

    private static final Mapper BEAN_MAPPER = DozerBeanMapperSingletonWrapper.getInstance();

    /**
    *
    */
    private NbnAppAssembler() {

    }

    /**
    *
    * @param <T>
    *            destination type
    * @param destinationType
    *            destination type
    * @param source
    *            - source object
    * @param destinationType
    * @return <T> destination object
    */
    public static <T> T map(final Object source, final Class<T> destinationType) {
        if (source == null) {
            return null;
        }
        return BEAN_MAPPER.map(source, destinationType);
    }
    
    
    public static CreateServiceOrderNotificationRequestModel convertcreateServiceOrderNotificationRequestDTOtoModel(
        CreateServiceOrderNotificationRequest createServiceOrderNotificationRequestDto) {
        LOGGER.info("==========START of the method convertcreateServiceOrderNotificationRequestDTOtoModel()=========");
        
        au.com.singtel.group.cdm.v2_0_0.resource.Resource resource = createServiceOrderNotificationRequestDto.getResource();
        
        
        CreateServiceOrderNotificationRequestModel modelRequest =
            BEAN_MAPPER.map(createServiceOrderNotificationRequestDto, CreateServiceOrderNotificationRequestModel.class);
        
        
        Resource resource1=  BEAN_MAPPER.map(resource, Resource.class);
                      
        modelRequest.setResource(resource1);
        LOGGER.info("==========END of the method convertcreateServiceOrderNotificationRequestDTOtoModel()=========== ");
        return modelRequest;
    }

    public static CreateServiceOrderNotificationResponse convertcreateServiceOrderNotificationToDTO(
        CreateServiceOrderNotificationResponseModel createServiceOrderNotificationResponseModel) {
        LOGGER.info("==========START of the method convertcreateServiceOrderNotificationToDTO()=========");
        CreateServiceOrderNotificationResponse response =
            BEAN_MAPPER.map(createServiceOrderNotificationResponseModel, CreateServiceOrderNotificationResponse.class);
        LOGGER.info("==========END of the method convertcreateServiceOrderNotificationToDTO()=========== ");
        return response;
    }

    public static CreateAppointmentNotificationRequestModel convertcreateAppointmentNotificationRequestDtoToModel(
        CreateAppointmentNotificationRequest createAppointmentNotificationRequestDto) {
        LOGGER.info("==========START of the method convertcreateAppointmentNotificationRequestDtoToModel()=========");
        CreateAppointmentNotificationRequestModel modelRequest =
            BEAN_MAPPER.map(createAppointmentNotificationRequestDto, CreateAppointmentNotificationRequestModel.class);
        
        LOGGER.info("==========END of the method convertcreateAppointmentNotificationRequestDtoToModel()=========== ");
        return modelRequest;
    }

    public static CreateAppointmentNotificationResponse convertCreateAppointmentNotificationResponseModelToDTO(
        CreateAppointmentNotificationResponseModel createAppointmentNotificationResponseModel) {
        LOGGER.info("==========START of the method convertCreateAppointmentNotificationResponseModelToDTO()=========");
        CreateAppointmentNotificationResponse response =
            BEAN_MAPPER.map(createAppointmentNotificationResponseModel, CreateAppointmentNotificationResponse.class);
        LOGGER.info("==========END of the method convertCreateAppointmentNotificationResponseModelToDTO()=========== ");
        return response;
    }

    public static CheckAvailableAppointmentNotificationRequestModel convertCheckAvailableAppointmentNotificationRequestDtoToModel(
        CheckAvailableAppointmentNotificationRequest checkAvailableAppointmentNotificationRequestDto) {
        LOGGER.info("==========START of the method convertCheckAvailableAppointmentNotificationRequestDtoToModel()=========");
        CheckAvailableAppointmentNotificationRequestModel modelRequest =
            BEAN_MAPPER.map(checkAvailableAppointmentNotificationRequestDto, CheckAvailableAppointmentNotificationRequestModel.class);
        
        LOGGER.info("==========END of the method convertCheckAvailableAppointmentNotificationRequestDtoToModel()=========== ");
        return modelRequest;
    }

    public static CheckAvailableAppointmentNotificationResponse convertCheckAvailableAppointmentNotificationResponseModelToDTO(
        CheckAvailableAppointmentNotificationResponseModel checkAvailableAppointmentNotificationResponseModel) {
        LOGGER.info("==========START of the method convertCheckAvailableAppointmentNotificationResponseModelToDTO()=========");
        CheckAvailableAppointmentNotificationResponse response =
            BEAN_MAPPER.map(checkAvailableAppointmentNotificationResponseModel, CheckAvailableAppointmentNotificationResponse.class);
        LOGGER.info("==========END of the method convertCheckAvailableAppointmentNotificationResponseModelToDTO()=========== ");
        return response;
    }
   
}
