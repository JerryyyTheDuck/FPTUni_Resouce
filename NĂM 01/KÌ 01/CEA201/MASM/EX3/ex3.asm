include \masm32\include\masm32rt.inc
;>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        .data
            var4 dd 3
        .code
            start:
                call tongtb
            exit

        tongtb proc
        ;khai bao bien
            LOCAL var1: DWORD 
            LOCAL var2: DWORD
            LOCAL var3: DWORD
            LOCAL average: DWORD
        ;input
            mov var1, sval(input("nhap vao so thu nhat: "))
            mov var2, sval(input("nhap vao so thu hai: "))
            mov var3, sval(input("nhap vao so thu ba: "))
        ;tinhtong
            print chr$("a + b + c = ")
            mov eax,var1
            mov ebx,var2
            mov ecx,var3
            add eax,ebx
            add eax,ecx
            print str$(eax)
            print chr$(10)

         ;tinhtrungbinh
            mov edx, eax
            mov esi, var4
            div esi
            print str$(edx)
      
        ret
        tongtb endp
;-------------------------------------
end start