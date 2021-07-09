Feature: Product Api

  Scenario: Create Product
    Given User set POST product service api endpoint
    When User Set request HEADER
    And User send a POST HTTP request
    Then User recieves status code of 201
