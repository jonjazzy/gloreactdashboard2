package com.jonjazzy.glodashboard.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "r1transactiondao")
public class R1TransactionDAO
{
    @Id
    @GeneratedValue
    private Integer id;

    @NonNull
    private String r1ref;
    private String bank_payout_ref;
    private String payout_method;
    private String payout_date;
    private String webuser;
    private Integer amount;

    private String remitter_id;
    private String remitter_type;
    private String remitter_firstname;
    private String remitter_lastname;
    private String remitter_name;
    private String remitter_address;
    private String remitter_mobile;
    private String remitter_tel;

    private String beneficiary_id;
    private String benef_id_type;
    private String benef_id_detail;
    private String benef_firstname;
    private String benef_lastname;
    private String beneficiary_name;
    private String beneficiary_number;
    private String benef_tel;
    private String benef_mobile;
    private String benef_email;
    private String benef_address1;
    private String benef_address2;
    private String benef_city;
    private String benef_account;
    private String benef_bank;
    private String benef_branch_code;
    private String receive_currency;

    private String responseCode;
    private String responseDescription;




    /*---------------------------------------------------------------------------------------------------------*/

    public String getBenef_branch_code() {
        return benef_branch_code;
    }

    public void setBenef_branch_code(String benef_branch_code) {
        this.benef_branch_code = benef_branch_code;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseDescription() {
        return responseDescription;
    }

    public void setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getR1ref() {
        return r1ref;
    }

    public void setR1ref(String r1_ref) {
        this.r1ref = r1_ref;
    }

    public String getBank_payout_ref() {
        return bank_payout_ref;
    }

    public void setBank_payout_ref(String bank_payout_ref) {
        this.bank_payout_ref = bank_payout_ref;
    }

    public String getPayout_method() {
        return payout_method;
    }

    public void setPayout_method(String payout_method) {
        this.payout_method = payout_method;
    }

    public String getPayout_date() {
        return payout_date;
    }

    public void setPayout_date(String payout_date) {
        this.payout_date = payout_date;
    }

    public String getWebuser() {
        return webuser;
    }

    public void setWebuser(String webuser) {
        this.webuser = webuser;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getRemitter_id() {
        return remitter_id;
    }

    public void setRemitter_id(String remitter_id) {
        this.remitter_id = remitter_id;
    }

    public String getRemitter_type() {
        return remitter_type;
    }

    public void setRemitter_type(String remitter_type) {
        this.remitter_type = remitter_type;
    }

    public String getRemitter_firstname() {
        return remitter_firstname;
    }

    public void setRemitter_firstname(String remitter_firstname) {
        this.remitter_firstname = remitter_firstname;
    }

    public String getRemitter_lastname() {
        return remitter_lastname;
    }

    public void setRemitter_lastname(String remitter_lastname) {
        this.remitter_lastname = remitter_lastname;
    }

    public String getRemitter_name() {
        return remitter_name;
    }

    public void setRemitter_name(String remitter_name) {
        this.remitter_name = remitter_name;
    }

    public String getRemitter_address() {
        return remitter_address;
    }

    public void setRemitter_address(String remitter_address) {
        this.remitter_address = remitter_address;
    }

    public String getRemitter_mobile() {
        return remitter_mobile;
    }

    public void setRemitter_mobile(String remitter_mobile) {
        this.remitter_mobile = remitter_mobile;
    }

    public String getRemitter_tel() {
        return remitter_tel;
    }

    public void setRemitter_tel(String remitter_tel) {
        this.remitter_tel = remitter_tel;
    }

    public String getBeneficiary_id() {
        return beneficiary_id;
    }

    public void setBeneficiary_id(String beneficiary_id) {
        this.beneficiary_id = beneficiary_id;
    }

    public String getBenef_id_type() {
        return benef_id_type;
    }

    public void setBenef_id_type(String benef_id_type) {
        this.benef_id_type = benef_id_type;
    }

    public String getBenef_id_detail() {
        return benef_id_detail;
    }

    public void setBenef_id_detail(String benef_id_detail) {
        this.benef_id_detail = benef_id_detail;
    }

    public String getBenef_firstname() {
        return benef_firstname;
    }

    public void setBenef_firstname(String benef_firstname) {
        this.benef_firstname = benef_firstname;
    }

    public String getBenef_lastname() {
        return benef_lastname;
    }

    public void setBenef_lastname(String benef_lastname) {
        this.benef_lastname = benef_lastname;
    }

    public String getBeneficiary_name() {
        return beneficiary_name;
    }

    public void setBeneficiary_name(String beneficiary_name) {
        this.beneficiary_name = beneficiary_name;
    }

    public String getBeneficiary_number() {
        return beneficiary_number;
    }

    public void setBeneficiary_number(String beneficiary_number) {
        this.beneficiary_number = beneficiary_number;
    }

    public String getBenef_tel() {
        return benef_tel;
    }

    public void setBenef_tel(String benef_tel) {
        this.benef_tel = benef_tel;
    }

    public String getBenef_mobile() {
        return benef_mobile;
    }

    public void setBenef_mobile(String benef_mobile) {
        this.benef_mobile = benef_mobile;
    }

    public String getBenef_email() {
        return benef_email;
    }

    public void setBenef_email(String benef_email) {
        this.benef_email = benef_email;
    }

    public String getBenef_address1() {
        return benef_address1;
    }

    public void setBenef_address1(String benef_address1) {
        this.benef_address1 = benef_address1;
    }

    public String getBenef_address2() {
        return benef_address2;
    }

    public void setBenef_address2(String benef_address2) {
        this.benef_address2 = benef_address2;
    }

    public String getBenef_city() {
        return benef_city;
    }

    public void setBenef_city(String benef_city) {
        this.benef_city = benef_city;
    }

    public String getBenef_account() {
        return benef_account;
    }

    public void setBenef_account(String benef_account) {
        this.benef_account = benef_account;
    }

    public String getBenef_bank() {
        return benef_bank;
    }

    public void setBenef_bank(String benef_bank) {
        this.benef_bank = benef_bank;
    }

    public String getReceive_currency() {
        return receive_currency;
    }

    public void setReceive_currency(String receive_currency) {
        this.receive_currency = receive_currency;
    }
}
