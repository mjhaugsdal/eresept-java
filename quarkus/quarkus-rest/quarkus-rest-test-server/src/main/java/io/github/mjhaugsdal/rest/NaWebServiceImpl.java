package io.github.mjhaugsdal.rest;


import io.github.mjhaugsdal.rest.types.na.AppRec;
import io.github.mjhaugsdal.rest.types.na.AppRecFault_Exception;
import io.github.mjhaugsdal.rest.types.na.M9Na1;
import io.github.mjhaugsdal.rest.types.na.M9Na2;
import io.github.mjhaugsdal.rest.types.na.M9Na3;
import io.github.mjhaugsdal.rest.types.na.M9Na4;
import io.github.mjhaugsdal.rest.types.na.MV;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class NaWebServiceImpl implements NaWebService {

    private static final Logger LOGGER = LoggerFactory.getLogger(NaWebServiceImpl.class.getName());


    public AppRec naWebServiceVerify(MV parameters) {
        var response = new AppRec();
        response.setDokument(parameters.getDokument());
        return response;
    }

    public M9Na2 naWebServiceM9Na1(M9Na1 parameters) throws AppRecFault_Exception {
        var response = new M9Na2();
        response.setDokument(parameters.getDokument());
        return response;
    }

    public M9Na4 naWebServiceM9Na3(M9Na3 parameters) throws AppRecFault_Exception {
        var response = new M9Na4();
        response.setDokument(parameters.getDokument());
        return response;
    }
}
