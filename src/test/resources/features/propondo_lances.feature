Feature: propondo_lances

Scenario: Propondo um unico lance valido
 Given Dado um lance valido de 10.0 de "fulano"
 When Quando propoe o lance
 Then Entao o lance sera aceito

Scenario: Propondo um unico lance valido
 Given Dado varios lances valido
 When Quando propoe varios lances
 Then Entao os lances serao aceitos