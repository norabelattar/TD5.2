# TD5: Principes SOLID (Suite)

## DIP

Corriger les violations du DIP dans l'application. Utilisez l'architecture hexagonale.

## LSP

### Exercice `Bird`

Corrigez les violations du LSP dans les implémentations de l'interface `Bird`.

### Exercice `Triangle`

Vous avez une interface `Shape` et trois implémentations:
- `Circle` avec un radius
- `Triangle` avec trois dimensions de côtés
- `EquilateralTriangle` avec une même dimension pour ces trois côtés

1. Ajoutez des setters pour les dimensions de côtés de `Triangle` et pour le radius de `Circle`.

_Le LSP est brisé. Pourquoi?_

2. Corrigez les violations du LSP.

## OCP

La classe `PaymentProcessor` permet de traiter des paiements avec différentes méthodes 
et d'envoyer un rapport sur ces paiements.

1. Corrigez la violation de l'OCP dans `processPayment`.
2. Corrigez la violation de l'OCP dans `sendPaymentsReport`.