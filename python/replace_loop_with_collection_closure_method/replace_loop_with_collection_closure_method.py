def getManagers(employees):
    managers = []
    for e in employees:
        if e.get("role") == "manager":
            managers.append(e)
    return managers
