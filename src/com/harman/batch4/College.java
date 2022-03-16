/**Abstraction with Abstract class*/
package com.harman.batch4;

abstract class College {
   abstract void AcademicFees();

}
class ESE_dept extends College{
    void AcademicFees(){
        System.out.println("100000");
    }
}
class ME_dept extends College{
    void AcademicFees(){
        System.out.println("75000");
    }
}
class CollegeOffice{
    public static void main(String[] args) {
        College ob_ese=new ESE_dept();
        College ob_me=new ME_dept();
        System.out.println("ESE dept fee structure");;
        ob_ese.AcademicFees();
        System.out.println("ME dept fee structure");
        ob_me.AcademicFees();
    }
}