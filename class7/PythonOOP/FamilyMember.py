class FamilyMember:
    def __init__(self, first, last, year_of_birth, sex, children=None, siblings=None):
        self.first = first
        self.last = last
        self.year_of_birth = year_of_birth
        self.father = None
        self.mother = None
        self.partner = None
        self.sex = sex
        if children is None:
            self.children = []
        else:
            self.children = children
        if siblings is None:
            self.siblings = []
        else:
            self.siblings = siblings


    def fullname(self):
        return "{} {}".format(self.first, self.last)

    # Partner
    def add_partner(self, partner):
        self.partner = partner

    def get_partner(self):
        print("{}'s partner is: {}".format(self.first, self.partner))

    # Parents
    def set_father(self, father):
        self.father = father

    def get_father(self):
        return self.father

    def set_mother(self, mother):
        self.mother = mother

    def get_mother(self):
        return self.mother

    # Children

    def add_child(self, child):
        if child not in self.children:
            self.children.append(child)

    def get_children(self):
        for child in self.children:
            print(child)

    # Siblings
    def add_sibling(self, sibling):
        if sibling not in self.siblings:
            self.siblings.append(sibling)

    def get_siblings(self):
        for sibling in self.siblings:
            print(sibling)

    def get_brothers(self):
        for sibling in self.siblings:
            if sibling.sex == "Male":
                print(sibling)

    def get_sisters(self):
        for sibling in self.siblings:
            if sibling.sex == "Female":
                print(sibling)

    def __repr__(self):
        return self.fullname()
