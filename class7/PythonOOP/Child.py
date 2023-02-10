from class7.PythonOOP.FamilyMember import *


class Child(FamilyMember):
    def __init__(self, first, last, year_of_birth, sex):
        super().__init__(first, last, year_of_birth, sex)

    def go_walk(self, permission):
        if permission:
            print(f'{self.first} went for a walk')
        else:
            print(f'{self.first} is studying at home today')

