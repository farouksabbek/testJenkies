Feature: test login


  @Google
  Scenario Outline:
      Given I go to the site
      When I add text  "<testa>" and "<testb>"
      #And I click on search


      Examples:
        | testa | testb  |
        | aaaa  | _bbbbb |
        | ccccc | _ddddd |



