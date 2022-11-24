Feature: US006 Kullanıcı bilgisi sekmesi (Setting) ana Sayfada düzenlenebilir olmalıdır.
  Scenario: "Firstname" güncelleme seçeneği olmalıdır.
    Given Kullanici Medunna url'ine gider
    Then Kullanici Sign In sayfasına gider
    And Kullanici bilgileriyle sign in olur
    Then Profil menüsünden Settings butonu tıklanır
    And Firstname, lastname ve email metin kutularinda degisiklik yapar
    Then Firstname, lastname ve email metin kutularinda yapilan degisiklikleri dogrular
    And Sayfayi kapatir