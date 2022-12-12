Feature: US017 Test items(öğe) Oluştur / Güncelle / Sil

  Scenario Outline: TC07 DB ile dogrulayin.
    Given YE Admin connection kurar
    Then YE Admin kayitli kisileri olusturur "<query>" ve "<ColumnName>"
    And YE Admin bilgilerini dogrular
    Examples: test verileri
      | query                     | ColumnName |
      | SELECT * FROM c_test_item | id         |