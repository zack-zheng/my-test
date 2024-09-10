package com.zzz.test.my_test;

import java.util.List;

public class Demo {


    private MetaDataBean metaData;
    private FormContentBean formContent;

    public MetaDataBean getMetaData() {
        return metaData;
    }

    public void setMetaData(MetaDataBean metaData) {
        this.metaData = metaData;
    }

    public FormContentBean getFormContent() {
        return formContent;
    }

    public void setFormContent(FormContentBean formContent) {
        this.formContent = formContent;
    }

    public static class MetaDataBean {
        /**
         * caseNo : 100200
         * inputter : inputter1
         * type : reg
         * subType :
         * round : 0
         * ddeType : form
         */

        private String caseNo;
        private String inputter;
        private String type;
        private String subType;
        private int round;
        private String ddeType;

        public String getCaseNo() {
            return caseNo;
        }

        public void setCaseNo(String caseNo) {
            this.caseNo = caseNo;
        }

        public String getInputter() {
            return inputter;
        }

        public void setInputter(String inputter) {
            this.inputter = inputter;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getSubType() {
            return subType;
        }

        public void setSubType(String subType) {
            this.subType = subType;
        }

        public int getRound() {
            return round;
        }

        public void setRound(int round) {
            this.round = round;
        }

        public String getDdeType() {
            return ddeType;
        }

        public void setDdeType(String ddeType) {
            this.ddeType = ddeType;
        }
    }

    public static class FormContentBean {
        /**
         * trusteeId : 8F756DF2AC5A45E8AD2741E5C1586AB4
         */

        private String trusteeId;
        private TrusteeDetailsDtoBean trusteeDetailsDto;
        private TrusteeBankDetailsDtoBean trusteeBankDetailsDto;

        public String getTrusteeId() {
            return trusteeId;
        }

        public void setTrusteeId(String trusteeId) {
            this.trusteeId = trusteeId;
        }

        public TrusteeDetailsDtoBean getTrusteeDetailsDto() {
            return trusteeDetailsDto;
        }

        public void setTrusteeDetailsDto(TrusteeDetailsDtoBean trusteeDetailsDto) {
            this.trusteeDetailsDto = trusteeDetailsDto;
        }

        public TrusteeBankDetailsDtoBean getTrusteeBankDetailsDto() {
            return trusteeBankDetailsDto;
        }

        public void setTrusteeBankDetailsDto(TrusteeBankDetailsDtoBean trusteeBankDetailsDto) {
            this.trusteeBankDetailsDto = trusteeBankDetailsDto;
        }

        public static class TrusteeDetailsDtoBean {
            /**
             * regisAddrDto : {"room":"710","floor":"7","block":"10","building":"DEF Building","street":"1 DEF Road","districtArea":"Kowloon","country":"CN"}
             * correspondenceAddrDto : {"city":"HK","postalCode":"000","effectiveDate":"Nov 8, 2022, 10:57:38 AM","room":"710","floor":"7","block":"10","building":"DEF Building","street":"1 DEF Road","districtArea":"Kowloon","country":"CN"}
             */

            private TrusteeInformationDtoBean trusteeInformationDto;
            private RegisAddrDtoBean regisAddrDto;
            private CorrespondenceAddrDtoBean correspondenceAddrDto;

            public TrusteeInformationDtoBean getTrusteeInformationDto() {
                return trusteeInformationDto;
            }

            public void setTrusteeInformationDto(TrusteeInformationDtoBean trusteeInformationDto) {
                this.trusteeInformationDto = trusteeInformationDto;
            }

            public RegisAddrDtoBean getRegisAddrDto() {
                return regisAddrDto;
            }

            public void setRegisAddrDto(RegisAddrDtoBean regisAddrDto) {
                this.regisAddrDto = regisAddrDto;
            }

            public CorrespondenceAddrDtoBean getCorrespondenceAddrDto() {
                return correspondenceAddrDto;
            }

            public void setCorrespondenceAddrDto(CorrespondenceAddrDtoBean correspondenceAddrDto) {
                this.correspondenceAddrDto = correspondenceAddrDto;
            }

