select
        u1_0.id,
        a1_0.aid,
        a1_0.dept,
        a1_0.designation,
        a1_0.location,
        u1_0.salary,
        u1_0.uname 
    from
        users u1_0 
    left join
        address a1_0 
            on a1_0.aid=u1_0.ad_fk 
    where
        u1_0.id=?
===============================
all the records in left side and matching records

in One to One by default its calling left join 
because of that reason you cant acheive lazy loading here 
===================
bi directional mapping 

see the main thing is 
you cant find any difference in output 
in db schema or post man 

what is advantage of bidirectional 
==========================
User u 
u.getAddress()

Addres a 
a.getUser()

to acheive this bidirectional mapping there 
are certain steps to follow
===================================
Different cascading types 
Persist :
When you save the parent the child will be automatically 

Merge
Remove 
Refresh
detach 
=======================================

@OneTone -> left join
@JoinColumn -> To connect with secondary table 
@JsonManagedReferece
@JsonBackRefrence -> To avoid infinite cycle 
=============================================

