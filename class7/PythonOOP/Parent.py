from class7.PythonOOP.FamilyMember import *


class Parent(FamilyMember):
    def __init__(self, first, last, year_of_birth, sex, children=None):
        super().__init__(first, last, year_of_birth, sex, children)

    def family_tree(self):
        print(f'{self.first}\'s family tree:\n'
              f'Partner: {self.partner}\n'
              f'Father: {self.father}\n'
              f'Mother: {self.mother}\n'
              f'Siblings: {self.siblings}\n'
              f'Children: {self.children}'
              )

    def give_permission(self, permission):
        if permission.lower() == "yes":
            return True
        elif permission.lower() == "no":
            return False
        else:
            print("The kid can't figure out if it's a yes or no")
