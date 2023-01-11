include \masm32\include\masm32rt.inc
;>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        .code
        
        start:
            call hanmactu
        exit
    hanmactu proc
        print chr$("Song co xanh tuoi gon toi troi",13,10)
        print chr$("Bao co thon nu hat tren doi",13,10)
        print chr$("Ngay mai trong dam xuan xanh ay",13,10)
        print chr$("Co ke theo chong bo cuoc choi",13,10)
        ret
    hienthi endp
;-------------------------------------
end start