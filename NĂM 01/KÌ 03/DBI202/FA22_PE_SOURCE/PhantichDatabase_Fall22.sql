select * from PackageTypes pt
join StockItems si on pt.PackageTypeID = si.UnitPackageID
--khi noi 2 bang PackageTypes va StockItems thi ta noi chung thong qua thuoc tinh  PackageTypeID va UnitPackageID

select * from PurchaseOrderLines pol
right join PackageTypes pt on pol.PackageTypeID = pt.PackageTypeID
--khi noi 2 bang PurchaseOrderLines va PackageTypes thi ta co the mat du lieu khi su join, luc nay ta can su dung 
--left join khi bang PackageTypes nam o ben trai join, right join khi bang PackageTypes nam o ben phai join, hoac co the su dung
-- full join neu can

select * from PurchaseOrderLines pol
join StockItems si on pol.StockItemID = si.StockItemID

select * from PurchaseOrders po
full join PurchaseOrderLines pol on po.PurchaseOrderID = pol.PurchaseOrderID

select * from PurchaseOrders po
right join SupplierTransactions st on po.PurchaseOrderID = st.PurchaseOrderID 
-- neu su dung phep join noi 2 bang PurchaseOrders va SupplierTransactions thi ta bi mat du lieu o bang SupplierTransactions


select * from Suppliers s 
right join PurchaseOrders po on po.SupplierID = s.SupplierID
-- neu su dung phep join noi 2 bang Suppliers va PurchaseOrders thi ta bi mat du lieu o bang Suppliers

select * from SupplierTransactions st
full join Suppliers s on s.SupplierID = st.SupplierID

--join =>1442
--full join =>1446 != 1442 => co du lieu bi mat
--ktra: su dung left join neu nhu ra 1442 thi chung to du lieu mat nam o ben phai join
-- nguoc lai neu nhu ra 1446 thi du lieu bi mat nam o bang ben trai chu join
--select * from Suppliers s (cach select du lieu bi mat, ap dung tuong tu voi cac cau khac
--where s.SupplierID not in (select SupplierID from SupplierTransactions)



select * from StockItems si
right join Suppliers s on si.SupplierID = s.SupplierID
--du lieu bi mat nam o bang suppliers