            public static class TrusteeInformationDtoBean {
                /**
                 * trusteeCode : AIA
                 * trusteeNameEng : AIA Company (Trustee) Limited
                 * trusteeNameChi : ????????????..
                 * trusteeApprovalNumber : TC00073
                 * facsimileNumber : 10086
                 * trusteeStatus : success
                 * effectiveDate : Nov 8, 2022, 10:57:38 AM
                 * trusteeApprovalDate : Nov 8, 2022, 10:57:38 AM
                 * trusteeDisapprovalDate : TrusteeDisapprovalDate
                 */

                private String trusteeCode;
                private String trusteeNameEng;
                private String trusteeNameChi;
                private String trusteeApprovalNumber;
                private int facsimileNumber;
                private String trusteeStatus;
                private String effectiveDate;
                private String trusteeApprovalDate;
                private String trusteeDisapprovalDate;
                private List<PhoneDtoListBean> PhoneDtoList;

                public String getTrusteeCode() {
                    return trusteeCode;
                }

                public void setTrusteeCode(String trusteeCode) {
                    this.trusteeCode = trusteeCode;
                }

                public String getTrusteeNameEng() {
                    return trusteeNameEng;
                }

                public void setTrusteeNameEng(String trusteeNameEng) {
                    this.trusteeNameEng = trusteeNameEng;
                }

                public String getTrusteeNameChi() {
                    return trusteeNameChi;
                }

                public void setTrusteeNameChi(String trusteeNameChi) {
                    this.trusteeNameChi = trusteeNameChi;
                }

                public String getTrusteeApprovalNumber() {
                    return trusteeApprovalNumber;
                }

                public void setTrusteeApprovalNumber(String trusteeApprovalNumber) {
                    this.trusteeApprovalNumber = trusteeApprovalNumber;
                }

                public int getFacsimileNumber() {
                    return facsimileNumber;
                }

                public void setFacsimileNumber(int facsimileNumber) {
                    this.facsimileNumber = facsimileNumber;
                }

                public String getTrusteeStatus() {
                    return trusteeStatus;
                }

                public void setTrusteeStatus(String trusteeStatus) {
                    this.trusteeStatus = trusteeStatus;
                }

                public String getEffectiveDate() {
                    return effectiveDate;
                }

                public void setEffectiveDate(String effectiveDate) {
                    this.effectiveDate = effectiveDate;
                }

                public String getTrusteeApprovalDate() {
                    return trusteeApprovalDate;
                }

                public void setTrusteeApprovalDate(String trusteeApprovalDate) {
                    this.trusteeApprovalDate = trusteeApprovalDate;
                }

                public String getTrusteeDisapprovalDate() {
                    return trusteeDisapprovalDate;
                }

                public void setTrusteeDisapprovalDate(String trusteeDisapprovalDate) {
                    this.trusteeDisapprovalDate = trusteeDisapprovalDate;
                }

                public List<PhoneDtoListBean> getPhoneDtoList() {
                    return PhoneDtoList;
                }

                public void setPhoneDtoList(List<PhoneDtoListBean> PhoneDtoList) {
                    this.PhoneDtoList = PhoneDtoList;
                }

                public static class PhoneDtoListBean {
                    /**
                     * countryCode : 86
                     * telephone : 13110011000
                     */

                    private String countryCode;
                    private String telephone;

                    public String getCountryCode() {
                        return countryCode;
                    }

                    public void setCountryCode(String countryCode) {
                        this.countryCode = countryCode;
                    }

                    public String getTelephone() {
                        return telephone;
                    }

                    public void setTelephone(String telephone) {
                        this.telephone = telephone;
                    }
                }
            }

            public static class RegisAddrDtoBean {
                /**
                 * room : 710
                 * floor : 7
                 * block : 10
                 * building : DEF Building
                 * street : 1 DEF Road
                 * districtArea : Kowloon
                 * country : CN
                 */

                private String room;
                private String floor;
                private String block;
                private String building;
                private String street;
                private String districtArea;
                private String country;

                public String getRoom() {
                    return room;
                }

