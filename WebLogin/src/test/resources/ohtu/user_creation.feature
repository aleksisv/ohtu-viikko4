Feature: A new user account can be created if a proper unused username and password are given

  Scenario: creation successful with correct username and password
    Given new user is selected
    When username "uuskayt" and password "salissali2" and confirmation "salissali2" are given
    Then user is registered

  Scenario: creation fails with too short username and valid passord
    Given new user is selected
    When username "i" and password "salissali2" and confirmation "salissali2" are given
    Then user is not created and error "username should have at least 3 characters" is reported

  Scenario: creation fails with correct username and too short password
    Given new user is selected
    When username "pekkayttaja" and password "p3" and confirmation "p3" are given
    Then user is not created and error "password should have at least 8 characters" is reported

  Scenario: creation fails with correct username and password consisting of letters
    Given new user is selected
    When username "uuskayta" and password "kirjainsala" and confirmation "kirjainsala" are given
    Then user is not created and error "password can not contain only letters" is reported

  Scenario: creation fails with already taken username and valid pasword
    Given new user is selected
    When username "jukka" and password "hyvasana2" and confirmation "hyvasana2" are given
    Then user is not created and error "username is already taken" is reported

  Scenario: creation fails when password and password confirmation do not match
    Given new user is selected
    When username "uuskaytb" and password "salasanajoka2" and confirmation "salasanaj2oka" are given
    Then user is not created error "password and password confirmation do not match" is reported
