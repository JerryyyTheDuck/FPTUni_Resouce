include \masm32\include\masm32rt.inc
sum PROTO :DWORD, :DWORD
.code
start:
   call main
   exit
;<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
main proc
   LOCAL var1:DWORD ; khai bao bien
   LOCAL var2:DWORD
   LOCAL result:DWORD  ; ket qua
   LOCAL COUNT: DWORD  ; tinh so vong
;phan loop

   print chr$("In tong hai so")
   print chr$(10,13)
   mov COUNT, sval(input("Nhap so lan muon cong: "))
   print str$ (COUNT)
   print chr$(" lan", 13,10)


CONTD:
    CMP COUNT, 0
    je STOP
    print chr$("Lan ")
    mov eax, COUNT + 1
    SUB eax, COUNT
    print str$(eax)
    print chr$(":", 13, 18)

;nhap hai so
    mov var1, sval(input("Nhap so thu 1 : "))
    mov var2, sval (input("Nhap so thu 2: "))

; Function tinh tong
    invoke sum, var1,var2
    mov result, eax

; In ket qua
    print chr$("Tong cua no la:")
    print str$(result)
    print chr$(13,10)
    DEC COUNT
    JMP CONTD
STOP:
    ret
main endp
;>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

;function
sum proc v1: DWORD, v2:DWORD
mov eax, v1 ; eax- u1
add eax, v2 ; eax - eax + v2 -> Result in eax
ret
sum endp


end start