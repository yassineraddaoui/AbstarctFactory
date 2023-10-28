// ProduitAbstraitA
 interface ProduitAbstraitA {
    void methodeA();
}

// ProduitAbstraitB
 interface ProduitAbstraitB {
    void methodeB();
}

// ProduitA1
class ProduitA1 implements ProduitAbstraitA {
    @Override
    public void methodeA() {
        System.out.println("Produit A1 - Méthode A");
    }
}

// ProduitB1
class ProduitB1 implements ProduitAbstraitB {
    @Override
    public void methodeB() {
        System.out.println("Produit B1 - Méthode B");
    }
}

// ProduitA2
class ProduitA2 implements ProduitAbstraitA {
    @Override
    public void methodeA() {
        System.out.println("Produit A2 - Méthode A");
    }
}

// ProduitB2
class ProduitB2 implements ProduitAbstraitB {
    @Override
    public void methodeB() {
        System.out.println("Produit B2 - Méthode B");
    }
}

// FabriqueAbstraite
 interface FabriqueAbstraite {
    ProduitAbstraitA creerProduitA();
    ProduitAbstraitB creerProduitB();
}

// FabriqueConcrete1
class FabriqueConcrete1 implements FabriqueAbstraite {
    @Override
    public ProduitAbstraitA creerProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitAbstraitB creerProduitB() {
        return new ProduitB1();
    }
}

// FabriqueConcrete2
class FabriqueConcrete2 implements FabriqueAbstraite {
    @Override
    public ProduitAbstraitA creerProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitAbstraitB creerProduitB() {
        return new ProduitB2();
    }
}

// Exemple d'utilisation du pattern Abstract Factory
class Main {
    public static void main(String[] args) {
        // Utilisation de la FabriqueConcrete1
        FabriqueAbstraite fabrique1 = new FabriqueConcrete1();
        ProduitAbstraitA produitA = fabrique1.creerProduitA();
        ProduitAbstraitB produitB = fabrique1.creerProduitB();

        produitA.methodeA();
        produitB.methodeB();

        // Utilisation de la FabriqueConcrete2
        FabriqueAbstraite fabrique2 = new FabriqueConcrete2();
        ProduitAbstraitA produitA2 = fabrique2.creerProduitA();
        ProduitAbstraitB produitB2 = fabrique2.creerProduitB();

        produitA2.methodeA();
        produitB2.methodeB();
    }
}
