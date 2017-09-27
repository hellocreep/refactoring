def getManagers(employees):
    managers = []
    for e in employees:
        if e.manager is True:
            managers.append(e)
    return managers
