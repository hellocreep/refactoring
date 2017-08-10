--
-- Created by IntelliJ IDEA.
-- User: xinzhang
-- Date: 10/08/2017
-- Time: 11:11 PM
-- To change this template use File | Settings | File Templates.
--
require 'shop'

function __main__()
    local winterRate, winterServiceCharge, summerRate = 0.6, 20, 0.8;
    local myShop = Shop(winterRate, winterServiceCharge, summerRate);

    local month, quantity = 7, 10;
    local charge = myShop:getCharge(month, quantity);
    assert(charge == quantity*summerRate, 'Summer Charge Error');

    month = 4;
    charge = myShop:getCharge(month, quantity);
    assert(charge == (quantity*winterRate + winterServiceCharge), 'Winer Charge Error');

    print('success')
end

__main__();
