--
-- Created by IntelliJ IDEA.
-- User: xinzhang
-- Date: 11/08/2017
-- Time: 12:04 AM
-- To change this template use File | Settings | File Templates.
--
require 'class'
require 'constant'

Shop = class(function (self, winterRate, winterServiceCharge, summerRate)
    self.winterRate = winterRate;
    self.winterServiceCharge = winterServiceCharge;
    self.summerRate = summerRate;
end)

function Shop:__tostring()
    return string.format('winterRate: %s \nwinterServiceCharge: %s \nsummerRate: %s',
        self.winterRate, self.winterServiceCharge, self.summerRate)
end

function Shop:getCharge(date, quantity)
    if date < SUMMER_START or date > SUMMER_END then
        return quantity * self.winterRate + self.winterServiceCharge
    end
    return  quantity * self.summerRate
end

