Feature: US006 Kullanıcı bilgisi sekmesi (Setting) ana Sayfada düzenlenebilir olmalıdır.
  Scenario: "Firstname" güncelleme seçeneği olmalıdır.
    Given Kullanici Medunna url'ine gider
    Then Kullanici Sign In sayfasına gider
    And Kullanici bilgileriyle sign in olur
    Then Profil menüsünden Settings butonu tıklanır
    And Firstname metin kutusunda degisiklik yapar
    #Then Firstname metin kutusunda yapilan degisikligi dogrular
    #And Sayfayi kapatir