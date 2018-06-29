# API Nota Fiscal Eletronica
## Listagem de Companhias

{
  "companies": [
    {
      "id": "string",
      "name": "string",
      "tradeName": "string",
      "federalTaxNumber": 0,
      "email": "string",
      "address": {
        "country": "string",
        "postalCode": "string",
        "street": "string",
        "number": "string",
        "additionalInformation": "string",
        "district": "string",
        "city": {
          "code": "string",
          "name": "string"
        },
        "state": "string"
      },
      "openningDate": "2018-04-25T01:32:56.642Z",
      "taxRegime": "Isento",
      "specialTaxRegime": "Automatico",
      "legalNature": "EmpresaPublica",
      "economicActivities": [
        {
          "type": "Main",
          "code": 0
        }
      ],
      "companyRegistryNumber": 0,
      "regionalTaxNumber": 0,
      "municipalTaxNumber": "string",
      "rpsSerialNumber": "string",
      "rpsNumber": 0,
      "environment": "Development",
      "fiscalStatus": "CityNotSupported",
      "certificate": {
        "thumbprint": "string",
        "modifiedOn": "2018-04-25T01:32:56.643Z",
        "expiresOn": "2018-04-25T01:32:56.643Z",
        "status": "Overdue"
      },
      "createdOn": "2018-04-25T01:32:56.643Z",
      "modifiedOn": "2018-04-25T01:32:56.643Z"
    }
  ],
  "totalResults": 0,
  "totalPages": 0,
  "page": 0
}

## Listagem de pessoas jurídicas
{
  "id": "string",
  "name": "string",
  "tradeName": "string",
  "federalTaxNumber": 0,
  "email": "string",
  "address": {
    "country": "string",
    "postalCode": "string",
    "street": "string",
    "number": "string",
    "additionalInformation": "string",
    "district": "string",
    "city": {
      "code": "string",
      "name": "string"
    },
    "state": "string"
  },
  "openningDate": "2018-04-25T01:43:28.143Z",
  "taxRegime": "Isento",
  "legalNature": "EmpresaPublica",
  "economicActivities": [
    {
      "type": "Main",
      "code": 0
    }
  ],
  "companyRegistryNumber": 0,
  "regionalTaxNumber": 0,
  "municipalTaxNumber": "string",
  "status": "Inactive",
  "createdOn": "2018-04-25T01:43:28.143Z",
  "modifiedOn": "2018-04-25T01:43:28.143Z"
}

## Listagem de Pessoas Físicas
{
  "naturalPeople": [
    {
      "id": "string",
      "name": "string",
      "federalTaxNumber": 0,
      "email": "string",
      "address": {
        "country": "string",
        "postalCode": "string",
        "street": "string",
        "number": "string",
        "additionalInformation": "string",
        "district": "string",
        "city": {
          "code": "string",
          "name": "string"
        },
        "state": "string"
      },
      "birthDate": "2018-04-25T01:43:33.855Z",
      "idNumber": "string",
      "status": "Inactive",
      "createdOn": "2018-04-25T01:43:33.855Z",
      "modifiedOn": "2018-04-25T01:43:33.855Z"
    }
  ],
  "totalResults": 0,
  "totalPages": 0,
  "page": 0
}

## Listagem de Notas Fiscais
{
  "serviceInvoices": [
    {
      "id": "string",
      "environment": "Development",
      "flowStatus": "CancelFailed",
      "flowMessage": "string",
      "provider": {
        "tradeName": "string",
        "openningDate": "2018-04-25T01:43:42.182Z",
        "taxRegime": "Isento",
        "specialTaxRegime": "Automatico",
        "legalNature": "EmpresaPublica",
        "economicActivities": [
          {
            "type": "Main",
            "code": 0
          }
        ],
        "companyRegistryNumber": 0,
        "regionalTaxNumber": 0,
        "municipalTaxNumber": "string",
        "issRate": 0,
        "parentId": "string",
        "id": "string",
        "name": "string",
        "federalTaxNumber": 0,
        "email": "string",
        "address": {
          "country": "string",
          "postalCode": "string",
          "street": "string",
          "number": "string",
          "additionalInformation": "string",
          "district": "string",
          "city": {
            "code": "string",
            "name": "string"
          },
          "state": "string"
        },
        "status": "Inactive",
        "type": "Undefined",
        "createdOn": "2018-04-25T01:43:42.182Z",
        "modifiedOn": "2018-04-25T01:43:42.182Z"
      },
      "borrower": {
        "parentId": "string",
        "id": "string",
        "name": "string",
        "federalTaxNumber": 0,
        "email": "string",
        "address": {
          "country": "string",
          "postalCode": "string",
          "street": "string",
          "number": "string",
          "additionalInformation": "string",
          "district": "string",
          "city": {
            "code": "string",
            "name": "string"
          },
          "state": "string"
        },
        "status": "Inactive",
        "type": "Undefined",
        "createdOn": "2018-04-25T01:43:42.182Z",
        "modifiedOn": "2018-04-25T01:43:42.182Z"
      },
      "batchNumber": 0,
      "batchCheckNumber": "string",
      "number": 0,
      "checkCode": "string",
      "status": "Error",
      "rpsType": "Rps",
      "rpsStatus": "Normal",
      "taxationType": "None",
      "issuedOn": "2018-04-25T01:43:42.182Z",
      "cancelledOn": "2018-04-25T01:43:42.182Z",
      "rpsSerialNumber": "string",
      "rpsNumber": 0,
      "cityServiceCode": "string",
      "federalServiceCode": "string",
      "description": "string",
      "servicesAmount": 0,
      "deductionsAmount": 0,
      "discountUnconditionedAmount": 0,
      "discountConditionedAmount": 0,
      "baseTaxAmount": 0,
      "issRate": 0,
      "issTaxAmount": 0,
      "irAmountWithheld": 0,
      "pisAmountWithheld": 0,
      "cofinsAmountWithheld": 0,
      "csllAmountWithheld": 0,
      "inssAmountWithheld": 0,
      "issAmountWithheld": 0,
      "othersAmountWithheld": 0,
      "amountWithheld": 0,
      "amountNet": 0,
      "approximateTax": {
        "source": "string",
        "version": "string",
        "totalRate": 0
      },
      "createdOn": "2018-04-25T01:43:42.183Z",
      "modifiedOn": "2018-04-25T01:43:42.183Z"
    }
  ],
  "totalResults": 0,
  "totalPages": 0,
  "page": 0
}


-- APIs disponibilizadas e utilizadas como exemplo do site https://api.nfe.io/ 