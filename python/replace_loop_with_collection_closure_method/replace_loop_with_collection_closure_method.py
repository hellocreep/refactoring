def getManagers(employees):
    return list(filter(lambda e: e.manager, employees))
    # return [e for e in employees if e.manager is True]
