Feature: Realizar Login no site da movida

  Scenario: Fazer login no site da movida
    Given o usuario deve estar na pagina inicial
    When o usuario clicar no icone login
    And o usuario preencher o campo do CPF com dado valido
    And o usuario preencher o campo da senha com dado valida
    And clicar no botao de login
    Then o usuario estara na pagina inicial logado.
