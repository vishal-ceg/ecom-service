package com.csw.ingestion.api.constants;

import com.csw.ingestion.api.exception.InvalidParameterException;

public enum DataMappingType {
    CWE("cwe");

    private final String type;

    DataMappingType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static boolean isValidParseType(String name) {
        for (DataMappingType dataMappingType : DataMappingType.values()) {
            if ( dataMappingType.name().equalsIgnoreCase(name) ) {
                return true;
            }
        }
        return false;
    }

    public static DataMappingType forNameIgnoreCase(String name) throws InvalidParameterException {
        for (DataMappingType dataMappingType : DataMappingType.values()) {
            if ( dataMappingType.name().equalsIgnoreCase(name) ) {
                return dataMappingType;
            }
        }
        throw new InvalidParameterException("Invalid data mapping type. The data mapping type should be any of the one (CWE)");
    }
}
