include \masm32\include\masm32rt.inc
.data
    n dd 0
.code

giaithua proc num:dword
    local index:dword
    local frac:dword
    mov index,1
    mov frac,1

laplai:
    mov eax,num   
    cmp eax,index
    jge nhan
    jl ketthuc
    
    nhan:
        ;>>>>>>>>>>>>>>>>>>.
        mov ebx,frac
        imul ebx,index
        mov frac,ebx
        ;>>>>>>>>>>>>>>>>>>> for(int i =1; i<=n;i++)
        mov eax,index
        add eax,1
        mov index,eax
        jmp laplai
        
        
    ketthuc:
        print str$(frac )
   ret
giaithua endp
start:
    mov n, sval(input("Nhap n: "))
    invoke giaithua,n
exit
end start