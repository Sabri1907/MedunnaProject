Feature: US017 Test items(öğe) Oluştur / Güncelle / Sil
  Scenario: TC05 API ile doğrulayın
    Given   SG Given user generates token with admin account
    When    SG And admin sets the expected data to verify
    Then    SG When  admin sends get request for test items and get the response
    And     SG And admin verifies the response with the expected data