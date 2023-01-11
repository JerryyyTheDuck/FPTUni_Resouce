
select ps.Category, ps.Name,count(p.ProductID) as NumberOfProducts from ProductSubcategory ps
join Product p on ps.SubcategoryID = p.SubcategoryID
group by ps.SubcategoryID, ps.Category, ps.Name
having count(p.ProductID) in
(
select max(NumberOfProducts) from
(select ps.Category, ps.Name,count(p.ProductID) as NumberOfProducts from ProductSubcategory ps
join Product p on ps.SubcategoryID = p.SubcategoryID
group by ps.SubcategoryID, ps.Category, ps.Name) as counts
group by counts.Category
)
