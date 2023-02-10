from class7.PythonOOP.Child import Child
from class7.PythonOOP.Grandparent import Grandparent
from class7.PythonOOP.Parent import Parent

# grandparents

grandparent1 = Grandparent("Sven", "Svensson", 1945, "Male", None, None)
grandparent2 = Grandparent("Tilda", "Olafsson", 1946, "Female", None, None)

#parents

parent1 = Parent("Jon", "Svensson", 1965, "Male", None)
parent2 = Parent("Sigrid", "Petersson", 1968, "Female", None)
parent3 = Parent("Sonya", "Svensson", 1971, "Female", None)
parent4 = Parent("Lucas", "Carlsson", 1969, None)

#children
child1 = Child("Ulv", "Svensson", 1988, "Male")
child2 = Child("Maja", "Carlsson", 1990, "Female")

grandparent1.add_child(parent1)
grandparent1.add_partner(grandparent2)
grandparent1.add_grandchild(child1)
grandparent1.add_grandchild(child2)
grandparent1.family_tree()
print("#######")

parent1.add_partner(parent2)
parent1.add_child(child1)
parent1.add_sibling(parent3)
parent1.set_father(grandparent1)
parent1.set_mother(grandparent2)
parent1.family_tree()
print("#######")

permission = input("Can the kid go for a walk?(Write yes or no)\n")
child1.go_walk(parent1.give_permission(permission))