                public void setRoom(String room) {
                    this.room = room;
                }

                public String getFloor() {
                    return floor;
                }

                public void setFloor(String floor) {
                    this.floor = floor;
                }

                public String getBlock() {
                    return block;
                }

                public void setBlock(String block) {
                    this.block = block;
                }

                public String getBuilding() {
                    return building;
                }

                public void setBuilding(String building) {
                    this.building = building;
                }

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }

                public String getDistrictArea() {
                    return districtArea;
                }

                public void setDistrictArea(String districtArea) {
                    this.districtArea = districtArea;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }
            }

            public static class CorrespondenceAddrDtoBean {
                /**
                 * city : HK
                 * postalCode : 000
                 * effectiveDate : Nov 8, 2022, 10:57:38 AM
                 * room : 710
                 * floor : 7
                 * block : 10
                 * building : DEF Building
                 * street : 1 DEF Road
                 * districtArea : Kowloon
                 * country : CN
                 */

                private String city;
                private String postalCode;
                private String effectiveDate;
                private String room;
                private String floor;
                private String block;
                private String building;
                private String street;
                private String districtArea;
                private String country;

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }

                public String getPostalCode() {
                    return postalCode;
                }

                public void setPostalCode(String postalCode) {
                    this.postalCode = postalCode;
                }

                public String getEffectiveDate() {
                    return effectiveDate;
                }

                public void setEffectiveDate(String effectiveDate) {
                    this.effectiveDate = effectiveDate;
                }

                public String getRoom() {
                    return room;
                }

                public void setRoom(String room) {
                    this.room = room;
                }

                public String getFloor() {
                    return floor;
                }

                public void setFloor(String floor) {
                    this.floor = floor;
                }

                public String getBlock() {
                    return block;
                }

                public void setBlock(String block) {
                    this.block = block;
                }

                public String getBuilding() {
                    return building;
                }

                public void setBuilding(String building) {
                    this.building = building;
                }

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }

                public String getDistrictArea() {
                    return districtArea;
                }

