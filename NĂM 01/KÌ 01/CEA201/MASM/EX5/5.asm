include \masm32\include\masm32rt.inc
;>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        .code
            start:
                call main
            exit

        main proc
        ;khai bao bien
            LOCAL var1: DWORD 
            LOCAL var2: DWORD
            LOCAL var3: DWORD
        ;input
            mov var1, sval(input("nhap vao so thu nhat: "))
            mov var2, sval(input("nhap vao so thu hai: "))
        ;tinhtong
            print chr$("a + b= ")
            mov eax,var1
            mov ebx,var2
            add eax,ebx
            print str$(eax)
            print chr$(10)

        ;tinhhieu
            print chr$("a - b= ")
            mov eax,var1
            mov ebx,var2
            sub eax,ebx
            print str$(eax)
            print chr$(10)

        ;tinhnhan
            print chr$("a * b= ")
            mov eax,var1
            mov ebx,var2
            mul ebx
            print str$(eax)
            print chr$(10)
        ;tinhchia
            mov ebx,var2
            cmp ebx,0
            je equal
            jmp result

        equal:
            print chr$("khong hop le")
        jmp over

        result:
            print chr$("a/b= ")
            mov edx,0
            mov eax, var1
            mov ebx, var2
            div ebx
            print str$(eax)
            jmp over
        over:   
        ret
        main endp
;-------------------------------------
end start