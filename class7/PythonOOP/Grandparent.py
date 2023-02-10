from class7.PythonOOP.FamilyMember import *

class Grandparent(FamilyMember):
    def __init__(self, first, last, year_of_birth, sex, children=None, grandchildren=None):
        super().__init__(first, last, year_of_birth, sex, children)
        if grandchildren is None:
            self.grandchildren = []
        else:
            self.grandchildren = grandchildren

    def add_grandchild(self, grandchild):
        if grandchild not in self.grandchildren:
            self.grandchildren.append(grandchild)

    def get_grandchildren(self):
        for grandchild in self.grandchildren:
            return grandchild

    def family_tree(self):
        print(f'{self.first}\'s family tree:\n'
              f'Partner: {self.partner}\n'
              f'Father: {self.father}\n'
              f'Mother: {self.mother}\n'
              f'Siblings: {self.siblings}\n'
              f'Children: {self.children}\n'
              f'Grandchildren: {self.grandchildren}'
              )



