# Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
#
# Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в конец очереди,
# dequeue() - возвращает первый элемент из очереди и удаляет его, first() - возвращает первый элемент из очереди,
# не удаляя.

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

    def __repr__(self):
        return self.data


class LinkedList:
    def __init__(self, nodes=None):
        self.head = None
        if nodes is not None:
            node = Node(data=nodes.pop(0))
            self.head = node
            for elem in nodes:
                node.next = Node(data=elem)
                node = node.next

    def __repr__(self):
        node = self.head
        nodes = []
        while node is not None:
            nodes.append(node.data)
            node = node.next
        nodes.append("None")
        return " -> ".join(nodes)

    def __iter__(self):
        node = self.head
        while node is not None:
            yield node
            node = node.next

    def first(self):
        return self.head

    def enqueue(self, node):
        if self.head is None:
            self.head = node
            return
        for current_node in self:
            pass
        current_node.next = node

    def dequeue(self):
        if self.head is None:
            raise Exception("List is empty")
        print(self.head)
        self.head = self.head.next


linked_list = LinkedList(["1", "2", "3", "4"])
print(linked_list)
linked_list.enqueue(Node("5"))
linked_list.enqueue(Node("6"))
linked_list.dequeue()
linked_list.dequeue()
print(linked_list)
print(linked_list.first())

