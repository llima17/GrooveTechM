Feature: Realizar Login no site da movida cenario negativo

  Scenario: Fazer login com valores invalidos
    Given o usuario deve estar na pagina inicial
    When  o usuario preencher o campo do CPF com dado invalido
    And   o usuario preencher o campo da senha com dado invalido
    Then  Ocorre uma exceção no login com mensagem da causa