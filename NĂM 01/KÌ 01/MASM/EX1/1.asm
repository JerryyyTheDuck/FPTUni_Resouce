include \masm32\include\masm32rt.inc
swap2 PROTO : PTR DWORD, : PTR DWORD; parameters are addresses
.data 
    a dd 0
.code
;--------------------------------------
check proc n:dword
        mov eax,n
        cmp eax,1
        jg false
        je true

false: 
        push eax 
        dec eax
        call check
        push ebx
        dec eax
        call check
        push eax
        add ebx,eax 
        pop eax
        mov n,eax
        print str$(n)
        

true:   
        mov ebx,1
        print chr$("La so Fibo")
        ret 
check endp

start:
    mov a,sval(input("Nhap a: "))
    invoke check,a
    
    
 exit
 end start
;-----------------------------------------
