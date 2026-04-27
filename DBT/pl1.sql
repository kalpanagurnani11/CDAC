/*

-------------HELLO WORLD--------------------------------
drop procedure if exists pro1;
delimiter $
create procedure pro1()

BEGIN

select "hello world";

end $
delimiter ;

----------------------------------ADD 2 Var------------------------------------------------------------
drop procedure if exists pro1;
delimiter $
create procedure pro1()

BEGIN
declare x int;
declare y int default 20;

set x:=10;
select x,y;
select x+y;



end $
delimiter ;


--------------------Dyanamic Value--------------------------


drop procedure if exists pro1;
delimiter $
create procedure pro1( x int)

BEGIN

select x*x;

end $
delimiter ;

--------------------------------------------------------------------
drop procedure if exists pro1;
delimiter $
create procedure pro1( x int)

BEGIN
declare y int;
set y:=x*x;
select y;


end $
delimiter ;


----------------------------------------------------------------------------
drop procedure if exists pro1;
delimiter $
create procedure pro1( x int,out z int)

BEGIN

set z:=x*x;



end $
delimiter ;
--------------------------------------------------------------------------------


drop procedure if exists pro1;
delimiter $
create procedure pro1( x int,out z int)

BEGIN

set z:=x*@a;



end $
delimiter ;

--------------------------------------NESTED IF---------------------------------------------

drop procedure if exists pro1;
delimiter $
create procedure pro1(x int)

BEGIN

if x>=10 THEN
select ">=10";
ELSEif x=10 then
select "=";
ELSE
select "<10";
end if;

-------------------------------------CONCAT LOOP------------------------------------------

drop procedure if exists pro1;
delimiter $
create procedure pro1()

BEGIN

declare x int default 1;
declare a varchar(100) default '';

lbl1:LOOP
set a:=concat(a," " ,x);
set x:=x+1;
	if x>=11 then 
		leave lbl1;
	end if;

end loop;
select a;



end $
delimiter ;



------------------------------------------------------------------------------------

drop procedure if exists pro1;
delimiter $
create procedure pro1(x int )

BEGIN
declare y boolean default 0;
if(select true  from emp where empno=x)
then
select empno,ename,job,sal from emp where empno=x;
ELSE
select "enp not found";

endif;
end $
delimiter ;

--------------------------------------------------------




drop procedure if exists display;
delimiter $
create procedure display(in msg varchar(1000) )


BEGIN
	select msg as r1;
end $
delimiter ;


drop procedure if exists pro1;
delimiter $
create procedure pro1( )

BEGIN
	declare exit handler for 1050 select "table present";
	create table z(c1 int primary key auto_increment,c2 int);
	call display('table created');

end $
delimiter ;

----------------------------------------------------------------------------


drop procedure if exists pro1;
delimiter $
create procedure pro1(In tname varchar(64) )

BEGIN
set @a:=concat("select * from ",tname);
prepare x from @a;
execute x;
	
end $
delimiter ;

----------------------------------------------------------------------------------------------

drop procedure if exists pro1;
delimiter $
create procedure pro1(In c1 varchar(64),In c2 varchar(64),In tname varchar(64 ))

BEGIN
set @a:=concat("select ",c1,', ', c2,' from ',tname);
prepare x from @a;
execute x;
	
end $
delimiter ;
----------------------------------------------------------------------------------------------------------

drop procedure if exists pro1;
delimiter $
create procedure pro1(In c1 varchar(64),In c2 varchar(64),In tname varchar(64 ))

BEGIN
set @a:=concat("select ",c1,' from ',tname);
prepare x from @a;
execute x;
	
end $
delimiter ;

---------------------------------------------------------------------------------------------------------------

drop procedure if exists pro1;
delimiter $
create procedure pro1(In c1 varchar(64),In c2 varchar(64),In tname varchar(64 ))

BEGIN
		declare x int default 100;
		BEGIN
			declare i int default 200;
			select x;
		end;
		select y;
	
end $
delimiter ;

---------------------------------------------------------------------------------------

drop procedure if exists pro1;
delimiter $
create procedure pro1()

BEGIN
	declare v1 int;
	declare v2,v3,v4,v5 varchar(20);
	
	declare c1 cursor for select * from dept;
	declare exit handler for 1329 select "no more data";
	
	open c1;
		lbl:loop
			fetch c1 into v1,v2,v3,v4,v5;
			select v1,v2,v3,v4,v5;
			
		end loop lbl;
		close c1;
	
end $
delimiter ;


*/




drop procedure if exists pro1;
delimiter $
create procedure pro1(in idname varchar(29))

BEGIN
	
	declare x,y varchar(29);
	
	declare c1 cursor for select ename, dname from emp,dept where emp.deptno = dept.deptno and dname = idname;
	declare exit handler for 1329 select "no more data";
	if(select true from dept where dname=idname) then
				open c1;
					lbl:loop
						fetch c1 into x,y;
						insert into z(empno,ename,deptno) values (1,x,1);
						
					end loop lbl;
					close c1;
	else 
	call display("dept name not found");
	
	end if;
	
end $
delimiter ;