                public void setDistrictArea(String districtArea) {
                    this.districtArea = districtArea;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }
            }
        }

        public static class TrusteeBankDetailsDtoBean {
            /**
             * bankInformationDto : {"bankName":"10086","bankCode":"10086","branchCode":"10086","bankAcctNo":10086,"swiftCode":"10086","payeeName":"10086","effDate":"Nov 8, 2022, 10:57:38 AM"}
             * payeeAddressDto : {"room":"710","floor":"7","block":"10","building":"DEF Building","street":"1 DEF Road","districtArea":"Kowloon","country":"CN"}
             * intermediaryBankDto : {"bankName":"10086","bankCode":"10086","branchCode":"10086","bankAcctNo":10086,"swiftCode":"10086","payeeName":"10086","effDate":"Nov 8, 2022, 10:57:38 AM"}
             */

            private BankInformationDtoBean bankInformationDto;
            private PayeeAddressDtoBean payeeAddressDto;
            private IntermediaryBankDtoBean intermediaryBankDto;

            public BankInformationDtoBean getBankInformationDto() {
                return bankInformationDto;
            }

            public void setBankInformationDto(BankInformationDtoBean bankInformationDto) {
                this.bankInformationDto = bankInformationDto;
            }

            public PayeeAddressDtoBean getPayeeAddressDto() {
                return payeeAddressDto;
            }

            public void setPayeeAddressDto(PayeeAddressDtoBean payeeAddressDto) {
                this.payeeAddressDto = payeeAddressDto;
            }

            public IntermediaryBankDtoBean getIntermediaryBankDto() {
                return intermediaryBankDto;
            }

            public void setIntermediaryBankDto(IntermediaryBankDtoBean intermediaryBankDto) {
                this.intermediaryBankDto = intermediaryBankDto;
            }

            public static class BankInformationDtoBean {
                /**
                 * bankName : 10086
                 * bankCode : 10086
                 * branchCode : 10086
                 * bankAcctNo : 10086
                 * swiftCode : 10086
                 * payeeName : 10086
                 * effDate : Nov 8, 2022, 10:57:38 AM
                 */

                private String bankName;
                private String bankCode;
                private String branchCode;
                private int bankAcctNo;
                private String swiftCode;
                private String payeeName;
                private String effDate;

                public String getBankName() {
                    return bankName;
                }

                public void setBankName(String bankName) {
                    this.bankName = bankName;
                }

                public String getBankCode() {
                    return bankCode;
                }

                public void setBankCode(String bankCode) {
                    this.bankCode = bankCode;
                }

                public String getBranchCode() {
                    return branchCode;
                }

                public void setBranchCode(String branchCode) {
                    this.branchCode = branchCode;
                }

                public int getBankAcctNo() {
                    return bankAcctNo;
                }

                public void setBankAcctNo(int bankAcctNo) {
                    this.bankAcctNo = bankAcctNo;
                }

                public String getSwiftCode() {
                    return swiftCode;
                }

                public void setSwiftCode(String swiftCode) {
                    this.swiftCode = swiftCode;
                }

                public String getPayeeName() {
                    return payeeName;
                }

                public void setPayeeName(String payeeName) {
                    this.payeeName = payeeName;
                }

                public String getEffDate() {
                    return effDate;
                }

                public void setEffDate(String effDate) {
                    this.effDate = effDate;
                }
            }

            public static class PayeeAddressDtoBean {
                /**
                 * room : 710
                 * floor : 7
                 * block : 10
                 * building : DEF Building
                 * street : 1 DEF Road
                 * districtArea : Kowloon
                 * country : CN
                 */

                private String room;
                private String floor;
                private String block;
                private String building;
                private String street;
                private String districtArea;
                private String country;

                public String getRoom() {
                    return room;
                }

                public void setRoom(String room) {
                    this.room = room;
                }

                public String getFloor() {
                    return floor;
                }

                public void setFloor(String floor) {
                    this.floor = floor;
                }

                public String getBlock() {
                    return block;
                }

                public void setBlock(String block) {
                    this.block = block;
                }

                public String getBuilding() {
                    return building;
                }

                public void setBuilding(String building) {
                    this.building = building;
                }

                public String getStreet() {
                    return street;
                }

                public void setStreet(String street) {
                    this.street = street;
                }

                public String getDistrictArea() {
                    return districtArea;
                }

                public void setDistrictArea(String districtArea) {
                    this.districtArea = districtArea;
                }

                public String getCountry() {
                    return country;
                }

                public void setCountry(String country) {
                    this.country = country;
                }
            }

            public static class IntermediaryBankDtoBean {
                /**
                 * bankName : 10086
                 * bankCode : 10086
                 * branchCode : 10086
                 * bankAcctNo : 10086
                 * swiftCode : 10086
                 * payeeName : 10086
                 * effDate : Nov 8, 2022, 10:57:38 AM
                 */

                private String bankName;
                private String bankCode;
                private String branchCode;
                private int bankAcctNo;
                private String swiftCode;
                private String payeeName;
                private String effDate;

                public String getBankName() {
                    return bankName;
                }

                public void setBankName(String bankName) {
                    this.bankName = bankName;
                }

                public String getBankCode() {
                    return bankCode;
                }

                public void setBankCode(String bankCode) {
                    this.bankCode = bankCode;
                }

                public String getBranchCode() {
                    return branchCode;
                }

                public void setBranchCode(String branchCode) {
                    this.branchCode = branchCode;
                }

                public int getBankAcctNo() {
                    return bankAcctNo;
                }

                public void setBankAcctNo(int bankAcctNo) {
                    this.bankAcctNo = bankAcctNo;
                }

                public String getSwiftCode() {
                    return swiftCode;
                }

                public void setSwiftCode(String swiftCode) {
                    this.swiftCode = swiftCode;
                }

                public String getPayeeName() {
                    return payeeName;
                }

                public void setPayeeName(String payeeName) {
                    this.payeeName = payeeName;
                }

                public String getEffDate() {
                    return effDate;
                }

                public void setEffDate(String effDate) {
                    this.effDate = effDate;
                }
            }
        }
    }
}
