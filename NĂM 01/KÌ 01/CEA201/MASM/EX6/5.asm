include \masm32\include\masm32rt.inc     
.code                       
start:                          ; The CODE entry point of the program
    call main                   ; branch to the "main" procedure
    exit
; ллллллллллллллллллллллллллллллллллллллллллллллллллллллл
main proc
    LOCAL n:DWORD                 
    LOCAL t1:DWORD
    LOCAL t2:DWORD

    mov n, sval(input("Enter nth : "))
    mov t1, 1
    mov t2, 1

    CMP n, 1
    je STOP1

    CMP n, 2
    je STOP1

    
    
    COND:
        CMP n, 2
        je STOP2

;<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        mov ebx, 0
        add ebx, t1
        add ebx, t2
        
        xor edx, edx
        mov edx, t2
        mov t1, edx
        
        mov t2, ebx
        
;<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

        DEC n
    JMP COND
    
    STOP2:
        
        print chr$(13, 10)
        print str$(ebx)
        ret

    STOP1:
        print chr$("1")
        ret


main endp
end start 