def getManagers(employees):
    return [e for e in employees if e.get("role") == "manager"]
    # return list(filter(lambda e: e.get("role") == "manager", employees))
