Feature: US006 Kullanıcı bilgisi sekmesi (Setting) ana Sayfada düzenlenebilir olmalıdır.
  Scenario: TC01 Kullanıcı bilgileri "firstname, lastname, email" girerken doldurulan kullanıcı bilgileri olmalıdır.
    Given Kullanici Medunna url'ine gider
    Then Kullanici Sign In sayfasına gider
    And Kullanici bilgileriyle sign in olur
    Then Profil menüsünden Settings butonu tıklanır
    And Kullanıcı bilgilerinin firstname, lastname, email giriş yaparken doldurulan kullanıcı bilgileri olduğunu dogrularAnd Sayfayi kapatir