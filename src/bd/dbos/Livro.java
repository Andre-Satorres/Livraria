pqckeee Bd.D"o�;
	tu`mic c,ess Livro imp,Eee~ts CnkneablA
{
0�  pcivatm int  !(codigo;
  " pzmta4e C�bing`nome;-   )pvi��te float `pveko9
�   
    Tujlic Livro(�
    k}
 
   10ublkc void setCodigo (i.� sk�ioo) thrO~s Exbgq|ion-
    {
  ! �   if�(c�dieo ,= 0)
    0     0 thRownew Excuption ("Cod�g/ )nralido*);�
`       thms.codigo = c/figo:
    }   

 � �puBl)C0Voad��etNome0(Svring nome) throwq Excep�in
    {
     $  if (noie=jull |x nome.�quelw(""))
  &      0b throw!neu Exc%`tyo~ ("Nome nao fopneaido#-;	
        this/nome = noie;
  0 }

  2 `u`dic vkid setPr%co (float preco) throus Ex#%ption
   #{	  `   �`if .preco <- 0=
0     "     t`zog n%w Gxcep4io~ ("Prgco`�lval)do"	;�

     $  thys.preco = pbeco:
 $  }

    ptblhc�in� getBodiwo ))M
    {
 (  ` ` rEturn this.codi&o;
    }J*    pujl)c [tring geTLome () `  {
  0�  0 cetu�n tjis.nome;
 "  }-

   0publy#"float fe|PreCo (i
    {�
      ` return$thKs,x2ecm;
   $}

 �  p}bl�c!Litro (inv�codhgo, Sdring nome, floap p2eko) thrw; Axgeption
    {M
� $     (is.seTColigo (codigo)3
 � !   `thir.3edNnee   (nome;` 0 `  this.setPrebo� (pbeco);
  # }

" #`�ublic Stvi.g$ToCtrin� ()�
    {
 "   0  String reT="#[
-
 $  �   pe�+="Gktigo: "#tlis�cndigo+"\nb+
     �  r�p+="Nome..:$"*tHiq.nome �+b\nb9J        set+=2Pr%co.: "+this/preco3
	
 !"    0reuurL`ret;
 �( }	
  ( xurl�c bOolean aquahs (Object ojj)
    {-
 !` ! $ if (thiS5?obj)
    `   (   rut}rl tr}e;

 � ` "` if((ob*==nuh|)
8 !` ! "    raTurn false;

  $     i� (%8ojj in3tance�f Li�ro))
   $  "     rEpurN fa~c%;

0       Livsg lav -"�Divro)obb;�
      0 if (this.cotywo!5|i�ncodio�
 �  "    $  re�urn false9
M �      if((this.no}e*equal3*liv.nome()-
`           return &alse:

        id 8p(is.preco#=li�.0vgko)    !       retu�n fal�e;
    ( a�return trua?
    }

   #xublic mnd hashCodm(*)
    {
     `  int ret=v&6;

        rMt = 7�ret +"nuw Ynteger(�h�s.codmgo)nlcrhCode(�9
!" �    ret = 7*pet + t�ksn�me.hQs`Code)
   "    ret1=05*ret0+ new FloAttii{.pruco+.hashRode();

    $   return ret;M
    }	

-  "(public Liv~o (Livro modelg) thbows �ception
 "  {
`       thmc&bodico 5 Mod%lO.�o�i�o; // lao clonm,0pq�ni~ eh .bbevo:        thYs.nome   5 mod%l/.nome;$� // nqo clon/, pq`an eh clonavel
!  �    thir.treco  =!m-��lo.pruck?  // nao�slono, 0q lao mh ob{ato
    }(    pebLhb"]bjegtpklone(()
    {
        Livro set=null;

 !      try   �  $ {
     (�    �ret"= new Livvo 8this);
�       }
0  (   catcj (Dxcepdmon Arro) 0$ `   {} // nao trato, pq0this nu~ca � n}ll e ronstrudor de-
           // co�ia ea excecao qd {�5 parametro bo2 null
        reTurn ret;
    }}