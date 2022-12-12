Feature: US017 Test items(öğe) Oluştur / Güncelle / Sil
  Scenario: TC06 API ile test items oluşturun.
    Given   SG Admin goes to Medunna for post request the Test Item
    When    SG Admin sends Post request
    Then    SG Admin verifies Status code is 201
    And     SG Admin verifies Expected data equals to Actual data