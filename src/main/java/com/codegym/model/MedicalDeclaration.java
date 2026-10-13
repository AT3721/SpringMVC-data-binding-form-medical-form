package com.codegym.model;

import jakarta.validation.constraints.*;

public class MedicalDeclaration {

    @NotBlank(message = "Họ tên không được để trống")
    @Pattern(
            regexp = "^[A-ZÀÁÂÃÈÉÊÌÍÒÓÔÕÙÚƯÝĐĂẰẮẲẴẶẦẤẨẪẬỀẾỂỄỆỈĨỊỒỐỔỖỘỜỚỞỠỢỪỨỬỮỰỲÝỶỸỴ\\s]+$",
            message = "Họ tên bắt buộc phải viết chữ IN HOA (Ví dụ: NGUYỄN VĂN A)"
    )
    private String name;

    @NotNull(message = "Chọn năm sinh")
    private Integer birthYear;

    @NotBlank(message = "Chọn giới tính")
    private String gender;

    @NotBlank(message = "Chọn quốc tịch")
    private String nationality;

    @NotBlank(message = "Số CMND/CCCD không được để trống")
    @Pattern(
            regexp = "^[0-9]{12}$",
            message = "Số CCCD/Hộ chiếu phải bao gồm đúng 12 chữ số"
    )
    private String idCard;

    @NotBlank(message = "Chọn thông tin đi lại")
    private String travelInfo;

    private String vehicleNumber;
    private String seatNumber;

    @NotBlank(message = "Chọn ngày khởi hành")
    private String departureDate;

    @NotBlank(message = "Chọn ngày kết thúc")
    private String endDate;

    private String travelHistory;

    @NotBlank(message = "Chọn Tỉnh/Thành")
    private String province;

    @NotBlank(message = "Chọn Quận/Huyện")
    private String district;

    @NotBlank(message = "Chọn Phường/Xã")
    private String ward;

    @NotBlank(message = "Địa chỉ nơi ở không được để trống")
    private String address;

    @NotBlank(message = "Điện thoại không được để trống")
    @Pattern(
            regexp = "^0[0-9]{8,9}$",
            message = "Số điện thoại phải đúng định dạng (bắt đầu bằng 0 và gồm 9-10 chữ số)"
    )
    private String phone;

    private String email;

    // Các thuộc tính triệu chứng & phơi nhiễm giữ nguyên...
    @NotNull(message = "Bắt buộc chọn")
    private Boolean fever;
    @NotNull(message = "Bắt buộc chọn")
    private Boolean cough;
    @NotNull(message = "Bắt buộc chọn")
    private Boolean shortnessOfBreath;
    @NotNull(message = "Bắt buộc chọn")
    private Boolean soreThroat;
    @NotNull(message = "Bắt buộc chọn")
    private Boolean nausea;
    @NotNull(message = "Bắt buộc chọn")
    private Boolean diarrhea;
    @NotNull(message = "Bắt buộc chọn")
    private Boolean skinHemorrhage;
    @NotNull(message = "Bắt buộc chọn")
    private Boolean skinRash;

    @NotNull(message = "Bắt buộc chọn")
    private Boolean animalContact;
    @NotNull(message = "Bắt buộc chọn")
    private Boolean covidContact;

    public MedicalDeclaration() {}

    // (Giữ nguyên toàn bộ Getter và Setter cũ)
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Integer getBirthYear() { return birthYear; }
    public void setBirthYear(Integer birthYear) { this.birthYear = birthYear; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getNationality() { return nationality; }
    public void setNationality(String nationality) { this.nationality = nationality; }
    public String getIdCard() { return idCard; }
    public void setIdCard(String idCard) { this.idCard = idCard; }
    public String getTravelInfo() { return travelInfo; }
    public void setTravelInfo(String travelInfo) { this.travelInfo = travelInfo; }
    public String getVehicleNumber() { return vehicleNumber; }
    public void setVehicleNumber(String vehicleNumber) { this.vehicleNumber = vehicleNumber; }
    public String getSeatNumber() { return seatNumber; }
    public void setSeatNumber(String seatNumber) { this.seatNumber = seatNumber; }
    public String getDepartureDate() { return departureDate; }
    public void setDepartureDate(String departureDate) { this.departureDate = departureDate; }
    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }
    public String getTravelHistory() { return travelHistory; }
    public void setTravelHistory(String travelHistory) { this.travelHistory = travelHistory; }
    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }
    public String getDistrict() { return district; }
    public void setDistrict(String district) { this.district = district; }
    public String getWard() { return ward; }
    public void setWard(String ward) { this.ward = ward; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public Boolean getFever() { return fever; }
    public void setFever(Boolean fever) { this.fever = fever; }
    public Boolean getCough() { return cough; }
    public void setCough(Boolean cough) { this.cough = cough; }
    public Boolean getShortnessOfBreath() { return shortnessOfBreath; }
    public void setShortnessOfBreath(Boolean shortnessOfBreath) { this.shortnessOfBreath = shortnessOfBreath; }
    public Boolean getSoreThroat() { return soreThroat; }
    public void setSoreThroat(Boolean soreThroat) { this.soreThroat = soreThroat; }
    public Boolean getNausea() { return nausea; }
    public void setNausea(Boolean nausea) { this.nausea = nausea; }
    public Boolean getDiarrhea() { return diarrhea; }
    public void setDiarrhea(Boolean diarrhea) { this.diarrhea = diarrhea; }
    public Boolean getSkinHemorrhage() { return skinHemorrhage; }
    public void setSkinHemorrhage(Boolean skinHemorrhage) { this.skinHemorrhage = skinHemorrhage; }
    public Boolean getSkinRash() { return skinRash; }
    public void setSkinRash(Boolean skinRash) { this.skinRash = skinRash; }
    public Boolean getAnimalContact() { return animalContact; }
    public void setAnimalContact(Boolean animalContact) { this.animalContact = animalContact; }
    public Boolean getCovidContact() { return covidContact; }
    public void setCovidContact(Boolean covidContact) { this.covidContact = covidContact; }
}